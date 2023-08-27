package cool.liwu.mes01.Controller;

import cool.liwu.mes01.DAO.EnergyPointMapper;
import cool.liwu.mes01.POJO.EnergyPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/energyPoint")
public class EnergyPointController {
    @Autowired
    private EnergyPointMapper energyPointMapper;

    @GetMapping("/all")
    public List<EnergyPoint> getAllEnergyPoints() {
        return energyPointMapper.getAllEnergyPoints();
    }

    @PutMapping("/update")
    public void updateEnergyPoint(@RequestBody EnergyPoint energyPoint) {
        energyPointMapper.updateEnergyPoint(energyPoint);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEnergyPoint(@PathVariable("id") Long id) {
        energyPointMapper.deleteEnergyPoint(id);
    }
}
