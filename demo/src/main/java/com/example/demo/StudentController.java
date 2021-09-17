package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	@Autowired
	StudentService service;
	
	@RequestMapping("/")
	public String viewIndex(Model model) {
		List<Student> listStudents = service.listAll();
		model.addAttribute("listStudents",listStudents);
		return "tabel";
	}
	
	@RequestMapping("/new")
	public String newPage(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "Formex";
	}
	
	@RequestMapping("/save")
	public String saveData(@ModelAttribute("student") Student s) {
		service.save(s);
		return "redirect:/";
	}
	

	@RequestMapping("/user")
	public String viewUser() {
		return "user";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView editData(@PathVariable(name="id") Integer id) {
		ModelAndView stu = new ModelAndView("Formex");
		Student student = service.get(id);
		stu.addObject("student", student);
		return stu;
	}


	@RequestMapping("/delete/{id}")
	public String deleteData(@PathVariable(name="id") Integer id) {
		service.delete(id);
		return "redirect:/";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
