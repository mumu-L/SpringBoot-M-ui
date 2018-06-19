package com.example.demo.main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="t_addcontent")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler"}) 
public class AddContent {
	  @Id
	  @GeneratedValue
	  
      private int id;
	  private String identification;
      public String getIdentification() {
		return identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	private String name;
      private String content;
      
    public AddContent() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "AddContent [id=" + id + ", identification=" + identification + ", name=" + name + ", content=" + content
				+ "]";
	}

      
      
}
