package pl.kurs.java.model;

import org.junit.Before;
import org.junit.Test;
import pl.kurs.java.ZadanieNarkotyki.exceptions.TheKidIsAlreadyDeadException;
import pl.kurs.java.ZadanieNarkotyki.model.Drug;
import pl.kurs.java.ZadanieNarkotyki.model.Kid;
import pl.kurs.java.ZadanieNarkotyki.model.Lsd;
import pl.kurs.java.ZadanieNarkotyki.model.Mefedron;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class KidTest {

    private Lsd lsd;
    private Mefedron mefedron;
    private Kid kid;
    private List<Drug> test;

    @Before
    public void init() {
        mefedron = new Mefedron("mef", "dupa", LocalDate.of(2022, 5, 1));
        lsd = new Lsd("lssd", 9, LocalDate.of(2021, 6, 1));
        kid = new Kid("Janek", "Kowalski", 15);

        test = new ArrayList<>(List.of(lsd, mefedron));

    }

    @Test
    public void shouldReturnTrueIfDrugsWasAddCorrect() {
        kid.buyDrug(lsd);
        kid.buyDrug(mefedron);

        List<Drug> result = new ArrayList<>(kid.getDrugs());

        assertEquals(result, test);
    }

    @Test
    public void shouldThrowTheKidIsAlreadyDeadException(){
        for (int i = 0; i < 5; i++){
            kid.buyDrug(mefedron);
        }
        assertThrows(TheKidIsAlreadyDeadException.class, () -> kid.buyDrug(lsd));
    }

}