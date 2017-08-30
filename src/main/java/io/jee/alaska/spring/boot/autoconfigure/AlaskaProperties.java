package io.jee.alaska.spring.boot.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "alaska")
public class AlaskaProperties {
	
	private Alipay alipay = new Alipay();
	private Mail mail = new Mail();
	private Aliyun aliyun = new Aliyun();
	
	public Alipay getAlipay() {
		return alipay;
	}

	public void setAlipay(Alipay alipay) {
		this.alipay = alipay;
	}
	
	public Mail getMail() {
		return mail;
	}

	public void setMail(Mail mail) {
		this.mail = mail;
	}
	
	public Aliyun getAliyun() {
		return aliyun;
	}

	public void setAliyun(Aliyun aliyun) {
		this.aliyun = aliyun;
	}

	public class Alipay {
		
		private String appId, merchantPrivateKey, alipayPublicKey;
		private boolean sandbox;

		public String getAppId() {
			return appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getMerchantPrivateKey() {
			return merchantPrivateKey;
		}

		public void setMerchantPrivateKey(String merchantPrivateKey) {
			this.merchantPrivateKey = merchantPrivateKey;
		}

		public String getAlipayPublicKey() {
			return alipayPublicKey;
		}

		public void setAlipayPublicKey(String alipayPublicKey) {
			this.alipayPublicKey = alipayPublicKey;
		}

		public boolean isSandbox() {
			return sandbox;
		}

		public void setSandbox(boolean sandbox) {
			this.sandbox = sandbox;
		}
		
	}
	
	public class Mail {
		
		private String personal;

		public String getPersonal() {
			return personal;
		}

		public void setPersonal(String personal) {
			this.personal = personal;
		}
		
	}
	
	public class Aliyun {
		
		private String keyId, keySecret, signName;

		public String getKeyId() {
			return keyId;
		}

		public void setKeyId(String keyId) {
			this.keyId = keyId;
		}

		public String getKeySecret() {
			return keySecret;
		}

		public void setKeySecret(String keySecret) {
			this.keySecret = keySecret;
		}

		public String getSignName() {
			return signName;
		}

		public void setSignName(String signName) {
			this.signName = signName;
		}
	}
	
}
