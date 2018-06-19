package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.main.AddContent;
import com.example.demo.main.Person;

public interface Dao extends JpaRepository<Person, Integer> {
	List<Person>  findByName(String name);

	List<Person> findById(int i);

}
