package cool.liwu.mes01.dao;

import cool.liwu.mes01.pojo.FactoryModel;
import cool.liwu.mes01.pojo.Material;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FactoryModelMapper {
    List<FactoryModel> getFactoryModels();

    List<Material> getMaterials();

    void createFactoryModel(FactoryModel factoryModel);

    void updateFactoryModel(FactoryModel factoryModel);

    void deleteFactoryModel(Integer id);

    // 其他方法...
}


