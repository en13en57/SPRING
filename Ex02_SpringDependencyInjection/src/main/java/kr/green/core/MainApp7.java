package kr.green.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import kr.green.core.config.EncryptionAppConfig;
import kr.green.core.vo.EncryptionApp;

public class MainApp7 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(EncryptionAppConfig.class);
		
		EncryptionApp encryptionApp1 = context.getBean("encryptionApp1", EncryptionApp.class);
		encryptionApp1.encryption();

		EncryptionApp encryptionApp2 = context.getBean("encryptionApp2", EncryptionApp.class);
		encryptionApp2.encryption();
		
		context.close();
	}
}
