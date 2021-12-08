package com.charmander.peopleinfoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.github.tbayzin.peopleinfoservice.GetPersonsoapRequest;
import com.github.tbayzin.peopleinfoservice.GetPersonsoapResponse;

@Endpoint
public class PersonEndpoint {
    private static final String NAMESPACE_URI = "http://www.github.com/tbayzin/peopleinfoservice";

    private PersonRepositorySoap personRepositorySoap;

    @Autowired
    public PersonEndpoint (PersonRepositorySoap personRepositorySoap) {
        this.personRepositorySoap = personRepositorySoap;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPersonsoapRequest")
    @ResponsePayload
    public GetPersonsoapResponse getPerson(@RequestPayload GetPersonsoapRequest request) {
        GetPersonsoapResponse response = new GetPersonsoapResponse();
        response.setPersonsoap(personRepositorySoap.findPersonsoap(request.getTckn()));
        return response;
    }


}


