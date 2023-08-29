package cool.liwu.mes01.dao;

import cool.liwu.mes01.pojo.EnergyPoint;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EnergyPointMapper {
    List<EnergyPoint> getAllEnergyPoints();

    EnergyPoint getEnergyPointById(Long id);

    void updateEnergyPoint(EnergyPoint energyPoint);

    void deleteEnergyPoint(Long id);
}
