package com.drp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drp.service.TestService;
import com.drp.service.dao.TestDAO;

@Service("testService")
public class TestServiceImpl implements TestService{

	@Autowired
	private TestDAO boardMapper;
	
	@Override
	public String dbConnectTest() throws Exception {
		System.out.println("dbConnecTest");
		return boardMapper.dbConnectTest();
	}

}
