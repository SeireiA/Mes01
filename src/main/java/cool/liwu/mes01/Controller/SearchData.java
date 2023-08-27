package cool.liwu.mes01.Controller;

import cool.liwu.mes01.DAO.DataMapper;
import cool.liwu.mes01.POJO.SearchParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.List;

@RestController
public class SearchData {
    @Autowired
    private DataMapper dataMapper;

    @PostMapping("/searchData")
    public List<Data> searchData(@RequestBody SearchParams searchParams) {
        return dataMapper.searchData(searchParams);
    }
}
