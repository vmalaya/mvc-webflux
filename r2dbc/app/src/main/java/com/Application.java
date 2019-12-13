package com;

import com.r2dbc.DatabaseProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@SpringBootApplication
@EnableConfigurationProperties(DatabaseProperties.class)
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
//		UserWebClient gwc = new UserWebClient();
//		System.out.println(gwc.getResult());
	}
}
