package cool.liwu.mes01.Service.Impl;

import cool.liwu.mes01.DAO.EnergyDetectionPointMapper;
import cool.liwu.mes01.POJO.EnergyDetectionPoint;
import cool.liwu.mes01.Service.EnergyDetectionPointService;
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
