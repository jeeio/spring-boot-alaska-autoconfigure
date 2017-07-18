package io.jee.alaska.spring.boot.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "alaska")
public class AlaskaProperties {
	
	private Alipay alipay = new Alipay();
	private Mail mail = new Mail();
	
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

	public class Alipay {
		
		private String partner, key;

		public String getPartner() {
			return partner;
		}

		public void setPartner(String partner) {
			this.partner = partner;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
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
	
}
