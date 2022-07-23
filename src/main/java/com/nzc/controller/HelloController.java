package com.nzc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @description:
 * @author: Yihui Wang
 * @date: 2022年07月19日 17:53
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String get(){
        return "hello,jenkins ~~"+new Date();
    }

    @GetMapping("/github")
    public String push(){
        return "ningzaichun 测试 git push 触发自动化构建 第五次 !!"+new Date();
    }
}
