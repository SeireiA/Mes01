package cool.liwu.mes01.service.Impl;

import cool.liwu.mes01.dao.NoticeMapper;
import cool.liwu.mes01.pojo.Notice;
import cool.liwu.mes01.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeMapper noticeMapper;

    // 获取公告列表
    public List<Notice> getNoticeList() {
        return noticeMapper.getNoticeList();
    }

    // 获取公告详情
    public Notice getNoticeDetail(Integer id) {
        return noticeMapper.getNoticeDetail(id);
    }

}

