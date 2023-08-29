package cool.liwu.mes01.dao;

import cool.liwu.mes01.pojo.SearchParams;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import javax.xml.crypto.Data;
import java.util.List;

@Mapper
public interface DataMapper {

    @Select("SELECT * FROM data WHERE name LIKE CONCAT('%', #{name}, '%') " +
            "AND address LIKE CONCAT('%', #{address}, '%') " +
            "AND status = #{status}")
    List<Data> searchData(SearchParams searchParams);

    void createData(Data newData);


}

