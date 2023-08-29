package cool.liwu.mes01.service.Impl;

import cool.liwu.mes01.dao.DataMapper;
import cool.liwu.mes01.service.DataService;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;

@Service
public class DataServiceImpl implements DataService {
    @Override
    public void createData(Data newData) throws NullPointerException {
        DataMapper dataMapper = null;
        dataMapper.createData(newData);
    }
}
