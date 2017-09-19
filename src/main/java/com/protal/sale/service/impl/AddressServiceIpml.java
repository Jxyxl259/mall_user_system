package com.protal.sale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.protal.sale.bean.T_Mall_Address;
import com.protal.sale.mapper.AddressMapper;
import com.protal.sale.mapper.UserVerifyMapper;
import com.protal.sale.service.AddressService;

@Service
public class AddressServiceIpml implements AddressService{

	@Autowired
	private AddressMapper addressMapper;

	public List<T_Mall_Address> get_user_address(int user_id){
		return addressMapper.select_user_address_by_user_id(user_id);
	}
	
}
