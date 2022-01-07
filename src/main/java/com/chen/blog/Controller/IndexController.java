package com.chen.blog.Controller;

import com.chen.blog.Exception.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ChenYi
 * @corporation HongYang_software
 * @create 2022-01-07
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
