package com.ymt.test.controller;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ymt.test.domain.TemplateModel;
import com.ymt.test.service.TemplateService;

@RestController
@RequestMapping("/templateManage")
public class templateManageController {
	
	@Resource
	private TemplateService templateService;
	
	@RequestMapping(value="/addTemplate",method={RequestMethod.POST})
	public String addTemplate(@RequestBody TemplateModel templateModel){
		templateService.addTemplate(templateModel);
		return "添加成功";
	}
	
	@RequestMapping(value="/getTemplateList",method={RequestMethod.GET})
	public Page getTemplateList(@RequestParam Integer page,@RequestParam Integer size){
		return templateService.getTemplateList(page, size);
	}
	
	
	@RequestMapping(value="/editTemplate",method={RequestMethod.POST})
	public String editTemplate (@RequestBody TemplateModel templateModel){
		templateService.editTemplate(templateModel);
		return "修改成功";
	}

}
