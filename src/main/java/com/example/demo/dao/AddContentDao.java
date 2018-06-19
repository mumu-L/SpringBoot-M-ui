package com.example.demo.dao;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.main.AddContent;

public interface AddContentDao extends JpaRepository<AddContent, Integer> {
}
