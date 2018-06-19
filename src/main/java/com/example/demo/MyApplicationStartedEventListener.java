package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

public  class MyApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent> {

    private Logger logger=LoggerFactory.getLogger(MyApplicationStartedEventListener.class);
	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		// TODO Auto-generated method stub
		SpringApplication app=event.getSpringApplication();
		Banner banner = null;
		app.setBanner(banner);;
		logger.info("==MyApplicationStartenEventListener==");
	}

}
