package com.ymatou.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//API
@RestController
@RequestMapping("/springboot")
public class HelloAPIController {
	 
	 @RequestMapping("/getCaseInfo")
	    public ResponseBody getCaseInfo( ){
		 	CaseModel aCaseModel = new CaseModel();
		 	aCaseModel.setCaseName("a");
		 	aCaseModel.setId(10);
		 
		 	CaseModel bCaseModel = new CaseModel();
		 	bCaseModel.setCaseName("b");
		 	bCaseModel.setId(11);
		 	
		 	List<CaseModel>  caseModels = new ArrayList<CaseModel>();
		 	caseModels.add(aCaseModel);
		 	caseModels.add(bCaseModel);
			 ResponseBody demo = new ResponseBody();

		       demo.setId(2);

		       demo.setName("Angel2");
		       
		       demo.setCaseModels(caseModels);
		       
		       

		       return demo;

	    }
	 
	 
	 @RequestMapping(value = "/saveCase",method = RequestMethod.POST )
	    public ResponseBody saveCase(@RequestBody RequestBodyTest requestBodyTest){
		 
		
		 ResponseBody demo = new ResponseBody();
		 demo.setId(requestBodyTest.getAge()+1);
		 return demo;
		 
		 
	 }
	 
	 
	 
	 
	 @RequestMapping(value ="/getDemo", method = RequestMethod.POST)

	    public ResponseBody getDemo( @RequestBody  RequestBodyTest userForm){
		 
		 if (userForm.getAge() ==1){
		 ResponseBody demo = new ResponseBody();

	       demo.setId(1);

	       demo.setName("Angel");

	       return demo;
		 }else{
			 ResponseBody demo = new ResponseBody();

		       demo.setId(2);

		       demo.setName("Angel2");

		       return demo;
		 }

	    }
}
