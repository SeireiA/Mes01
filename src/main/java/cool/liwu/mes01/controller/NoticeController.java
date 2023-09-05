package cool.liwu.mes01.controller;

import cool.liwu.mes01.pojo.Notice;
import cool.liwu.mes01.service.Impl.NoticeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@RestController
@RequestMapping("/notice")
public class NoticeController {
    @Autowired
    private NoticeServiceImpl noticeServiceImpl;

    // 获取公告列表
    @GetMapping("/list")
    public List<Notice> getNoticeList() {
        return noticeServiceImpl.getNoticeList();
    }

    // 获取公告详情
    @GetMapping("/detail/{id}")
    public Notice getNoticeDetail(@PathVariable("id") Integer id) {
        return noticeServiceImpl.getNoticeDetail(id);
    }

    // 下载附件
    @GetMapping("/attachment/{id}")
    public ResponseEntity<byte[]> downloadAttachment(@PathVariable("id") Integer id) {
        // 根据id查询附件路径
        String attachmentPath = noticeServiceImpl.getNoticeDetail(id).getAttachmentPath();

        // 读取附件文件内容
        File file = new File(attachmentPath);
        byte[] fileContent = new byte[0];
        try {
            fileContent = Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            // 处理异常...
            System.out.println(e.getMessage());
        }

        // 设置响应头信息，指定文件名及下载方式
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment; filename=" + file.getName());

        // 创建响应实体对象
        ResponseEntity<byte[]> responseEntity =
                new ResponseEntity<>(fileContent, headers, HttpStatus.OK);
        return responseEntity;
    }
}
