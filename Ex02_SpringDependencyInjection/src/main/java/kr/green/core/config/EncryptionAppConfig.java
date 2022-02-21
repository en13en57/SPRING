package kr.green.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.green.core.vo.Encryption;
import kr.green.core.vo.EncryptionApp;
import kr.green.core.vo.MD5Encryption;
import kr.green.core.vo.RSAEncryption;

@Configuration
public class EncryptionAppConfig {

	public Encryption rsaEncryption() {
		return new RSAEncryption();
	}

	public Encryption md5Encryption() {
		return new MD5Encryption();
	}
	// Setter 를 이용한 주입
	@Bean(name = "encryptionApp1")
	public EncryptionApp encryptionApp() {
		EncryptionApp encryptionApp = new EncryptionApp();
		encryptionApp.setEncryption(rsaEncryption());
		return encryptionApp;
	}
	// 생성자를 이용한 주입
	@Bean(name = "encryptionApp2")
	public EncryptionApp encryptionApp2() {
		return new EncryptionApp(md5Encryption());
	}
	
	
	
}
