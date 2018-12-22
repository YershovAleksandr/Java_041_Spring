package com.example.demo;

import java.util.List;

public interface DataDAO {
    public List<Data> getAllData();
    public Data getData(int id);
    public void updateData(Data data);
    public void deleteData(Data data);
}
