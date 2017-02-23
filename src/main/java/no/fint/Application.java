package no.fint;

import com.github.springfox.loader.EnableSpringfox;
import io.swagger.annotations.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSpringfox(@Info(title = "RelTest", version = "1.0.0"))
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
