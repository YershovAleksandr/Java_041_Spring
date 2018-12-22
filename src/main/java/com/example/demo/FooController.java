package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    private DataDAOImpl dataDAO;

    @GetMapping("/")
    public String index(){
        System.out.println("4111111111111111111111112");
        return "<h1>Hello World!</h1><br />" +
                "<a href=\"/create\">Create</a><br />" +
                "<a href=\"/retrieve\">Retrieve</a><br />" +
                "<a href=\"/update\">Update</a><br />" +
                "<a href=\"/delete\">Delete</a>";
    }

    @GetMapping("/create")
    public String indexCreate(){
        dataDAO = new DataDAOImpl();
        System.out.println("4242");
        return "<h1>Create</h1>";
    }

    @GetMapping("/retrieve")
    public String indexRetrieve(){
        StringBuilder str = new StringBuilder();

        for (Data data : dataDAO.getAllData()){
            str.append("Data : [Id : " + data.getId() + ", Name : " + data.getName() + " ]<br />");
        }

        return "<h1>Retrieve</h1><br />" + str.toString();
    }

    @GetMapping("/update")
    public String indexUpdate(){
        Data data = dataDAO.getAllData().get(0);
        data.setName("Michael");
        dataDAO.updateData(data);

        return "<h1>Update</h1>";
    }

    @GetMapping("/delete")
    public String indexDelete(){
        return "<h1>Delete</h1>";
    }

    @RequestMapping("/42")
    public String index42(@RequestParam(value = "name", defaultValue = "42") String name){
        Data data = dataDAO.getAllData().get(0);
        data.setName(name);
        dataDAO.updateData(data);

        return String.format("<h2>%s</h2>", name);
    }
}
