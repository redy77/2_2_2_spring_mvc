package web.service;

import web.dao.ModelDao;
import web.dao.ModelDaoImpl;
import java.util.List;

public class ModelServiceImpl implements ModelService{
private final ModelDao modelDao = new ModelDaoImpl();

    @Override
    public List<String> getModels(Integer i) {

        return modelDao.getModels(i);
    }
}
