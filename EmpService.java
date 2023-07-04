package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Employee;
import com.example.demo.repo.AddressRepo;
import com.example.demo.repo.DeptRepo;
import com.example.demo.repo.EmpInterface;



public class EmpService {
	
	@Autowired
	private EmpInterface empRepo;
	
	@Autowired
	private DeptRepo deptRepo;
	
	@Autowired
	private AddressRepo addressRepo;
	
	public Employee getEmployee(int id) {
		int deptId=getDeptId(id);
		Department dept=deptRepo.getById(deptId);
		int addrId=getAddress(id);
		Department dept=deptRepo.getById(addrId);
	    Employee emp=empRepo.getById(id);
	    emp.setDepartentid(deptId);
	    emp.setAddressId(addrId);
	    return emp;
	}
	
	public void addEmployee(Employee emp) {
		empRepo.save(emp);
	}
	
	public Employee getEmpbyDept(int deptId) {
		Employee emp=empRepo.getByDeptId(deptId);
		return emp;

	}
}
