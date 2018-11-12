package com.huofeng.serviceImpl;

import com.huofeng.bean.Test;
import com.huofeng.dao.TestDao;
import com.huofeng.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService{
	@Autowired
	private TestDao TestDao;

	@Override
	public List<Test> findAll() {
		try {
			return TestDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
