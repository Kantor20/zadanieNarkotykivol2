package pl.kurs.java.ZadanieNarkotyki.model;

import pl.kurs.java.ZadanieNarkotyki.interfaces.DrugController;

public class DrugQualityService implements DrugController {
    @Override
    public boolean checkDrug(Drug drug) {
        if (!drug.isGoodQuality()){
            throw new RuntimeException("Bad quality");
        } else {
            return true;
        }
    }
}
