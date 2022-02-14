package kr.green.core;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.green.core.vo.EncryptionApp;
import kr.green.core.vo.EncryptionMessaging;

public class MainApp8 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("appConfig4.xml");
		
		EncryptionMessaging encryptionMessaging1 = context.getBean("encryptionMessaging1",EncryptionMessaging.class);
		encryptionMessaging1.getEncryption().EncryptData();
		encryptionMessaging1.getMessaging().SendMessage();
		System.out.println();
		
		EncryptionMessaging encryptionMessaging2 = context.getBean("encryptionMessaging2",EncryptionMessaging.class);
		encryptionMessaging2.getEncryption().EncryptData();
		encryptionMessaging2.getMessaging().SendMessage();
		System.out.println();

		EncryptionMessaging encryptionMessaging3 = context.getBean("encryptionMessaging3",EncryptionMessaging.class);
		encryptionMessaging3.getEncryption().EncryptData();
		encryptionMessaging3.getMessaging().SendMessage();
		System.out.println();

		EncryptionMessaging encryptionMessaging4 = context.getBean("encryptionMessaging3",EncryptionMessaging.class);
		encryptionMessaging4.getEncryption().EncryptData();
		encryptionMessaging4.getMessaging().SendMessage();
		System.out.println();
		
		context.close();
	}
}
