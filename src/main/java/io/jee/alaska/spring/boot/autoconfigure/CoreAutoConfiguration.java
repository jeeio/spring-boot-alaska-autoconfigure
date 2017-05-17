package io.jee.alaska.spring.boot.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.jee.alaska.httpclient.DefaultHttpClientHelper;
import io.jee.alaska.httpclient.HttpClientHelper;

@Configuration
public class CoreAutoConfiguration {
	
	@Bean
	@ConditionalOnClass(HttpClientHelper.class)
	@ConditionalOnMissingBean
	public HttpClientHelper httpClientHelper(){
		return new DefaultHttpClientHelper();
	}

}
