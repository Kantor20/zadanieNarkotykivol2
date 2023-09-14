package pl.kurs.java.ZadanieNarkotyki.model;

import java.time.LocalDate;

public class Mefedron extends Drug {

    private String mine;

    public Mefedron(String name, String mine, LocalDate prductionDate) {
        super(name, prductionDate);
        this.mine = mine;
    }

    @Override
    public void calculateThePrice(int basePrice) {
        setPrice(mine.length() * basePrice);
    }
}
