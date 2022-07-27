package com.test.ex05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainExt2 {
	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ExtConfig.class);
	ExternalFileEx ext = ctx.getBean("extConf" , ExternalFileEx.class);
		
		
		System.out.println("envId: " + ext.getId());
		System.out.println("envPwd: " + ext.getPwd());
		System.out.println("extId: " + ext.getExtId());
		System.out.println("extpwd: " + ext.getExtPwd());
	
		ctx.close();
	}
}
