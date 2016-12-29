package com.ymatou.springboot;

import java.util.List;

public class ResponseBody {
	    private long id;//主键.

	    private String name;//测试名称.
	    
	    
	    private List<CaseModel> caseModels;
	    
	    
	    public List<CaseModel> getCaseModels() {
			return caseModels;
		}

		public void setCaseModels(List<CaseModel> caseModels) {
			this.caseModels = caseModels;
		}

		public long getId() {

	       return id;

	    }

	    public void setId(long id) {

	       this.id =id;

	    }

	    public String getName() {

	       return name;

	    }

	    public void setName(String name) {

	       this.name =name;

	    }
}
