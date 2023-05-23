package in.ineuron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ineuron.model.Student;

@Controller
public class StudentController {

	@GetMapping("/studentinfo")
	public String getData(Model model) {
		
		Student student = new Student();
		student.setCity("Kurnool");
		student.setDob("16-11-2000");
		student.setFirstName("Kanumarlapudi");
		student.setGender("Male");
		student.setId(1);
		student.setLastName("Harish");
		
		model.addAttribute("std", student);
		return "student";
	}
	
}
