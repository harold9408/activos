package com.harold.activos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.harold.activos.common.GenericServiceImp;
import com.harold.activos.entity.Employee;
import com.harold.activos.repository.EmployeeRepository;

public class EmployeeServiceImpl extends GenericServiceImp<Employee, Long> implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public CrudRepository<Employee, Long> getRepository() {
		return employeeRepository;
	}

}
