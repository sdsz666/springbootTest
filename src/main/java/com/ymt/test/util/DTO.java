package com.ymt.test.util;

import java.util.Calendar;

import com.ymt.test.domain.CaseModel;
import com.ymt.test.domain.SceneModel;
import com.ymt.test.domain.TemplateModel;

public class DTO {
	public static void CaseDTO(CaseModel caseModel){	
		caseModel.setbDeleted(false);
		caseModel.setAddTime(Calendar.getInstance().getTime());		
	}
	
	public static void SceneDTO(SceneModel sceneModel){
	
	}
	
	public static void TemplateDTO(TemplateModel templateModel){
		
	}

}
