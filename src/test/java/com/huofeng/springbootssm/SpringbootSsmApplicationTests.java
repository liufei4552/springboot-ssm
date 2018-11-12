package com.huofeng.springbootssm;

import com.huofeng.dao.TestDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootSsmApplicationTests {
	@Resource
	private TestDao TestDao;
	@Test
	public void contextLoads() {
		List<com.huofeng.bean.Test>list=TestDao.findAll();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
