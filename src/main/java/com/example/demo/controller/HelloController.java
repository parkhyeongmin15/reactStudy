package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HelloController {
    @GetMapping("hello")
    public List<String> Hello(){
        return Arrays.asList("와다다다다다다ㅏ닫", "메롱메롱");
    }
}