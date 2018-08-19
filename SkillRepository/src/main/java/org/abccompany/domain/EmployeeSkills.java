package org.abccompany.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "employee_skills")
public class EmployeeSkills {
	@Id
    @Column(name = "row_id")
	@GeneratedValue (strategy = GenerationType.TABLE)
    private Integer id;
	
	@ManyToOne
    @JoinColumn (name = "id", nullable = false)
	private Employee employee;
	
	@ManyToOne
    @JoinColumn (name = "skill_id", nullable = false)
	private Skills skills;
	
	@NotNull
    @Column(name = "proficiency_level")
	private String proficiencyLevel;
	
	@NotNull
    @Column(name = "years_of_exp")
	private String yearsOfExp;

	public EmployeeSkills() {
	}

	public EmployeeSkills(Integer id, Employee employee, Skills skills, String proficiencyLevel, String yearsOfExp) {
		super();
		this.id = id;
		this.employee = employee;
		this.skills = skills;
		this.proficiencyLevel = proficiencyLevel;
		this.yearsOfExp = yearsOfExp;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Skills getSkills() {
		return skills;
	}

	public void setSkills(Skills skills) {
		this.skills = skills;
	}

	public String getProficiencyLevel() {
		return proficiencyLevel;
	}

	public void setProficiencyLevel(String proficiencyLevel) {
		this.proficiencyLevel = proficiencyLevel;
	}

	public String getYearsOfExp() {
		return yearsOfExp;
	}

	public void setYearsOfExp(String yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}

	@Override
	public String toString() {
		return "EmployeeSkills [id=" + id + ", employee=" + employee + ", skills=" + skills + ", proficiencyLevel="
				+ proficiencyLevel + ", yearsOfExp=" + yearsOfExp + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employee == null) ? 0 : employee.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((proficiencyLevel == null) ? 0 : proficiencyLevel.hashCode());
		result = prime * result + ((skills == null) ? 0 : skills.hashCode());
		result = prime * result + ((yearsOfExp == null) ? 0 : yearsOfExp.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeSkills other = (EmployeeSkills) obj;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (proficiencyLevel == null) {
			if (other.proficiencyLevel != null)
				return false;
		} else if (!proficiencyLevel.equals(other.proficiencyLevel))
			return false;
		if (skills == null) {
			if (other.skills != null)
				return false;
		} else if (!skills.equals(other.skills))
			return false;
		if (yearsOfExp == null) {
			if (other.yearsOfExp != null)
				return false;
		} else if (!yearsOfExp.equals(other.yearsOfExp))
			return false;
		return true;
	}
}
