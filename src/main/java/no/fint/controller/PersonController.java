package no.fint.controller;

import no.fint.annotation.FintSelfId;
import no.fint.model.Elevressurs;
import no.fint.model.Person;
import no.fint.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/person")
//@FintRelation(linkObject= Elevressurs.class, id="elevnummer", basePath="/elevressurs")
@FintSelfId("nin")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Person> getPersoner() {
        return personService.getPersoner();

    }
}
