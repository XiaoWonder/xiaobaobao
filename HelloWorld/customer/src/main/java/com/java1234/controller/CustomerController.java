package com.java1234.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 潇
 * @create 2019-03-13 14:44
 */
@RestController
public class CustomerController {

    @RequestMapping("/list")
    public String list(){
        return "list";
    }
}
