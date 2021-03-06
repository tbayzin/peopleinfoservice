package com.charmander.peopleinfoservice.repository;

import com.charmander.peopleinfoservice.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository  <Person, Long> {

    Person getPersonByTckn(Integer tckn);

}
