package com.st.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//标识该接口返回的类型都是json

@RestController
public class HelloWorld {

	@RequestMapping("/index")
	public String index() {
		int i = 1/0;
		return "success";
	}

	@RequestMapping("/getMap")
	public Map<String, Object> getMap() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("errorCODE", "200");
		result.put("errMsg", "成功");
		return result;
	}


}
