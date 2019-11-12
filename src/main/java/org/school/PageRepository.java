package org.school;

import org.school.model.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PageRepository extends JpaRepository<Page, Integer>{

}
