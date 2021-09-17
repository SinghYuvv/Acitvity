package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiClient {
	@Autowired
	StudentService service;
	
	@GetMapping("/getdata")
	public List<Student> viewData(){
		return service.listAll();
	}
	
	@GetMapping("/getdata/{id}")
	public Optional <Student> getProduct(@PathVariable(name="id") Integer id){
		return service.getById(id);
	}
	
	@PostMapping("/savedata")
	public void saveData(Student s) {
		service.save(s);
	}
	
	@PutMapping("/edit/{id}")
	public void editData(@PathVariable(name="id") Integer id, Student s) {
		service.get(id);
		service.save(s);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteData(@PathVariable(name="id") Integer id, Student s) {
		service.delete(id);
	}

	

}
