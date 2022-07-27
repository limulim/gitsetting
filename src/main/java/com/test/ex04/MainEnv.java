package com.test.ex04;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

	public class MainEnv {

	public static void main(String[]args) throws IOException {
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources propertySources = env.getPropertySources();

	propertySources.addLast(new ResourcePropertySource("classpath:env.properties"));
	
	//env.proprites 파일에서 가져온 정보를 출력
	System.out.println(env.getProperty("env.id"));
	System.out.println(env.getProperty("env.pwd"));
	
	GenericXmlApplicationContext gctx = (GenericXmlApplicationContext)ctx;
	gctx.load("env.xml");
	gctx.refresh();
	
	EnvironmentEX envEx = gctx.getBean("env", EnvironmentEX.class);
	System.out.println("env ID:" + envEx.getId());
	System.out.println("env Pwd:" + envEx.getPwd());
	
	gctx.close();
	ctx.close();
	}
}