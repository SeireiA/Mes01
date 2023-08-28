package cool.liwu.mes01.DAO;

import cool.liwu.mes01.POJO.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NoticeMapper {
    // 查询公告列表
    @Select("SELECT * FROM notice")
    List<Notice> getNoticeList();

    // 查询公告详情
    @Select("SELECT * FROM notice WHERE id = #{id}")
    Notice getNoticeDetail(Integer id);
}


