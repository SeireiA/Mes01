package cool.liwu.mes01.service;

import cool.liwu.mes01.pojo.FactoryModel;
import cool.liwu.mes01.pojo.Material;

import java.util.List;

public interface FactoryModelService {
    List<FactoryModel> getFactoryModels();

    void createFactoryModel(FactoryModel factoryModel);

    void updateFactoryModel(FactoryModel factoryModel);

    void deleteFactoryModel(Integer id);

    List<Material> getMaterials();

    // 其他方法...
}

