package com.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

	@Configuration
	public class MVCConfiguration implements WebMvcConfigurer{
	    @Bean
	    public ViewResolver getViewResolver() {
	        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	        resolver.setPrefix("/templates/");
	        resolver.setSuffix(".html");
	        return resolver;
	    }


	    @Override
	    public Validator getValidator() {
	        return validator();
	    }

	    @Bean
	    public LocalValidatorFactoryBean validator() {
	        LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
	        validator.setValidationMessageSource(messageSource());
	        return validator;
	    }

	    private MessageSource messageSource() {
	        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
	        //プロパティファイルの名前やディレクトリも変更可能
	        messageSource.setBasename("classpath:/ValidationMessages");
	        //UTF-8に設定
	        messageSource.setDefaultEncoding("UTF-8");
	        return messageSource;
	    }



	}

