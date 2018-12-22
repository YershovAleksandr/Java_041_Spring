package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void DAOTest(){
		DataDAO dataDAO = new DataDAOImpl();

		for (Data data : dataDAO.getAllData()){
			System.out.println("Data : [Id : " + data.getId() + ", Name : " + data.getName() + " ]");
		}

		Data data = dataDAO.getAllData().get(0);
		data.setName("Michael");
		dataDAO.updateData(data);

		data = dataDAO.getData(0);
		System.out.println("Data : [Id : " + data.getId() + ", Name : " + data.getName() + " ]");
	}
}

