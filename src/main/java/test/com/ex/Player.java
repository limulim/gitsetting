package test.com.ex;

	import java.util.ArrayList;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

	public class Player implements InitializingBean, DisposableBean{
		private String name;
		private int age;
		public Player(){} // 기본생성자
		
		public Player(String name, int age){
			this.name = name;
			this.age = age;
		}//인자생성자

		public String getName() {
			return name;
		}


		public int getAge() {
			return age;
		}
		
		@Override
		public void afterPropertiesSet() throws Exception{
			System.out.println("빈의 생성시 처리할 명령");
		}
	
		@Override		
		public void destroy() throws Exception{
			System.out.println("빈 소멸시 처리할 명령");
		}
	}

