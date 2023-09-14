package pl.kurs.java.ZadanieNarkotyki.model;

import java.time.LocalDate;

public class Lsd extends Drug {

    private int numberOfDragon;

    public Lsd(String name, int numberOfDragon, LocalDate productionDate) {
        super(name, productionDate);
        this.numberOfDragon = numberOfDragon;
    }

    @Override
    public void calculateThePrice(int basePrice) {
        setPrice(numberOfDragon * basePrice);
    }
}
