package org.sid.customerservicekc;

import org.sid.customerservicekc.entities.Customer;
import org.sid.customerservicekc.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceKcApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceKcApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(new Customer(null,"Mohamed","mohamed@gmail.com"));
            customerRepository.save(new Customer(null,"Yassine","yassine@gmail.com"));
        };
    }
}
