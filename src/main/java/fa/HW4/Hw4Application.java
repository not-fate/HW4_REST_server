package fa.HW4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "fa.HW4")
public class Hw4Application {

	public static void main(String[] args) {
		SpringApplication.run(Hw4Application.class, args);
	}
}
