package cn.itcast.springboot.service.impl;

import org.springframework.stereotype.Service;

import cn.itcast.springboot.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public void say() {
		System.out.println("=========say=========");
	}

}
