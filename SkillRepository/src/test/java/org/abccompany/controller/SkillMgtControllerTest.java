package org.abccompany.controller;

import java.util.List;

import org.abccompany.conroller.SkillManagementController;
import org.abccompany.domain.Employee;
import org.abccompany.domain.EmployeeSkills;
import org.abccompany.domain.Skills;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static java.util.Collections.singletonList;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@WebMvcTest(SkillManagementController.class)
public class SkillMgtControllerTest {
	
	   @Autowired
	   private MockMvc mvc;
	   
	   @MockBean
	   private SkillManagementController skillManagementController;
	   
	   @Test
	   public void getAllSkillsForAllEmployees() throws Exception {
	       Employee employee = new Employee();
	       employee.setId("312693");
	       
	       Skills skills = new Skills();
	       skills.setSkillId("SK001");
	       skills.setSkillCategory("Technical");
	       skills.setSkillName("Java");
	       
	       EmployeeSkills employeeSkills = new EmployeeSkills();
	       employeeSkills.setEmployee(employee);
	       employeeSkills.setSkills(skills);
	       employeeSkills.setYearsOfExp("12");
	       employeeSkills.setProficiencyLevel("4");
	       
	       List<EmployeeSkills> empSkills = singletonList(employeeSkills);	       
	       given(skillManagementController.getAllSkillsForAllEmployees()).willReturn (empSkills);
	   }
	   
	   
}
