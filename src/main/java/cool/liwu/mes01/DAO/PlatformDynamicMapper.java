package cool.liwu.mes01.DAO;

import cool.liwu.mes01.POJO.PlatformDynamic;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PlatformDynamicMapper {
    List<PlatformDynamic> getPlatformDynamicList();

    PlatformDynamic getPlatformDynamicById(int id);
}


