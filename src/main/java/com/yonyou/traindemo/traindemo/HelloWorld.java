package com.yonyou.traindemo.traindemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghaoab
 * @Description
 * @create 2020-06-15 10:36 下午
 */
@RestController
@RequestMapping(value = "/api")
public class HelloWorld {

    @GetMapping(value = "/helloWorld")
    public String helloWorld(){
        return "hello world!";
    }
}
