package web.models;

import java.util.ArrayList;
import java.util.List;

public class Cars {
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

}