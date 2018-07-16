package com.wechat.service;

import com.wechat.model.icards;
import com.wechat.model.qun;
import com.wechat.model.usermessage;

public interface weChatService {
	public icards selectByOpenIdFromIcards(String id);
	public icards selectByOpenGidFromIcards(String id);
	public int insertIntoIcards(icards icards);
	public int deleteFromIcards(String openId);
	public icards updateToIcardsByOpenId(String openId);
	public icards updateToIcardsByOpenGid(String openGid);
	public int insertOrUpdateToIcards(icards icards);
	public qun selectByIdFromQun(String openGid);
	public int insertIntoQun(qun qun);
	public int deleteFromQun(String id);
	public qun updateToQun(String openid);
	public int insertOrUpdateToQun(qun qun);
	public usermessage selectByIdFromUserMessage(String openid);
	public int insertIntoUserMessage(usermessage usermessage);
	public int deleteFromUserMessage(String openId);
	public usermessage updateToUserMessage(String openId);
	public int insertOrUpdateToUserMassage(usermessage usermessage);
}
