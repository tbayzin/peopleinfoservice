package com.charmander.peopleinfoservice.repository;

import com.charmander.peopleinfoservice.entity.Person;
import com.charmander.peopleinfoservice.entity.PersonYedek;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonYedekRepository extends CrudRepository <PersonYedek,Long> {

   /*
   @Query(value = "SELECT * FROM person_yedek" )
   List<PersonYedek> getPersonYedek();
    */
}
