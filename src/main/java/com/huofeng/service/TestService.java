package com.huofeng.service;

import com.huofeng.bean.Test;

import java.util.List;

public interface TestService {
	/**
	 * 查询所有信息
	 * @return
	 */
	public List<Test> findAll();
}
