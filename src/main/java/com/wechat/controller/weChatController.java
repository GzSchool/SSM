package com.wechat.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.model.User;
import com.wechat.model.icards;
import com.wechat.model.usermessage;
import com.wechat.service.weChatService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/wechat")
public class weChatController {
	@Resource
	private weChatService weChatService;
	
	public static String GETlogin(String u) {
        String result = "";
        BufferedReader in = null;

        try {

            URL realUrl = new URL(u);
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.connect();

            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }

            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求失败");
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();

                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return result;

    }
	@ResponseBody
    @RequestMapping(value="/login",method=RequestMethod.GET)
    public Map<String, String> addr_getList(String encryptedData, String iv, String code,String nickName,String country,String province,String city,String language) {

    	System.out.println("111111111");
        Map map = new HashMap<>();

        if (code == null || code.length() == 0) {

            map.put("status", 0);
            map.put("msg", "code是空的");
            // System.out.println("code" + code);
            return map;
        }

        System.out.println(code);
        String wxappid = "wx34fefa15f676d944";
        String wxSecret = "f4ce303b50267dc17dc69ae083ae3a98";
        String grant_type = "authorization_code";

        String u = "https://api.weixin.qq.com/sns/jscode2session?" + "appid=" + wxappid + "&secret=" + wxSecret
                + "&js_code=" + code + "&grant_type=" + grant_type;
        ;
        String s = GETlogin(u);
            //将这个拼接出来的url打印出来看一下
        System.out.println(u);
        System.out.println(s);

        JSONObject json = JSONObject.fromObject(s);

        System.out.println("这里是openid和session_key" + json);
        String session_key = (String) json.get("session_key");
        String openid = (String) json.get("openid");
        usermessage user = new usermessage();
        user.setOpenId(openid);
        user.setCountry(country);
        user.setProvince(province);
        user.setCity(city);
        user.setNickName(nickName);
        user.setLanguage(language);
        int S= weChatService.insertOrUpdateToUserMassage(user);
        try {
            System.out.println("进入解密成功程序");
            String result = AesCbcUtil.decrypt(encryptedData, session_key, iv, "utf-8");
            //JSONObject jsonObject = JSONObject.fromObject(result);
            System.out.println(result.length()+"wdsaxsadsadsadsa");
             if (null != result && result.length() > 0) {
                map.put("status", 1);
                map.put("openId",openid);
                HashMap userinfo = new HashMap<>();
                userinfo.put("openid", json.get("openid"));
                userinfo.put("session_key", json.get("session_key"));
                map.put("userInfo", userinfo);
            }
             System.out.println(map);

        } catch (Exception e) {
        	System.out.println(e.getMessage());
            System.out.println("解密失败");
        }
        JSONObject json1 = JSONObject.fromObject(map);
        System.out.println(map);
        System.out.println(json1);
        return map;

    }
	@ResponseBody
	@RequestMapping(value="/selectByOpenIdFromIcards",method=RequestMethod.GET)
	public Map<String, String> selectByOpenIdFromIcards(String openId){
		Map map = new HashMap<>();
		icards icards = weChatService.selectByOpenIdFromIcards(openId);
		map.put("openId", icards.getOpenId());
		map.put("name", icards.getWechatnumber());
		return map;
	}
	
}
