package cool.liwu.mes01.Service.Impl;

import cool.liwu.mes01.DAO.DataMapper;
import cool.liwu.mes01.Service.DataService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;

@Service
public class DataServiceImpl implements DataService {
    @Override
    public void createData(Data newData) throws NullPointerException{
        DataMapper dataMapper = null;
        dataMapper.createData(newData);
    }
}
