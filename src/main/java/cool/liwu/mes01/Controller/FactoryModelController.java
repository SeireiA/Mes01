package cool.liwu.mes01.Controller;

import cool.liwu.mes01.POJO.FactoryModel;
import cool.liwu.mes01.POJO.Material;
import cool.liwu.mes01.Service.FactoryModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


        //创建数据库表的SQL语句：
        //        CREATE TABLE factory_model (
        //        id INT PRIMARY KEY AUTO_INCREMENT,
        //        product VARCHAR(100) NOT NULL,
        //        production_line_name VARCHAR(100) NOT NULL,
        //        description VARCHAR(255)
        //        );

@RestController
public class FactoryModelController {
    @Autowired
    private FactoryModelService factoryModelService;

    @GetMapping("/factoryModels")
    public List<FactoryModel> getFactoryModels() {
        return factoryModelService.getFactoryModels();
    }

    @PostMapping("/factoryModels")
    public void createFactoryModel(@RequestBody FactoryModel factoryModel) {
        factoryModelService.createFactoryModel(factoryModel);
    }

    @PutMapping("/factoryModels/{id}")
    public void updateFactoryModel(@PathVariable Integer id, @RequestBody FactoryModel factoryModel) {
        factoryModel.setId(id);
        factoryModelService.updateFactoryModel(factoryModel);
    }

    @DeleteMapping("/factoryModels/{id}")
    public void deleteFactoryModel(@PathVariable Integer id) {
        factoryModelService.deleteFactoryModel(id);
    }

    @GetMapping("/materials")
    public List<Material> getMaterials() {
        return factoryModelService.getMaterials();
    }

    // 其他方法...
}

