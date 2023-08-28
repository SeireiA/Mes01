package cool.liwu.mes01.Controller;

import cool.liwu.mes01.POJO.EnergyDetectionPoint;
import cool.liwu.mes01.Service.EnergyDetectionPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*

创建数据库:
        CREATE TABLE IF NOT EXISTS energy_detection_points (
        id INT PRIMARY KEY AUTO_INCREMENT,
        pointName VARCHAR(255) NOT NULL,
        pointAddress VARCHAR(255) NOT NULL,
        realTimePower DOUBLE NOT NULL,
        realTimeVoltage DOUBLE NOT NULL,
        status INT NOT NULL,
        remark VARCHAR(255)
        );

 */

@RestController
@RequestMapping("/points")
public class EnergyDetectionPointController {
    @Autowired
    private EnergyDetectionPointService pointService;

    @PostMapping("/create")
    public ResponseEntity<String> createEnergyDetectionPoint(@RequestBody EnergyDetectionPoint point) {
        pointService.createEnergyDetectionPoint(point);
        return ResponseEntity.ok("新建成功");
    }
}
