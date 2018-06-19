package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.main.AddContent;
import com.example.demo.service.AddContentService;

@RestController
public class AddContentController {
	
	private AddContentService addContentService;
	
	@Autowired
	public AddContentController(AddContentService addContentService) {
		this.addContentService=addContentService;
	}
	
	@RequestMapping(value="/addcontent",method=RequestMethod.POST)
	public void addContent(@RequestBody AddContent addContent) {
		this.addContentService.save(addContent);
		
	}
	@RequestMapping(value="/getaddcontent",method=RequestMethod.GET)
    public List<AddContent> getAddContent() {
		return addContentService.findAll();
		
	}
	@RequestMapping(value="/getcode/{id}")
	public Optional<AddContent> getCode(@PathVariable Integer id) {
		return addContentService.findById(id);
	}
}
