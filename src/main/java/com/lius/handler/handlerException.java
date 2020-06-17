package com.lius.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages = "com.lius.controllers")
public class handlerException {

	@ExceptionHandler(NullPointerException.class)
	@ResponseBody
	private Map<String,Object> handlerNullPointException(){
		Map<String,Object> map =  new HashMap<>();
		map.put("code", 500);
		map.put("message", "代码错误,空指针异常!");
		return map;
	}
}
