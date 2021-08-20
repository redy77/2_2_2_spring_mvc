package web.dao;

import web.models.Cars;

import java.util.ArrayList;
import java.util.List;

public class ModelDaoImpl implements ModelDao {
    private final List<Cars> listCars = new ArrayList<>();

    {
        listCars.add(new Cars("Track", "Kamaz", "Orange"));
        listCars.add(new Cars("Hatchback", "Lada", "Yellow"));
        listCars.add(new Cars("Track", "Lada", "Black"));
        listCars.add(new Cars("Sedan", "Zapororozhec", "Dark Blue"));
        listCars.add(new Cars("Sedan", "Mercedes", "White"));
    }

    @Override
    public List<String> getModels(Integer i) {
        List<String> cars = new ArrayList<>();

        if (i == null || i >= 5) {
            i = 4;
        }
        while (i != 0) {
            cars.add(listCars.get(i).toString());
            i--;
        }
        return cars;
    }
}
