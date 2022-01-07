package com.chen.blog.Controller;

import com.chen.blog.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author ChenYi
 * @corporation HongYang_software
 * @create 2022-01-07
 */
@Controller
@RestController
public class loginController {

    @Autowired
    private AdminService adminService;

}
