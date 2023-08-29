package cool.liwu.mes01.dao;

import cool.liwu.mes01.pojo.PlatformDynamic;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PlatformDynamicMapper {
    List<PlatformDynamic> getPlatformDynamicList();

    PlatformDynamic getPlatformDynamicById(int id);
}


