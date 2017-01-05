package com.ymt.test.dao.impl;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ymt.test.dao.TemplateDao;
import com.ymt.test.domain.TemplateModel;

@Repository
public class TemplateDaoImpl implements TemplateDao{
	
	@Resource
	private TemplateInterface templateInterface;

	@Transactional
	public String saveTemplate(TemplateModel templateModel) {
		templateInterface.save(templateModel);
		return "保存成功";
	}

	@Transactional
	public Page getTemplateList(Integer page, Integer size, String sort) {
		Sort sortRequest=new Sort(Sort.Direction.DESC, sort);
		Pageable pageable=new PageRequest(page, size, sortRequest);
		return templateInterface.findAll(pageable);
	}

	public TemplateModel getTemplateById(Integer templateId) {
		return templateInterface.findOne(templateId);
	}




}
