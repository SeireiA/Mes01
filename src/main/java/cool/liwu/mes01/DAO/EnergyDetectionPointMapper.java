package cool.liwu.mes01.DAO;

import cool.liwu.mes01.POJO.EnergyDetectionPoint;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EnergyDetectionPointMapper {
    void insertEnergyDetectionPoint(EnergyDetectionPoint point);
}
