package cool.liwu.mes01.service.Impl;

import cool.liwu.mes01.dao.PlatformDynamicMapper;
import cool.liwu.mes01.pojo.PlatformDynamic;
import cool.liwu.mes01.service.PlatformDynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatformDynamicServiceImpl implements PlatformDynamicService {
    @Autowired
    private PlatformDynamicMapper platformDynamicMapper;

    @Override
    public List<PlatformDynamic> getPlatformDynamicList() {
        return platformDynamicMapper.getPlatformDynamicList();
    }

    @Override
    public PlatformDynamic getPlatformDynamicById(int id) {
        return platformDynamicMapper.getPlatformDynamicById(id);
    }
}

