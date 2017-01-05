package com.ymt.test.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

import com.ymt.test.dao.DemoDao;
import com.ymt.test.dao.DemoRepository;
import com.ymt.test.domain.Demo;

@Service
public class DemoService {
	
	@Resource
	public DemoRepository demoRepository;
	
	@Resource
	private DemoDao demoDao;
	
	
	@Transactional
	public void save(Demo demo){
		demoRepository.save(demo);
	}
	
	public Demo getByid(long id){
		return demoDao.getById(id);
	}

}
