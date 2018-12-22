package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class DataDAOImpl implements DataDAO{
    List<Data> data;

    public DataDAOImpl(){
        data = new ArrayList<Data>();

        data.add(new Data("Jack", 0));
        data.add(new Data("Bill", 1));

        System.out.println("42");
    }

    @Override
    public void deleteData(Data data){
        this.data.remove(data.getId());
        System.out.println("Data : id = " + data.getId() + ", deleted");
    }

    @Override
    public List<Data> getAllData(){
        return data;
    }

    @Override
    public Data getData(int id){
        return data.get(id);
    }

    @Override
    public void updateData(Data data){
        this.data.get(data.getId()).setName(data.getName());
        System.out.println("Data : id = " + data.getId() + ", updated");
        System.out.println("43");
    }
}
