package web.taxcoconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class WebTaxcoConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebTaxcoConfigApplication.class, args);
	}

}
