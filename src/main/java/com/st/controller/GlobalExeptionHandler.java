package com.st.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//全局捕获异常
@ControllerAdvice
public class GlobalExeptionHandler {
	
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String, Object> resultError(){
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("errorCODE", "500");
		result.put("errorMsg", "错误");
		return result;
	}
}
