package com.protal.sale.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.protal.sale.bean.T_MALL_USER_ACCOUNT;
import com.protal.sale.mapper.UserVerifyMapper;
import com.protal.sale.service.UserVerifyService;

@Service
public class UserVerifyServiceIpml implements UserVerifyService{

	@Autowired
	private UserVerifyMapper userVerifyMapper;
	
	public T_MALL_USER_ACCOUNT get_login_user(T_MALL_USER_ACCOUNT user) {
		return userVerifyMapper.get_login_user(user);
	}
	
	
}
