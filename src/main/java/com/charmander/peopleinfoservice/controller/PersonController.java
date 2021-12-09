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

// Buraya bir GET mapping yazılacak  buraya attığın tckn soapdaki tckn sorgulayan endpointe gidecek o da dummy data & db ye gidecek

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping()
    public Person getPersonByTckn (@RequestParam int tckn) {
        return personService.getPersonByTckn(tckn);
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public Person savePerson (@RequestBody Person person) {
        return personService.save(person);
    }


}
