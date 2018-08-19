package org.abccompany.repository;

import java.util.List;

import org.abccompany.domain.Skills;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends CrudRepository<Skills, String> {
	/**
	 * @param skillId
	 * @return list of skills
	 */
	public List<Skills> findBySkillId (String skillId);
}