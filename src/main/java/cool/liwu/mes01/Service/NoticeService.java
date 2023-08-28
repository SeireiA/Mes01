package cool.liwu.mes01.Service;

import cool.liwu.mes01.POJO.Notice;

import java.util.List;

public interface NoticeService {
    public List<Notice> getNoticeList();

    // 获取公告详情
    public Notice getNoticeDetail(Integer id);
}
