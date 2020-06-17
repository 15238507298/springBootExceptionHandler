package com.lius.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * <p>处理404等error错误</p>
 * @author lius
 *
 */
@Controller
public class errorController implements ErrorController {

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "/error";
	}
	
	@RequestMapping("/error")
	@ResponseBody
	public Map<String,Object> handlerError(){
		Map<String,Object> errMap = new HashMap<>();
		errMap.put("code", 404);
		errMap.put("message", "404页面未找到!");
		return errMap;
	}

}
