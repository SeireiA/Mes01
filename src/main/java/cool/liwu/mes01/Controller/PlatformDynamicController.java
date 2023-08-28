package cool.liwu.mes01.Controller;

import cool.liwu.mes01.POJO.PlatformDynamic;
import cool.liwu.mes01.Service.PlatformDynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
    创建数据库语句:
            CREATE TABLE IF NOT EXISTS platform_dynamic (
            id INT PRIMARY KEY,
            icon VARCHAR(255),
            title VARCHAR(255),
            publishTime DATE
            );

 */


@RestController
@RequestMapping("/api/platformDynamic")
public class PlatformDynamicController {
    @Autowired
    private PlatformDynamicService platformDynamicService;

    @GetMapping("/list")
    public List<PlatformDynamic> getPlatformDynamicList() {
        return platformDynamicService.getPlatformDynamicList();
    }

    @GetMapping("/{id}")
    public PlatformDynamic getPlatformDynamicById(@PathVariable int id) {
        return platformDynamicService.getPlatformDynamicById(id);
    }
}

