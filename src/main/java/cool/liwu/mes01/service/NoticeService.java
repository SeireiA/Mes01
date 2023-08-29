package cool.liwu.mes01.service;

import cool.liwu.mes01.pojo.Notice;

import java.util.List;

public interface NoticeService {
    public List<Notice> getNoticeList();

    // 获取公告详情
    public Notice getNoticeDetail(Integer id);
}
