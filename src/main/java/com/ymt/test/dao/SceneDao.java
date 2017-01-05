package com.ymt.test.dao;

import org.springframework.data.domain.Page;

import com.ymt.test.domain.SceneModel;

public interface SceneDao {
	public String saveScene(SceneModel sceneModel);
	
	public Page getSceneList(Integer page,Integer size,String sort);
	
	public SceneModel getScenenById(Integer sceneId);

}
