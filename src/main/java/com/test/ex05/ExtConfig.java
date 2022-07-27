package com.test.ex05;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class ExtConfig {
	
	@Value("${env.Id}")
	private String envId;
	@Value("${env.pwd}")
	private String envPwd;
	@Value("${ext.Id}")
	private String extId;
	@Value("${ext.Pwd}")
	private String extPwd;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer Properties() {
	 //프로퍼티 파일의 위치값을 저장하는 객체
		PropertySourcesPlaceholderConfigurer configuere = new PropertySourcesPlaceholderConfigurer();
	 
	 Resource[] locations = new Resource[2];
	 locations[0] = new ClassPathResource("env.properties");
	 locations[1] = new ClassPathResource("external.properties");
	 configuere.setLocations(locations);
	
	return configuere;
	 
	}//Properties()

	@Bean
	public ExternalFileEx extConf() {
		ExternalFileEx ext = new ExternalFileEx();
		ext.setId(envId);
		ext.setPwd(envPwd);
		ext.setExtId(extPwd);
		ext.setExtPwd(extPwd);
	
		return ext;
	}
	
 }
