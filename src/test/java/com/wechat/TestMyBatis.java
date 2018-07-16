package com.wechat;


import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.wechat.model.User;
import com.wechat.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
  
public class TestMyBatis {  
    private static Logger logger = Logger.getLogger(TestMyBatis.class);  
//  private ApplicationContext ac = null;  
    @Resource
    private IUserService userService = null;
  
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  
  
    @Test  
    public void test1() {
        User user = userService.getUserById("9");  
        System.out.println(user.getOpenId());  
        logger.info("值："+user.getNickName());  
        logger.info(JSON.toJSONString(user));  
    }
    @Test
    public void test2() {
    	User user = new User();
    	user.setOpenId("123");
    	user.setNickName("5");
    	user.setCountry("china");
    	user.setProvince("beijing");
    	user.setCity("haidian");
    	user.setLanguage("中文");
    	System.out.println(user.getNickName());
    	int user2 = userService.insertOrUpdate(user);
    	logger.info(user2);
    }
}
