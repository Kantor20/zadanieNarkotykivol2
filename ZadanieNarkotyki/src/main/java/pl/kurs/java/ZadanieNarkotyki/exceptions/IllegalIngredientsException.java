package pl.kurs.java.ZadanieNarkotyki.exceptions;

public class IllegalIngredientsException extends RuntimeException{
    public IllegalIngredientsException(String message){
        super(message);
    }
}
