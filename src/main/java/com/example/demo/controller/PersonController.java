package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Dao;
import com.example.demo.main.Person;

@RestController
public class PersonController {
	@Autowired
    Dao dao;
	
	@RequestMapping("/")
	public String index() {
		return "default";
	}
    @RequestMapping("/person")
    public List<Person> getP(int id) {
    	List<Person> person=dao.findById(id);
    	System.out.println(person.toString());
		return person;
    	
    }
    @RequestMapping("/save")
    public void save() {
    	Person person =new Person();
    	       person.setName("王四");
    	       person.setAddress("上海");
    	      
    	       dao.save(person);
    	
    }
}
