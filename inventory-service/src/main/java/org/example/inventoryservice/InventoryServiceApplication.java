package org.example.inventoryservice;

import org.example.inventoryservice.entities.Product;
import org.example.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository) {
        return args -> {
            productRepository.save(new Product(UUID.randomUUID().toString(), "Computer", 3200,11));
            productRepository.save(new Product(UUID.randomUUID().toString(), "Printer", 1299,10));
            productRepository.save(new Product(UUID.randomUUID().toString(), "Smart Phone", 5400,11));


            productRepository.findAll().forEach( p -> {
                    System.out.println(p.toString());
            });
        };
    }
}
