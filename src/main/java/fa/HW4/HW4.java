package fa.HW4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "fa.HW4")
public class HW4 {
	public static void main(String[] args) {
		SpringApplication.run(HW4.class, args);
	}
}
