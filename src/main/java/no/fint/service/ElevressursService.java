package no.fint.service;

import no.fint.model.Elevressurs;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class ElevressursService {
    private List<Elevressurs> elevressurser;

    @PostConstruct
    public void init() {
        Elevressurs elevressurs1 = new Elevressurs("1234", "Ole Olsen");
        Elevressurs elevressurs2 = new Elevressurs("4321", "Per Olsen");

        elevressurser = new ArrayList<>();

        elevressurser.add(elevressurs1);
        elevressurser.add(elevressurs2);
    }

    public List<Elevressurs> getElevressurser() {
        return elevressurser;
    }
}
