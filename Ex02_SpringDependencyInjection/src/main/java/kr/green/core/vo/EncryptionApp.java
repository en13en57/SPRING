package kr.green.core.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EncryptionApp {
	private Encryption encryption;
	
	public void encryption() {
		encryption.EncryptData();
	}
}
