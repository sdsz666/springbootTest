package com.ymt.test.dao.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ymt.test.domain.CaseModel;

public interface CaseInterface extends JpaRepository<CaseModel, Integer>{

}
