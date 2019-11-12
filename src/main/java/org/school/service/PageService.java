package org.school.service;

import java.util.List;

import org.school.PageRepository;
import org.school.model.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames={"page"})
public class PageService {

	@Autowired
	private PageRepository pageRepository;
	
	@Cacheable
	public List<Page> findAll(){
		return pageRepository.findAll();
	}
}
