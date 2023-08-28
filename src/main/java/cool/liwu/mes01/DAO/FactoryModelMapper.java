package cool.liwu.mes01.DAO;

import cool.liwu.mes01.POJO.FactoryModel;
import cool.liwu.mes01.POJO.Material;
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


