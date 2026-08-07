package App;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"App","Controller"})
public class HomeApplication{
	public static void main(String[] args) {
		SpringApplication.run(HomeApplication.class, args);
	}
}
