package com.charmander.peopleinfoservice.repository;

import com.charmander.peopleinfoservice.entity.People;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository  <People, Long> {


}
