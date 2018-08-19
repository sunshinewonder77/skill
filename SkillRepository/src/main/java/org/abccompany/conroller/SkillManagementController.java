package org.abccompany.conroller;

import java.util.List;

import org.abccompany.domain.Employee;
import org.abccompany.domain.EmployeeSkills;
import org.abccompany.domain.Skills;
import org.abccompany.service.EmployeeService;
import org.abccompany.service.EmployeeSkillService;
import org.abccompany.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillManagementController {
	
	@Autowired
	private EmployeeSkillService employeeSkillService;
	
	@Autowired
	private SkillService skillService;
	
	@Autowired
	private EmployeeService employeeService;
	
	/**
	 * This returns overall skills available in the company database based all the employee's in the company
	 * 
	 * @return
	 */
	@CrossOrigin(origins = "http://localhost")
	@RequestMapping (value="/employeeSkills")
	public List<EmployeeSkills> getAllSkillsForAllEmployees() {
		return employeeSkillService.getAllSkillsForAllEmployees();
	}
	
	/**
	 * This method returns all the skills defined in the skills table irrespective of the employee
	 * 
	 * @return
	 */
	@RequestMapping (value="/skills")
	public List<Skills> getAllSkills() {
		return skillService.getAllSkills();
	}
		
	/**
	 * This method returns all the employees and their details on the company's repository
	 * 
	 * @return
	 */
	@RequestMapping (value="/employees")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}
		
	/**
	 * This method returns all the skills specific to one employee
	 * 
	 * @param empId
	 * @return
	 */
	@RequestMapping (value="/employeeSkills/{empId}")
	public List<EmployeeSkills> getSkillsByEmployee (@PathVariable String empId) {
		List<EmployeeSkills> empList = employeeSkillService.getSkillsByEmployee(empId);
		return empList;
	}
	
	/**
	 * This method add all the skills what employee selected
	 * 
	 * @param employeeSkills
	 */
	@RequestMapping (method=RequestMethod.POST, value="/employeeSkills") 
	public void addSkillsForEmployee (@RequestBody List<EmployeeSkills>  employeeSkills) {
		employeeSkillService.addSkillsForEmployee(employeeSkills);
	}
}
