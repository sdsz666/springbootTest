package com.ymt.test.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



import com.alibaba.fastjson.annotation.JSONField;

@Entity
public class Demo {
	@Id @GeneratedValue
	private long id;
	@JSONField(serialize=false)
	private String name;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
