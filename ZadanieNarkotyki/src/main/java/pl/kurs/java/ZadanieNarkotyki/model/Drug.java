package pl.kurs.java.ZadanieNarkotyki.model;

import pl.kurs.java.ZadanieNarkotyki.exceptions.IllegalIngredientsException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Drug {

    private String name;
    private double price;
    private boolean quality;


    private LocalDate productionDate;
    private List<String> ingredients = new ArrayList<>();

    public Drug(String name, LocalDate productionDate) {
        this.name = name;
        this.productionDate = productionDate;
    }

    public abstract void calculateThePrice(int basePrice);

    public void setIngredients(String... ingredients) {
        if (ingredients.length < 3) {
            throw new IllegalIngredientsException("Not enough");
        } else {
            this.ingredients = List.of(ingredients);
        }
    }


    public boolean isGoodQuality() {
        return quality;
    }

    public void setQuality(boolean quality) {
        this.quality = quality;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drug drug = (Drug) o;
        return Double.compare(drug.price, price) == 0 && Objects.equals(name, drug.name) && Objects.equals(productionDate, drug.productionDate) && Objects.equals(ingredients, drug.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, productionDate, ingredients);
    }
}
