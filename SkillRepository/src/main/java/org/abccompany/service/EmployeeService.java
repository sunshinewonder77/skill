package org.abccompany.service;

import java.util.List;

import org.abccompany.domain.Employee;
import org.abccompany.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	/**
	 * @return
	 */
	public List<Employee> getAllEmployee () {
		return (List<Employee>) employeeRepository.findAll();
	}
}
