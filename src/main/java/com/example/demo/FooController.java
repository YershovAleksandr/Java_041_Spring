package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {
    @GetMapping("/")
    public String index(){
        return "<h1>Hello World!</h1>";
    }

    @RequestMapping("/42")
    public String index42(@RequestParam(value = "name", defaultValue = "42") String name){
        return String.format("<h2>%s</h2>", name);
    }
}
