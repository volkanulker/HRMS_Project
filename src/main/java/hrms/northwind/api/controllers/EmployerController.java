package hrms.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.northwind.business.abstracts.EmployerService;
import hrms.northwind.entities.concretes.Employer;


@RestController
@RequestMapping("/api/employers")
public class EmployerController {
	private EmployerService employerService;
	@Autowired
	public EmployerController(EmployerService employerService) {
		this.employerService = employerService;
	}
	@GetMapping("/getall")
	public List<Employer> getAll(){
		return this.employerService.getAll();
	}
	

}
