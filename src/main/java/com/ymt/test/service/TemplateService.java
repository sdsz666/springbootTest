package com.ymt.test.service;

import java.util.Calendar;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.ymt.test.dao.TemplateDao;
import com.ymt.test.domain.TemplateModel;

@Service
public class TemplateService {
	
	@Resource
	private TemplateDao templateDao;
	
	@Transactional
	public String addTemplate(TemplateModel templateModel){
		templateModel.setTemplateId(null);
		templateModel.setAddTime(Calendar.getInstance().getTime());
		templateModel.setbDeleted(false);
		templateDao.saveTemplate(templateModel);
		return "新增成功";
	}
	
	@Transactional
	public Page getTemplateList(Integer page,Integer size){
		String sort="templateId";
		return templateDao.getTemplateList(page,size,sort);
	}
	
	@Transactional
	public String editTemplate(TemplateModel templateModel){
		templateDao.saveTemplate(templateModel);
		return "编辑成功";
	}
}
