package kr.green.boot.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import kr.green.boot.config.AppConfig;
import kr.green.boot.service.MailService;

public class MailApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MailService mailService = context.getBean("mailService", MailService.class);
		
		mailService.sendEmail();
		mailService.sendEmail("en3en7@naver.com", "ㅎㅎㅎ", "내용");
		context.close();
	}
}
