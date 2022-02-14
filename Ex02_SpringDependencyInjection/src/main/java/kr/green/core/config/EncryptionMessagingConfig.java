package kr.green.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.green.core.vo.ActiveMQMessaging;
import kr.green.core.vo.Encryption;
import kr.green.core.vo.EncryptionMessaging;
import kr.green.core.vo.MD5Encryption;
import kr.green.core.vo.Messaging;

@Configuration
public class EncryptionMessagingConfig {

	public Encryption md5Encryption() {
		return new MD5Encryption();
	}
	
	public Messaging mqMessaging() {
		return new ActiveMQMessaging();
	}
	
	@Bean("encryptionMessaging1") // Setter만을 이용한 주입
	public EncryptionMessaging encryptionMessaging1() {
		EncryptionMessaging encryptionMessaging = new EncryptionMessaging();
		encryptionMessaging.setEncryption(md5Encryption());
		encryptionMessaging.setMessaging(mqMessaging());
		return encryptionMessaging;
	}
	@Bean("encryptionMessaging2") // 생성자만을 이용한 주입
	public EncryptionMessaging encryptionMessaging2() {
		EncryptionMessaging encryptionMessaging = new EncryptionMessaging(mqMessaging(),md5Encryption());
		return encryptionMessaging;
	}
	@Bean("encryptionMessaging3") // 생성자와 Setter만을 이용한 주입
	public EncryptionMessaging encryptionMessaging3() {
		EncryptionMessaging encryptionMessaging = new EncryptionMessaging(mqMessaging());
		encryptionMessaging.setEncryption(md5Encryption());
		return encryptionMessaging;
		}
	@Bean("encryptionMessaging4") // 생성자와 Setter만을 이용한 주입
	public EncryptionMessaging encryptionMessaging4() {
		EncryptionMessaging encryptionMessaging = new EncryptionMessaging(md5Encryption());
		encryptionMessaging.setMessaging(mqMessaging());
		return encryptionMessaging;
	}
}
