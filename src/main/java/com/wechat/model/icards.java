package com.wechat.model;

public class icards {

	private String openId;        //用户Id
	private String openGid;      //群id
	private String job;			  //行业
	private String company;			//公司
	private String telephone;		//手机号
	private String wechatnumber;	//微信号
	private String need;			//需求
	private String text;			//简介
	private int inum;				//更改名片次数
	public String getOpenId() {
		return openId;
	}
	public int getInum() {
		return inum;
	}
	public void setInum(int inum) {
		this.inum = inum;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenGid() {
		return openGid;
	}
	@Override
	public String toString() {
		return "icards [openId=" + openId + ", openGid=" + openGid + ", job=" + job + ", company=" + company
				+ ", telephone=" + telephone + ", wechatnumber=" + wechatnumber + ", need=" + need + ", text=" + text
				+ ", inum=" + inum + "]";
	}
	public void setOpenGid(String openGid) {
		this.openGid = openGid;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getWechatnumber() {
		return wechatnumber;
	}
	public void setWechatnumber(String wechatnumber) {
		this.wechatnumber = wechatnumber;
	}
	public String getNeed() {
		return need;
	}
	public void setNeed(String need) {
		this.need = need;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
