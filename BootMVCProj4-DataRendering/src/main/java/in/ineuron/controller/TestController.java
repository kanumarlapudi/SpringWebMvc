package in.ineuron.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.ineuron.model.Employee;

@Controller
public class TestController {

	@GetMapping
	public String showHome() {
		return "home";
	}

	@GetMapping(value = "/report")
	public String showReport(Map<String, Object> model) {

		/*
		 * model.put("name", "Kohli"); model.put("age", 49); model.put("address",
		 * "RCB");
		 * 
		 * String[] countryNames = new String[] { "IND", "USA", "Russia", "UK" };
		 * model.put("countryNames", countryNames);
		 * 
		 * List<String> subjectList = List.of("java", "jee", "spring", "springboot",
		 * "hibernate"); model.put("subjectList", subjectList);
		 * 
		 * Set<Long> mobileSet = Set.of(9999999999L, 8888888888L, 7777777777L);
		 * model.put("mobileSet", mobileSet);
		 * 
		 * Map<String, Number> idsMap = Map.of("aadharNum", 457522, "voterNum", 852246,
		 * "panId", 86969); model.put("idsMap", idsMap);
		 */
		
		List<Employee> empList = List.of(new Employee(10, "sachin", "batsman", 23456.0),new Employee(7, "Dhoni", "Keeper", 453456.0),
				                           new Employee(18, "kohli", "captain", 234656.0));
		model.put("empList", empList);
		
		Employee employee = new Employee(45, "rohith", "Batsman", 589556.00);
		model.put("employee", employee);
		
		return "show_report";
	}
}
