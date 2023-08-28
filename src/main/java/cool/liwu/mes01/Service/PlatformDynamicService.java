package cool.liwu.mes01.Service;

import cool.liwu.mes01.POJO.PlatformDynamic;

import java.util.List;

public interface PlatformDynamicService {
    List<PlatformDynamic> getPlatformDynamicList();

    PlatformDynamic getPlatformDynamicById(int id);
}

