package com.wechat.dao;
import com.wechat.model.usermessage;

public interface usermessageDao {
	usermessage selectByIdFromUserMessage(String openid);
	int insertIntoUserMessage(usermessage usermessage);
	int deleteFromUserMessage(String openId);
	usermessage updateToUserMessage(String openId);
	int insertOrUpdateToUserMassage(usermessage usermessage);

}
