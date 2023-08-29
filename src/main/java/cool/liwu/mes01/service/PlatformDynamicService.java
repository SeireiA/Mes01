package cool.liwu.mes01.service;

import cool.liwu.mes01.pojo.PlatformDynamic;

import java.util.List;

public interface PlatformDynamicService {
    List<PlatformDynamic> getPlatformDynamicList();

    PlatformDynamic getPlatformDynamicById(int id);
}

