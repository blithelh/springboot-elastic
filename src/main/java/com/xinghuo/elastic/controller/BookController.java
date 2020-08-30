package com.xinghuo.elastic.controller;

import com.xinghuo.elastic.bean.Book;
import com.xinghuo.elastic.repository.BookRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookRespository bookRespository;

    @RequestMapping(value = "/init",method = RequestMethod.GET)
    public Map<String,String> init(){
        Map<String,String> map=new HashMap<>();
        bookRespository.save(new Book("1","黎杭是大帅哥2","shuai"));
        map.put("code","200");
        return map;
    }

}
