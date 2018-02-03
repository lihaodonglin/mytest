package cn.itcast.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"cn.itcast.springboot"})  //该类代表 spring boot 的引导类
public class Application {
	

	public static void main(String[] args) {
		//运行 spring Boot 应用
		SpringApplication.run(Application.class, args);
		
//		//第二种方式 运行 spring boot 应用
//		SpringApplication springApplication = new SpringApplication(Application.class);
//		//设置关闭 Banner 横幅
//		springApplication.setBannerMode(Mode.OFF);
//		//运行
//		springApplication.run(args);
	}

}