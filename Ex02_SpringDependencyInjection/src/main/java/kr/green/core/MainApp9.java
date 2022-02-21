package kr.green.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import kr.green.core.config.EncryptionMessagingConfig;
import kr.green.core.vo.EncryptionMessaging;

public class MainApp9 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(EncryptionMessagingConfig.class);
		
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

		EncryptionMessaging encryptionMessaging4 = context.getBean("encryptionMessaging4",EncryptionMessaging.class);
		encryptionMessaging4.getEncryption().EncryptData();
		encryptionMessaging4.getMessaging().SendMessage();
		System.out.println();
		
		context.close();
	}
}
