package com.example.demo111;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController()
public class IndexController {
    @RequestMapping(value = {"/","/index"})
    public Object index(){
        HashMap<String, String> map = new HashMap<>();
        map.put("username","lww");
        map.put("age","18");
        map.put("password","123456");
        return map;
    }
}
