package org.abccompany.repository;

import java.util.List;

import org.abccompany.domain.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {
	/**
	 * @param id
	 * @return list of employee
	 */
	public List<Employee> findById (String id);
}