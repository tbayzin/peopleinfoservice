package com.charmander.peopleinfoservice.service;

import com.charmander.peopleinfoservice.dto.PersonBaseDTO;
import com.charmander.peopleinfoservice.entity.Person;
import com.charmander.peopleinfoservice.entity.PersonYedek;
import com.charmander.peopleinfoservice.repository.PersonRepository;
import com.charmander.peopleinfoservice.repository.PersonYedekRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final  PersonRepository personRepository;
    private final PersonYedekRepository personYedekRepository;

    public PersonYedek save (PersonYedek personYedek) {
        return personYedekRepository.save(personYedek);
    }

    /*
    public PersonYedek getPersonYedekByTckn () {
        return personYedekRepository.getPersonYedekByTckn();
    }
     */


    public Person save (Person person) {
        return personRepository.save(person);
    }

    public Person getPersonByTckn(Integer tckn) {    return personRepository.getPersonByTckn(tckn);     }

    public PersonBaseDTO DenemeMethod () {
        PersonBaseDTO personBaseDTO = new PersonBaseDTO();

        personBaseDTO.setCity("ANkara");
        personBaseDTO.setName("Tarık");

        return personBaseDTO;
    }


}
