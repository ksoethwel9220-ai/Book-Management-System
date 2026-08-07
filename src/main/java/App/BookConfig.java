package App;


import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {
	@Bean
	CommandLineRunner commandLineRunner(BookRepository bookRepository) {
		return args ->{
			if(bookRepository.count() == 0) {
				Books Juu = new Books(
			                "Missing You Even While Together",
			                15000.0,
			                1L
			            );
				Books PoneNyaKhin = new Books(
						 "Taung Tan Tway Yah A Lwon",
			                15000.0,
			                1L
						);
				bookRepository.saveAll(List.of(Juu,PoneNyaKhin));
			}
		};
				
	}
}
