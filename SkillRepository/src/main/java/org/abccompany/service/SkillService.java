package org.abccompany.service;

import java.util.List;

import org.abccompany.domain.Skills;
import org.abccompany.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {

	@Autowired
	private SkillsRepository skillRepository;
	
	/**
	 * @return
	 */
	public List<Skills> getAllSkills () {
		return (List<Skills>) skillRepository.findAll();
	}
}
