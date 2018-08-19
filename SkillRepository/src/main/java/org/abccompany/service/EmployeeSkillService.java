package org.abccompany.service;

import java.util.ArrayList;
import java.util.List;

import org.abccompany.domain.EmployeeSkills;
import org.abccompany.repository.EmployeeSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeSkillService {
	
	@Autowired
	private EmployeeSkillRepository employeeSkillsRepository;
	
	/**
	 * @return
	 */
	public List<EmployeeSkills> getAllSkillsForAllEmployees () {
		return (List<EmployeeSkills>) employeeSkillsRepository.findAll();
	}
	
	/**
	 * @param employeeId
	 * @return
	 */
	public List<EmployeeSkills> getSkillsByEmployee (String employeeId) {
		System.out.println("Inside Service :: "+employeeId);
		List<EmployeeSkills> employeeSkills = new ArrayList<>();
		employeeSkillsRepository.findByEmployeeId (employeeId).forEach(employeeSkills :: add);
		return employeeSkills;
	}
	
	/**
	 * @param employeeSkills
	 */
	public void addSkillsForEmployee (List<EmployeeSkills> employeeSkills) {
		for (EmployeeSkills employeeSkill : employeeSkills) {
			employeeSkillsRepository.save(employeeSkill);
		}
	}
}
