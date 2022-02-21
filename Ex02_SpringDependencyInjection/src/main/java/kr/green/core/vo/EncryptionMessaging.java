package kr.green.core.vo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class EncryptionMessaging {
	private Messaging messaging;
	private Encryption encryption;

	public EncryptionMessaging() {
	}
	
	public EncryptionMessaging(Messaging messaging) {
		this.messaging = messaging;
	}
	
	public EncryptionMessaging(Encryption encryption) {
		this.encryption = encryption;
	}
	
	public EncryptionMessaging(Messaging messaging, Encryption encryption) {
		this.messaging = messaging;
		this.encryption = encryption;
	}
	
	
	
}
