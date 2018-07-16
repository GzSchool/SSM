package com.wechat.model;

public class qun {

	private String openId;			//用户id
	private String openGid;			//群id
	private String qunname;			//群名称
	private String qunImage;		//群头像
	private int qnum;				//群信息更改次数
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenGid() {
		return openGid;
	}
	public void setOpenGid(String openGid) {
		this.openGid = openGid;
	}
	public int getQnum() {
		return qnum;
	}
	public void setQnum(int qnum) {
		this.qnum = qnum;
	}
	public String getQunname() {
		return qunname;
	}
	public void setQunname(String qunname) {
		this.qunname = qunname;
	}
	public String getQunImage() {
		return qunImage;
	}
	public void setQunImage(String qunImage) {
		this.qunImage = qunImage;
	}
	@Override
	public String toString() {
		return "qun [openId=" + openId + ", openGid=" + openGid + ", qunname=" + qunname + ", qunImage=" + qunImage
				+ ", qnum=" + qnum + "]";
	}
	
}
