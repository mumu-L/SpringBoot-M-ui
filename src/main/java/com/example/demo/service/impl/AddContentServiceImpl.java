package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AddContentDao;
import com.example.demo.main.AddContent;
import com.example.demo.service.AddContentService;

@Service("AddContentService")
public class AddContentServiceImpl implements AddContentService {
	
    @Autowired
	AddContentDao dao;
    
	@Override
	public void save(AddContent content) {
		// TODO Auto-generated method stub
			dao.save(content);
	}

	@Override
	public List<AddContent> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Optional<AddContent> findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

}
