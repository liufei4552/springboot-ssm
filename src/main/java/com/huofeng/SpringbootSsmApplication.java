package com.huofeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
@MapperScan("com.huofeng.dao")
@EnableTransactionManagement//开启事务管理
public class SpringbootSsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSsmApplication.class, args);
	}
}
