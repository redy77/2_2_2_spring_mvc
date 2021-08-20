package web.models;

import java.util.ArrayList;
import java.util.List;

public class Cars implements Model{
    private String type;
    private String brand;
    private String color;

    public Cars(){}

    public Cars(String type, String brand, String color) {
        this.type = type;
        this.brand = brand;
        this.color = color;
    }


    @Override
    public String toString() {
        return  "\n" + "type " + type + ", brand " + brand + ", color " + color + "\n";
    }

    @Override
    public List<Model> getModels() {
        List <Model> listCars = new ArrayList<>();
        listCars.add(new Cars("Track", "Kamaz", "Orange"));
        listCars.add(new Cars("Hatchback", "Lada", "Yellow"));
        listCars.add(new Cars("Track","Lada", "Black"));
        listCars.add(new Cars("Sedan", "Zapororozhec", "Dark Blue"));
        listCars.add(new Cars("Sedan", "Mercedes", "White"));
        return listCars;
    }
}