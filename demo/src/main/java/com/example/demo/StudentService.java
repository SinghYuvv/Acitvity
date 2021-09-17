package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	StudentRepo repo;
	//read
	public List<Student> listAll(){
		return repo.findAll();
	}
	
	//save
	public void save(Student s) {
		repo.save(s);
	}
	
	//update
	public Student get(Integer id) {
		return repo.findById(id).get();
	} 
	//delete
	public void delete(Integer id) {
		repo.deleteById(id);
	}

	public Optional<Student> getById(Integer id){
		return repo.findById(id);
	}


}
