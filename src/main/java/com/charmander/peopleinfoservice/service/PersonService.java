package com.charmander.peopleinfoservice.service;

import com.charmander.peopleinfoservice.entity.People;
import com.charmander.peopleinfoservice.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final  PersonRepository personRepository;

    public People save (People people) {
        return personRepository.save(people);
    }

}
