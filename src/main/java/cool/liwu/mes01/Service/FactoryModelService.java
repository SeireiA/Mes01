package cool.liwu.mes01.Service;

import cool.liwu.mes01.POJO.FactoryModel;
import cool.liwu.mes01.POJO.Material;

import java.util.List;

public interface FactoryModelService {
    List<FactoryModel> getFactoryModels();

    void createFactoryModel(FactoryModel factoryModel);

    void updateFactoryModel(FactoryModel factoryModel);

    void deleteFactoryModel(Integer id);

    List<Material> getMaterials();

    // 其他方法...
}

