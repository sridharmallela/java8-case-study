package com.fmr.java8.case_study;

import com.fmr.java8.case_study.dao.TraderRepository;
import com.fmr.java8.case_study.domain.Trader;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public CommandLineRunner demo(TraderRepository repository) {
        return (args) -> {
            // save a few customers
            repository.save(new Trader("Jack", "Bauer"));
            repository.save(new Trader("Chloe", "O'Brian"));
            repository.save(new Trader("Kim", "Bauer"));
        };
    }
}
