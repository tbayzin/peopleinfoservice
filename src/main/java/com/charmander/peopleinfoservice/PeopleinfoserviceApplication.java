package com.charmander.peopleinfoservice;

import com.charmander.peopleinfoservice.dto.PersonBaseDTO;
import com.charmander.peopleinfoservice.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PeopleinfoserviceApplication {


    public static void main(String[] args) {
        SpringApplication.run(PeopleinfoserviceApplication.class, args);
    }
    @Autowired
    PersonService personService;
    @Bean
    public CommandLineRunner demo() {
        return (args) -> {

            personService.DenemeMethod();
            };

        };

        }


