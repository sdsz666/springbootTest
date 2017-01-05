package com.ymt.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ymt.test.domain.Demo;


@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@RequestMapping("/getDemo")
	public Demo getDemo(){
		Demo demo=new Demo();
		demo.setId(1);
		demo.setName("Angel2333");
		return demo;
	}
	@RequestMapping("/zeroException")
	public int zeroException(){
		return 100/0;
	}

}
