package com.hx.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author @DT人 2017年7月26日 下午10:24:46
 *
 */
@Controller // 控制器注解的标示
public class HelloWorldController {
	
	@RequestMapping(value="/hello",method=RequestMethod.GET) //要想访问hello这个方法就加上这个注解
	public String hello() {
		return "hello";
	}
}
