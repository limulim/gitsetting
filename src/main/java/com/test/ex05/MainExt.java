package com.test.ex05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainExt {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:ext.xml");
	ExternalFileEx ext = ctx.getBean("externalFileEx", ExternalFileEx.class);
	
	System.out.println("env.id:" + ext.getId());
	System.out.println("env.pwd:" + ext.getExtPwd());
	System.out.println("ext.id:" + ext.getExtId());
	System.out.println("ext.pwd:" + ext.getExtPwd());
	
	ctx.close();
	
	}

}
