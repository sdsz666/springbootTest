package com.ymt.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ymt.test.domain.Demo;
import com.ymt.test.service.DemoService;

@RestController
@RequestMapping("/demo2")
public class Demo2Controller {
	/*@Resource
	private DemoService demoService;*/
	private DemoService demoService=new DemoService();
	
	
	@RequestMapping("/save")
	public String save(){
		Demo d=new Demo();
		d.setName("Angel");
		demoService.save(d);
		return "ok.Demo2Controller.save";
	}
	
	@RequestMapping("/getById")
	public Demo getById(long id){
		
		return demoService.getByid(id);
		
	}

}
