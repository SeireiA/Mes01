package cool.liwu.mes01.Controller;

import cool.liwu.mes01.Service.DataService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;

public class CreatData {
    @RestController
    public class DataController {
        private final DataService dataService;

        public DataController(DataService dataService) {
            this.dataService = dataService;
        }

        @PostMapping("/createData")
        public String createData(@RequestBody Data newData) {
            dataService.createData(newData);
            return "新建成功";
        }
    }

}
