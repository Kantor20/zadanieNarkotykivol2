package pl.kurs.java.ZadanieNarkotyki.exceptions;

public class BadQualityException extends RuntimeException{
    public BadQualityException(String message){
        super(message);
    }
}
