package org.school.repository;

import java.util.List;

import org.school.model.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface PageRepository extends JpaRepository<Page, Integer>{

	public List<Page> findByParentId(@Param(value = "parentId") int parentId); 
}
