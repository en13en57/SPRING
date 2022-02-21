package kr.green.boot.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.green.boot.service.MailService;

public class MailApp2 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
		
		MailService mailService = context.getBean("mailService", MailService.class);
		
		mailService.sendEmail();
		mailService.sendEmail("en3en7@naver.com", "ㅎㅎㅎ", "내용");
		context.close();
		
	}
}
