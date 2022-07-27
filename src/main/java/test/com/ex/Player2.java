package test.com.ex;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.processing.*;

public class Player2 {
	private String name;
	private int age;
	
	public Player2(){} // 기본생성자
	
	public Player2(String name, int age){
		this.name = name;
		this.age = age;
	}//인자생성자

	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}

	@PostConstruct
	public void init() {
		System.out.println("빈 생성시 처리해야 할 작업");
	}

	@PreDestroy
	public void destory() {
	System.out.println("빈 소멸시 처리해야 할 작업");
}
}
