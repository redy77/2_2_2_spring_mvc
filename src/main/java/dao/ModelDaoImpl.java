package dao;

import models.Cars;
import models.Model;

import java.util.ArrayList;
import java.util.List;

public class ModelDaoImpl implements ModelDao {
    List <String> cars = new ArrayList<>();
    Model model = new Cars();

    @Override
    public List<String> getModels(String i) {
        int k;
        if (i == null || Integer.parseInt(i) >= 5) {
            k = 4;
        }else {
            k = Integer.parseInt(i) - 1;
        }
            while (k > -1) {
                cars.add(model.getModels().get(k).toString());
                k--;
            }
        return cars;
    }

}
