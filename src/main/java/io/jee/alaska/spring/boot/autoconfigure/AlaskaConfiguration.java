package io.jee.alaska.spring.boot.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.jee.alaska.alibaba.alipay.AlipayService;
import io.jee.alaska.alibaba.alipay.AlipayServiceImpl;
import io.jee.alaska.email.EmailSenderHandler;
import io.jee.alaska.email.SimpleEmailSenderHandler;
import io.jee.alaska.httpclient.DefaultHttpClientHelper;
import io.jee.alaska.httpclient.HttpClientHelper;

@Configuration
@EnableConfigurationProperties(AlaskaProperties.class)
public class AlaskaConfiguration {
	
	private AlaskaProperties properties;
	
	public AlaskaConfiguration(AlaskaProperties properties) {
		this.properties = properties;
	}

	@Bean
	@ConditionalOnClass(HttpClientHelper.class)
	@ConditionalOnMissingBean
	public HttpClientHelper httpClientHelper(){
		return new DefaultHttpClientHelper();
	}
	
	@Bean
	@ConditionalOnProperty(prefix = "alaska.alipay", name = "partner")
	@ConditionalOnMissingBean
	public AlipayService alipayService(){
		return new AlipayServiceImpl(properties.getAlipay().getPartner(), properties.getAlipay().getKey());
	}
	
	@Bean
	@ConditionalOnProperty(prefix = "alaska.mail", name = "personal")
	@ConditionalOnMissingBean
	public EmailSenderHandler emailSenderHandler(){
		return new SimpleEmailSenderHandler(properties.getMail().getPersonal());
	}

}
