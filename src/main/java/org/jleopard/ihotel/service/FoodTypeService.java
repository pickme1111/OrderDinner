package org.jleopard.ihotel.service;

import org.jleopard.ihotel.dao.FoodTypeDao;
import org.jleopard.ihotel.entity.FoodType;
import org.jleopard.mvc.core.annotation.Inject;
import org.jleopard.mvc.core.annotation.Service;

import java.util.List;


@Service
public class FoodTypeService {


    @Inject
    private FoodTypeDao dao;

    public int add(FoodType foodType) {
        return dao.insert(foodType);

    }

    public int update(FoodType foodType) {
        return dao.update(foodType);

    }

    public int delete(int id) {
        return dao.deleteById(id);
    }

    public FoodType findById(Integer id) {
        FoodType var1 = new FoodType();
        var1.setId(id);
        List<FoodType> list = dao.select(var1);
        return list == null ? null : list.get(0);
    }

    public List<FoodType> query() {
        return dao.select();
    }

    public List<FoodType> query(FoodType foodType) {
        return dao.select(foodType);
    }

    public Integer getFirstType() {
        List<FoodType> list = query();
        return list == null ? null : list.get(0).getId();
    }


}
