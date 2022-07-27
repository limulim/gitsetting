package com.test.ex06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("develop")
public class DevConfig {
 @Bean
 public ProfileEx profileEx() {
	 ProfileEx prof = new ProfileEx();
	 prof.setIp("localhost");
	 prof.setPort("9090");
	 return prof;
 }
	
}
