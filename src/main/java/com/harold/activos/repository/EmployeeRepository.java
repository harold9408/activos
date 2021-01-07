package com.harold.activos.repository;

import org.springframework.data.repository.CrudRepository;

import com.harold.activos.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
