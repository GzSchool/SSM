package com.wechat.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wechat.dao.icardsDao;
import com.wechat.dao.qunDao;
import com.wechat.dao.usermessageDao;
import com.wechat.model.icards;
import com.wechat.model.qun;
import com.wechat.model.usermessage;
import com.wechat.service.weChatService;

@Service("weChatService")
public class weChatServiceImpl implements weChatService{
	@Resource
	private qunDao qundao;
	@Resource
	private icardsDao icardsdao;
	@Resource
	private usermessageDao usermessagedao;

	@Override
	public icards selectByOpenIdFromIcards(String id) {
		// TODO Auto-generated method stub
		return this.icardsdao.selectByOpenIdFromIcards(id);
	}

	@Override
	public icards selectByOpenGidFromIcards(String id) {
		// TODO Auto-generated method stub
		return this.icardsdao.selectByOpenGidFromIcards(id);
	}

	@Override
	public int insertIntoIcards(icards icards) {
		// TODO Auto-generated method stub
		return this.icardsdao.insertIntoIcards(icards);
	}

	@Override
	public int deleteFromIcards(String openId) {
		// TODO Auto-generated method stub
		return this.icardsdao.deleteFromIcards(openId);
	}

	@Override
	public icards updateToIcardsByOpenId(String openId) {
		// TODO Auto-generated method stub
		return icardsdao.updateToIcardsByOpenId(openId);
	}

	@Override
	public icards updateToIcardsByOpenGid(String openGid) {
		// TODO Auto-generated method stub
		return icardsdao.updateToIcardsByOpenGid(openGid);
	}

	@Override
	public int insertOrUpdateToIcards(icards icards) {
		// TODO Auto-generated method stub
		return icardsdao.insertOrUpdateToIcards(icards);
	}

	@Override
	public qun selectByIdFromQun(String openGid) {
		// TODO Auto-generated method stub
		return qundao.selectByIdFromQun(openGid);
	}

	@Override
	public int insertIntoQun(qun qun) {
		// TODO Auto-generated method stub
		return qundao.insertIntoQun(qun);
	}

	@Override
	public int deleteFromQun(String id) {
		// TODO Auto-generated method stub
		return qundao.deleteFromQun(id);
	}

	@Override
	public qun updateToQun(String openid) {
		// TODO Auto-generated method stub
		return qundao.updateToQun(openid);
	}

	@Override
	public int insertOrUpdateToQun(qun qun) {
		// TODO Auto-generated method stub
		return qundao.insertOrUpdateToQun(qun);
	}

	@Override
	public usermessage selectByIdFromUserMessage(String openid) {
		// TODO Auto-generated method stub
		return usermessagedao.selectByIdFromUserMessage(openid);
	}

	@Override
	public int insertIntoUserMessage(usermessage usermessage) {
		// TODO Auto-generated method stub
		return usermessagedao.insertIntoUserMessage(usermessage);
	}

	@Override
	public int deleteFromUserMessage(String openId) {
		// TODO Auto-generated method stub
		return usermessagedao.deleteFromUserMessage(openId);
	}

	@Override
	public usermessage updateToUserMessage(String openId) {
		// TODO Auto-generated method stub
		return usermessagedao.updateToUserMessage(openId);
	}

	@Override
	public int insertOrUpdateToUserMassage(usermessage usermessage) {
		// TODO Auto-generated method stub
		return usermessagedao.insertOrUpdateToUserMassage(usermessage);
	}

	
}
