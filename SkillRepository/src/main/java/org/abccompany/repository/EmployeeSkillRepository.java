package org.abccompany.repository;

import java.util.List;

import org.abccompany.domain.EmployeeSkills;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeSkillRepository extends CrudRepository<EmployeeSkills, String> {
	/**
	 * @param employeeId
	 * @return list of employee skills
	 */
	public List<EmployeeSkills> findByEmployeeId (String employeeId);
}
