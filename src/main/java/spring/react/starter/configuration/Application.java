package spring.react.starter.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

//@EntityScan("spring.jpa.rest.model")
//@EnableJpaRepositories("spring.jpa.rest.repository")
@ComponentScan("spring.react.starter.controller")
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
