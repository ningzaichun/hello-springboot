package com.nzc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Yihui Wang
 * @date: 2022年07月19日 17:53
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String get(){
        return "hello,jenkins";
    }
}
