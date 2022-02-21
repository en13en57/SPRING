package kr.green.core;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.green.core.vo.EncryptionApp;

public class MainApp6 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("appConfig3.xml");
		
		EncryptionApp encryptionApp1 = context.getBean("encryptionApp1", EncryptionApp.class);
		encryptionApp1.encryption();

		EncryptionApp encryptionApp2 = context.getBean("encryptionApp2", EncryptionApp.class);
		encryptionApp2.encryption();
		
		context.close();
	}
}

