package pl.kurs.java.ZadanieNarkotyki.model;

import java.time.LocalDate;

public class Mdma extends Drug{

    private int duration;

    public Mdma(String name, int duration, LocalDate productionDate) {
        super(name, productionDate);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void calculateThePrice(int basePrice) {
        setPrice(duration * basePrice);
    }
}
