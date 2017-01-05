package com.ymt.test.dao.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ymt.test.dao.CaseDao;
import com.ymt.test.domain.CaseModel;



@Repository
public class  CaseDaoImpl  implements CaseDao{

	@Resource
	private CaseInterface caseInterface;
	
	@Resource
	private JdbcTemplate jdbcTemplate;

	@Transactional
	public String saveCase(CaseModel caseModel) {
		caseInterface.save(caseModel);
		return "保存成功";
	}


	@Transactional
	public Page getCaseList(Integer page,Integer size,String sort) {
		Sort sortRequest=new Sort(Sort.Direction.DESC, sort);
		Pageable pageable=new PageRequest(page, size, sortRequest);
		return caseInterface.findAll(pageable);
	}

	@Transactional
	public CaseModel getCaseByCaseId(Integer caseId) {
		String sql="select * from case_model where case_id=?";
		RowMapper<CaseModel> rowMapper=new BeanPropertyRowMapper<CaseModel>(CaseModel.class);
		return jdbcTemplate.queryForObject(sql, rowMapper,caseId);
	}

	public List<CaseModel> getCaseListByUserId() {
		// TODO Auto-generated method stub
		return null;
	}


	public List<CaseModel> getCaseList() {
		// TODO Auto-generated method stub
		return null;
	}



	
	
	
}

