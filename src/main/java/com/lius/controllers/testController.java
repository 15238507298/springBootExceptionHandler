package com.lius.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>测试Controller类</p>
 * @author lius
 *
 */
@RestController  //@Controller+@ResponseBody
public class testController {

	//测试接口
	@RequestMapping("/test")
	public String gradleController() {
		
		return String.format("<h1><center style=\"color:red;font-style:italic;\">%s</center></h1>",
				"Welcome to use SpringBoot of Gradle!");
	}
}
