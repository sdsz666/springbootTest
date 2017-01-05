package com.ymt.test.dao;

import org.springframework.data.domain.Page;

import com.ymt.test.domain.TemplateModel;

public interface TemplateDao {
	public String saveTemplate(TemplateModel templateModel);
	
	public Page getTemplateList(Integer page,Integer size,String sort);
	
}
