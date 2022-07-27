package com.test.ex06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("service")
public class SvcConfig {

	@Bean
	public ProfileEx profileEx() {
		ProfileEx prof = new ProfileEx();
		prof.setIp("201.168.172.200");
		prof.setPort("80");
		return prof;
	}
}
