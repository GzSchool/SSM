package com.wechat.dao;

import com.wechat.model.icards;

public interface icardsDao {

	icards selectByOpenIdFromIcards(String id);
	icards selectByOpenGidFromIcards(String id);
	int insertIntoIcards(icards icards);
	int deleteFromIcards(String openId);
	icards updateToIcardsByOpenId(String openId);
	icards updateToIcardsByOpenGid(String openGid);
	int insertOrUpdateToIcards(icards icards);
}
