package com.charmander.peopleinfoservice.controller;

import com.charmander.peopleinfoservice.PersonEndpoint;
import com.charmander.peopleinfoservice.entity.Person;
import com.charmander.peopleinfoservice.entity.PersonYedek;
import com.charmander.peopleinfoservice.repository.PersonYedekRepository;
import com.charmander.peopleinfoservice.service.PersonService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.tbayzin.peopleinfoservice.GetPersonsoapRequest;
import com.github.tbayzin.peopleinfoservice.GetPersonsoapResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/people")
public class PersonController {

    PersonYedekRepository p;

    @Autowired
    private final PersonEndpoint personEndpoint;
    private final PersonService personService;


    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/findperson")
    public GetPersonsoapResponse getPersonsoapByTckn(@RequestBody GetPersonsoapRequest request) {
        return personEndpoint.getPerson(request);
    }


    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping()
    public Person getPersonByTckn(@RequestParam int tckn) {

        return personService.getPersonByTckn(tckn);
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public Person savePerson(@RequestBody Person person) {
        return personService.save(person);
    }


    @RequestMapping(value = "/kisileritasi", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public void kisileriTasi() {

        /*
        List<PersonYedek> abc = p.getPersonYedek();
        System.out.println(abc);
         */
    }
}