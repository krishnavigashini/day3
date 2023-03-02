package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.entity;
import com.example.demo.Repository.repository;

@Service
public class service 
{
  @Autowired(required=true)
  repository strep;
  public entity saveDetails(entity e)
  {
	  return strep.save(e);  
  }
  
  public List<entity>getDetails()
  {
	  return strep.findAll();
  }
  
  public entity updateDetails(entity e1)
  {
	  return strep.saveAndFlush(e1);
  }
  public void deleteDetails(int id)
  {
	  strep.deleteById(id);
  }
}
