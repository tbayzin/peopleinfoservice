package com.charmander.peopleinfoservice.controller;

import com.charmander.peopleinfoservice.PersonEndpoint;
import com.charmander.peopleinfoservice.entity.Person;
import com.charmander.peopleinfoservice.service.PersonService;
import com.github.tbayzin.peopleinfoservice.GetPersonsoapRequest;
import com.github.tbayzin.peopleinfoservice.GetPersonsoapResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/people")
public class PersonController {

    @Autowired
    private  final PersonEndpoint personEndpoint;
private final PersonService personService;


// Buraya bir GET mapping yazılacak  buraya attığın tckn soapdaki tckn sorgulayan endpointe gidecek o da dummy data & db ye gidecek

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/findperson")
    public GetPersonsoapResponse getPersonsoapByTckn (@RequestBody GetPersonsoapRequest request) {
        return personEndpoint.getPerson(request);
    }

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
