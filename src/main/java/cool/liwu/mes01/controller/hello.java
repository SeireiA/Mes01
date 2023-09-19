package cool.liwu.mes01.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@RequestMapping("/hello")
public class hello {

    @GetMapping("/")
    public String getNoticeList() {
        return "Hello";
    }
}