package com.huofeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping(value = "login")
	public String login(){
		return "login";
	}
	@RequestMapping(value = "index")
	public String index(){
		return "index";
	}
}
