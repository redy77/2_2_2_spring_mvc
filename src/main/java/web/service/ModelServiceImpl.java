package web.service;

import web.dao.ModelDaoImpl;
import java.util.List;

public class ModelServiceImpl implements ModelService{
private final ModelDaoImpl modelDao = new ModelDaoImpl();

    @Override
    public List<String> getModels(String i) {
        return modelDao.getModels(i);
    }
}
