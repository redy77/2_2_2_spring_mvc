package web.dao;

import web.models.Cars;

import java.util.ArrayList;
import java.util.List;

public class ModelDaoImpl implements ModelDao {
    List<Cars> listCars = new ArrayList<>();

    @Override
    public List<String> getModels(Integer i) {
        List<String> cars = new ArrayList<>();

        if (i == null || i >= 5) {
            i = 4;
        }
        while (i != 0) {
            cars.add(setCars().get(i).toString());
            i--;
        }
        return cars;
    }

    @Override
    public List<Cars> setCars() {
        listCars.add(new Cars("Track", "Kamaz", "Orange"));
        listCars.add(new Cars("Hatchback", "Lada", "Yellow"));
        listCars.add(new Cars("Track", "Lada", "Black"));
        listCars.add(new Cars("Sedan", "Zapororozhec", "Dark Blue"));
        listCars.add(new Cars("Sedan", "Mercedes", "White"));
        return listCars;
    }

}
