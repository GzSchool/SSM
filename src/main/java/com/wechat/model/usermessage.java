package com.wechat.model;

public class usermessage {
	private String openId;          //用户id
	private String nickName;		//名称
	private String country;			//国家
	private String province;		//省份
	private String city;			//城市
	private String language;		//语言
	private String avaterurl;		//头像地址
	public int getUnum() {
		return unum;
	}
	public void setUnum(int unum) {
		this.unum = unum;
	}
	private int unum;				//用户信息更改次数
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getAvaterurl() {
		return avaterurl;
	}
	public void setAvaterurl(String avaterurl) {
		this.avaterurl = avaterurl;
	}
	@Override
	public String toString() {
		return "usermessage [openId=" + openId + ", nickName=" + nickName + ", country=" + country + ", province="
				+ province + ", city=" + city + ", language=" + language + ", avaterurl=" + avaterurl + ", unum=" + unum
				+ "]";
	}
	

}
