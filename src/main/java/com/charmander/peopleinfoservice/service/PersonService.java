package com.charmander.peopleinfoservice.service;

import com.charmander.peopleinfoservice.entity.Person;
import com.charmander.peopleinfoservice.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final  PersonRepository personRepository;

    public Person save (Person person) {
        return personRepository.save(person);
    }

    public Person getPersonByTckn(Integer tckn) {    return personRepository.getPersonByTckn(tckn);     }



}
