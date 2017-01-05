package com.ymt.test.dao.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ymt.test.domain.TemplateModel;

public interface TemplateInterface extends JpaRepository<TemplateModel, Integer> {

}
