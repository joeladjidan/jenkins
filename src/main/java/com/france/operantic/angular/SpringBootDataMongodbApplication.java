package com.france.operantic.angular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootDataMongodbApplication  extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataMongodbApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootDataMongodbApplication.class);
    }

}

