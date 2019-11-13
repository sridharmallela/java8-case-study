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
            repository.save(new Trader("Sowmya", "Rangarajan", "123456@gmail.com", "1234567890"));
            repository.save(new Trader("Jaime", "Moncayo","123456@gmail.com", "1234567890"));
            repository.save(new Trader("Santosh", "Pradhan","123456@gmail.com", "1234567890"));
            repository.save(new Trader("Sridhar", "Mallela","123456@gmail.com", "1234567890"));
            repository.save(new Trader("Chunlei", "Du","123456@gmail.com", "1234567890"));
            repository.save(new Trader("Joe", "Smith","123456@gmail.com", "1234567890"));
            repository.save(new Trader("Brett", "Favre","123456@gmail.com", "1234567890"));
            repository.save(new Trader("John", "Cena","123456@gmail.com", "1234567890"));
            repository.save(new Trader("John", "Silver","123456@gmail.com", "1234567890"));
            repository.save(new Trader("Dak", "Prescott","123456@gmail.com", "1234567890"));
            repository.save(new Trader("Salman", "Khan","123456@gmail.com", "1234567890"));
            repository.save(new Trader("Sachin", "Tendulkar","123456@gmail.com", "1234567890"));
        };
    }
}
