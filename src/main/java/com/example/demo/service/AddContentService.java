package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.main.AddContent;

public interface AddContentService {
    void save(AddContent content);
    List<AddContent> findAll();
    Optional<AddContent> findById(int id);
}
