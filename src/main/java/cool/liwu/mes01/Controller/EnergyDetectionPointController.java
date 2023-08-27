package cool.liwu.mes01.Controller;

import cool.liwu.mes01.POJO.EnergyDetectionPoint;
import cool.liwu.mes01.Service.EnergyDetectionPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
