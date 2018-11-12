package com.huofeng.dao;

import com.huofeng.bean.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("TestDao")
public interface TestDao {
	/**
	 * 查询所有信息
	 * @return
	 */
	public List<Test> findAll();
}
