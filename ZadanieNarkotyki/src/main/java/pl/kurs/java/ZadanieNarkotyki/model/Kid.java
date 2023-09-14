package pl.kurs.java.ZadanieNarkotyki.model;


import pl.kurs.java.ZadanieNarkotyki.exceptions.TheKidIsAlreadyDeadException;

import java.util.ArrayList;
import java.util.List;

public class Kid {
    private String name;
    private String surname;
    private int age;
    private final List<Drug> drugs = new ArrayList<>();

    public Kid(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public  void buyDrug(Drug drug){
        if (drugs.size() >= 5){
            throw new TheKidIsAlreadyDeadException("Kid is dead");
        } else {
            drugs.add(drug);
        }
    }

    public List<Drug> getDrugs() {
        return drugs;
    }

}