package com.wechat.dao;

import com.wechat.model.qun;

public interface qunDao {

	qun selectByIdFromQun(String openGid);
	int insertIntoQun(qun qun);
	int deleteFromQun(String id);
	qun updateToQun(String openid);
	int insertOrUpdateToQun(qun qun);
}
