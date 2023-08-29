package cool.liwu.mes01.service.Impl;

import cool.liwu.mes01.dao.EnergyDetectionPointMapper;
import cool.liwu.mes01.pojo.EnergyDetectionPoint;
import cool.liwu.mes01.service.EnergyDetectionPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnergyDetectionPointServiceImpl implements EnergyDetectionPointService {
    @Autowired
    private EnergyDetectionPointMapper pointMapper;

    @Override
    public void createEnergyDetectionPoint(EnergyDetectionPoint point) {
        pointMapper.insertEnergyDetectionPoint(point);
    }
}
