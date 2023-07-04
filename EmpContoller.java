package com.example.demo.controller;

import java.security.Provider.Service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;

@RestController
public class EmpContoller {

	@GetMapping("/getEmployee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		if(id != -1) {
			return Service.getEmployee(id);
		}else {
			return null;
		}
	}
	
	@PostMapping("/addEmployee")
	public void addEmployee(@RequestBody Employee emp) {
		service.addEmp(emp);
	}
	
	@GettMapping("/fetchEmployee/{id}")
	public void getEmployeebyDept(@PathVariable int deptId) {
		service.getEmpbyDept(deptId);
	}
	
}
