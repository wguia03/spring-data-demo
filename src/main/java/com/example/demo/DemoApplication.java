package com.example.demo;

import com.example.demo.models.Author;
import com.example.demo.repositories.AuthorRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository authorRepository){
		return args -> {

			var faker = new Faker();

			for (int i = 0; i < 50; i++) {
				var myAuthor = Author.builder()
						.firstName(faker.name().firstName())
						.lastName(faker.name().lastName())
						.email(faker.name().username()+"@gmail.com")
						.age(faker.number().numberBetween(20, 50))
						.build();
				authorRepository.save(myAuthor);
			}
		};
	}
}
