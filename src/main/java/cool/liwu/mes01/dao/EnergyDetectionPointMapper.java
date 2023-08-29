package cool.liwu.mes01.dao;

import cool.liwu.mes01.pojo.EnergyDetectionPoint;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EnergyDetectionPointMapper {
    void insertEnergyDetectionPoint(EnergyDetectionPoint point);
}
