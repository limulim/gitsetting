package com.test.ex06;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainProfile {

	public static void main(String[] args) {
		String profile = null;
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		
		if(str.equals("develop")) {
			profile ="develop";
			
		}else if(str.equals("service")) {
			profile="service";
			
			
		}
	scanner.close();
	
	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
	ctx.getEnvironment().setActiveProfiles(profile);
	ctx.load("dev.xml", "service.xml");
	
	ProfileEx prof = ctx.getBean("profileEx", ProfileEx.class);
	System.out.println("ip : " + prof.getIp());
	System.out.println("port : " + prof.getPort());

	ctx.close();
	}
}
