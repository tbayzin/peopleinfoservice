package com.charmander.peopleinfoservice.controller;

import com.charmander.peopleinfoservice.entity.Person;
import com.charmander.peopleinfoservice.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/people")
public class PersonController {

private final PersonService personService;


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public Person savePerson (@RequestBody Person person) {
        return personService.save(person);
    }
}
