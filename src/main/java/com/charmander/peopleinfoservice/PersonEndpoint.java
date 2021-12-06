package com.charmander.peopleinfoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;



public class PersonEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private PersonRepositorySoap personRepository;

    @Autowired
    public PersonEndpoint (PersonRepositorySoap personRepository) {
        this.personRepository = personRepository;
    }


}


