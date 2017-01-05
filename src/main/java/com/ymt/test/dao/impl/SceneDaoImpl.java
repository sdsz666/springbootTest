package com.ymt.test.dao.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.ymt.test.dao.SceneDao;
import com.ymt.test.domain.SceneModel;


@Repository
public class SceneDaoImpl implements SceneDao{

	@Resource
	private SceneInterface sceneInterface;
	
	@Transactional
	public String saveScene(SceneModel sceneModel) {
		sceneInterface.save(sceneModel);
		return "新增成功";
	}

	@Transactional
	public Page getSceneList(Integer page, Integer size, String sort) {
		Sort sortRequest=new Sort(Sort.Direction.DESC, sort);
		Pageable pageable=new PageRequest(page, size, sortRequest);
		return sceneInterface.findAll(pageable);
	}

	public SceneModel getScenenById(Integer sceneId) {
		return sceneInterface.findOne(sceneId);
	}


}
