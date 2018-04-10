/**
 * 
 */
package com.raj.school.config;

import java.io.IOException;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

/**
 * @author rajeev.jha
 *
 */

@Configuration
public class AppConfig {

	@Value("classpath:dozer-bean-mappings.xml")
	private Resource mappingFile;
	
	@Bean
	public DozerBeanMapper dozerBean() throws IOException{
		DozerBeanMapper beanMapper = new DozerBeanMapper();
		beanMapper.addMapping(mappingFile.getInputStream());
		return beanMapper;
	}

}
