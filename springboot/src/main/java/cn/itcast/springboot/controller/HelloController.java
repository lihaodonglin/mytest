package cn.itcast.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.springboot.service.UserService;

@RestController
public class HelloController {
	
	@Autowired
	private UserService userService;
	/** 一次性加载属性文件 */
	@Autowired
	private Environment environment; 
	/** 单个属性注入 */
	@Value("${name}")
	private String name;
	@Value("${url}")
	private String url;
	
	
	@GetMapping("/hello")
	public String hello(){
		
		System.out.println("name:" + environment.getProperty("name"));
		System.out.println("url:" + environment.getProperty("url"));
		System.out.println(name + "\t" + url);
		userService.say();
		return "Hello SpringBoot";
	}
}
