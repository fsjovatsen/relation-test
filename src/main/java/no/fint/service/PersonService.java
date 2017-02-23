package no.fint.service;

import no.fint.model.Elevressurs;
import no.fint.model.Person;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
    private List<Person> personer;

    @PostConstruct
    public void init() {
        Person person1 = new Person("27077400000", "Ole Olsen");
        Person person2 = new Person("01077400000", "Per Olsen");

        personer = new ArrayList<>();

        personer.add(person1);
        personer.add(person2);
    }

    public List<Person> getPersoner() {
        return personer;
    }

}
