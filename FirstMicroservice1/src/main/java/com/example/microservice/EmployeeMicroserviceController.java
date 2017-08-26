package com.example.microservice;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.microservice.accounts.Employee;
import com.example.microservice.accounts.EmployeeRepository;


@RestController
@RequestMapping("/demo")

public class EmployeeMicroserviceController {
	
	@Autowired
	EmployeeRepository employeerepo;
	

	@RequestMapping(value="/greeting",method=RequestMethod.GET)
	public String getRequest(){
		return "This is Kumar Satyam";
		
	}
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(@RequestParam String name, @RequestParam String gender,@RequestParam String dept,@RequestParam String designation){
		
		Employee employee= new Employee();
		employee.setName(name);
		employee.setGender(gender);
		employee.setDept(dept);
		employee.setDesignation(designation);
		employeerepo.save(employee);
	
		return "saved";
		
	}
	
	
	@RequestMapping(value="findAll",method=RequestMethod.GET)
	public @ResponseBody Iterable<Employee> getAll(){
			
			return employeerepo.findAll();
			
		}
	
	@RequestMapping(value="/findone",method=RequestMethod.GET)
	public  String getOne(@RequestParam("id") int id){
			
		
			for(Employee emp:employeerepo.findAll()){
				ArrayList<String> list= new ArrayList<>();
				if(emp.getId()==id){
					list.add(emp.getDept());
					list.add(emp.getDesignation());
					System.out.println(emp.getDept()+":"+emp.getDesignation());
					String uri = "http://localhost:5002/getAllSalarySlab/"+emp.getDept()+"/"+emp.getDesignation();
					System.out.println("uri:"+uri);
					RestTemplate restTemplate = new RestTemplate();
					String result = restTemplate.getForObject(uri, String.class);
					System.out.println(result);
					return result;
				}
				else continue;
			}
			
			return "Cannot  call";
			
		}
	

}
