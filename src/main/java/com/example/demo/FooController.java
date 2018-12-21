package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {
    @GetMapping("/")
    public String index(){
        return "<h1>Hello World!</h1><br />" +
                "<a href=\"/create\">Create</a><br />" +
                "<a href=\"/retrieve\">Retrieve</a><br />" +
                "<a href=\"/update\">Update</a><br />" +
                "<a href=\"/delete\">Delete</a>";
    }

    @GetMapping("/create")
    public String indexCreate(){
        return "<h1>Create</h1>";
    }

    @GetMapping("/retrieve")
    public String indexRetrieve(){
        return "<h1>Retrieve</h1>";
    }

    @GetMapping("/update")
    public String indexUpdate(){
        return "<h1>Update</h1>";
    }

    @GetMapping("/delete")
    public String indexDelete(){
        return "<h1>Delete</h1>";
    }

    @RequestMapping("/42")
    public String index42(@RequestParam(value = "name", defaultValue = "42") String name){
        return String.format("<h2>%s</h2>", name);
    }
}
