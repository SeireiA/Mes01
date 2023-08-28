package cool.liwu.mes01.Controller;

import cool.liwu.mes01.Service.DataService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;

/*

创建数据库语法:
        CREATE TABLE IF NOT EXISTS energy_detection_points (
        id INT PRIMARY KEY AUTO_INCREMENT,
        point_name VARCHAR(255) NOT NULL,
        point_address VARCHAR(255) NOT NULL,
        real_time_power VARCHAR(255) NOT NULL,
        real_time_voltage VARCHAR(255) NOT NULL,
        status VARCHAR(255) NOT NULL,
        remark VARCHAR(255)
        );

 */


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
