package cool.liwu.mes01.Service.Impl;

import cool.liwu.mes01.DAO.FactoryModelMapper;
import cool.liwu.mes01.POJO.FactoryModel;
import cool.liwu.mes01.POJO.Material;
import cool.liwu.mes01.Service.FactoryModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactoryModelServiceImpl implements FactoryModelService {
    @Autowired
    private FactoryModelMapper factoryModelMapper;

    @Override
    public List<FactoryModel> getFactoryModels() {
        return factoryModelMapper.getFactoryModels();
    }

    @Override
    public void createFactoryModel(FactoryModel factoryModel) {
        factoryModelMapper.createFactoryModel(factoryModel);
    }

    @Override
    public void updateFactoryModel(FactoryModel factoryModel) {
        factoryModelMapper.updateFactoryModel(factoryModel);
    }

    @Override
    public void deleteFactoryModel(Integer id) {
        factoryModelMapper.deleteFactoryModel(id);
    }

    @Override
    public List<Material> getMaterials() {
        return factoryModelMapper.getMaterials();
    }

    // 其他方法...
}

