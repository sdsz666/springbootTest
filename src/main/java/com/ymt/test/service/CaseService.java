package com.ymt.test.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.ymt.test.dao.CaseDao;
import com.ymt.test.domain.CaseModel;
import com.ymt.test.util.DTO;



@Service
public class CaseService {
	

	@Resource
	private CaseDao caseDao;
	

	@Transactional
	public String saveCase(CaseModel caseModel){
		DTO.CaseDTO(caseModel);
		return caseDao.saveCase(caseModel);
	}
	
	@Transactional
	public CaseModel getCaseByCaseId(Integer caseId){
		return caseDao.getCaseByCaseId(caseId);
	}
	
	@Transactional
	public Page getCaseList(Integer page,Integer size){
		String sort="caseId";
		return caseDao.getCaseList(page,size,sort);
	}
	
	@Transactional
	public String editCase(CaseModel caseModel){
		caseModel.setbDeleted(false);
		caseDao.saveCase(caseModel);
		return "编辑成功";
	}
	
/*	public List<CaseModel> getCaseList(){
		return null;
	}
	*/

	
}
