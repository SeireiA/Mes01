package cool.liwu.mes01.Controller;

import cool.liwu.mes01.POJO.ProcessModel;
import cool.liwu.mes01.Service.ProcessModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*

创建数据库语句:
CREATE TABLE IF NOT EXISTS example_db_table (
        id VARCHAR(255) PRIMARY KEY,
        processName VARCHAR(255) NOT NULL,
        product VARCHAR(255) NOT NULL,
        model VARCHAR(255) NOT NULL,
        specification VARCHAR(255) NOT NULL,
        unit VARCHAR(255) NOT NULL,
        unitPowerConsumption DOUBLE NOT NULL,
        remark VARCHAR(255)
        );

 */


@RestController
@RequestMapping("/process-model")
public class ProcessModelController {
    @Autowired
    private ProcessModelService processModelService;

    @GetMapping("/list")
    public List<ProcessModel> getProcessModels(@RequestParam(defaultValue = "1") int pageNum,
                                               @RequestParam(defaultValue = "10") int pageSize) {
        return processModelService.getProcessModels(pageNum, pageSize);
    }

    @GetMapping("/{id}")
    public ProcessModel getProcessModelById(@PathVariable String id) {
        return processModelService.getProcessModelById(id);
    }

    @GetMapping("/search")
    public List<ProcessModel> searchProcessModels(@RequestParam String processName,
                                                  @RequestParam(defaultValue = "1") int pageNum,
                                                  @RequestParam(defaultValue = "10") int pageSize) {
        return processModelService.searchProcessModels(processName, pageNum, pageSize);
    }

    @PostMapping("/add")
    public void insertProcessModel(@RequestBody ProcessModel processModel) {
        processModelService.insertProcessModel(processModel);
    }

    @PutMapping("/update")
    public void updateProcessModel(@RequestBody ProcessModel processModel) {
        processModelService.updateProcessModel(processModel);
    }

    @DeleteMapping("/{id}")
    public void deleteProcessModelById(@PathVariable String id) {
        processModelService.deleteProcessModelById(id);
    }
}

