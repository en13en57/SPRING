package kr.green.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.green.core.vo.Application;
import kr.green.core.vo.ApplicationUser;

@Configuration
public class ApplicationConfig {
	@Bean("applicationUser")
	public ApplicationUser getappApplicationUser() {
		return new ApplicationUser("최고 관리자");
	}
	
	@Bean("application")
	public Application getapplApplication() {
		return new Application(getappApplicationUser());
	}
}
