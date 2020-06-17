package com.lius.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class testExceptionColtroller {

	@RequestMapping("/nullException")
	public String nullException() {
		//触发空指针异常
		throw new NullPointerException("空指针异常!");
	}
}
