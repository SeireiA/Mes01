package cool.liwu.mes01.Service.Impl;

import cool.liwu.mes01.DAO.PlatformDynamicMapper;
import cool.liwu.mes01.POJO.PlatformDynamic;
import cool.liwu.mes01.Service.PlatformDynamicService;
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

