package com.protal.sale.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.protal.sale.service.IndexService;


@Service
public class IndexServiceImpl implements IndexService {



	@Override
	public String sayHello(String name) {
		System.err.println("服务器端收到来自："+name+"的请求");
		return "connection established";
	}
	


	
}
