package com.ymt.test.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TemplateModel {
	@Id @GeneratedValue
	private Integer templateId;
	private String templateName;
	private String templateDetail;
	private String input2SqlMap;
	private String sql2MongoMap;
	private String output2SqlMap;
	private String output2MongoMap;
	private String BeforeToDo;
	private String AfterToDo;
	private Integer userId;
	private Date addTime;
	private boolean bDeleted;
	private String mark;
	
	public Integer getTemplateId() {
		return templateId;
	}
	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}
	public String getTemplateName() {
		return templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public String getTemplateDetail() {
		return templateDetail;
	}
	public void setTemplateDetail(String templateDetail) {
		this.templateDetail = templateDetail;
	}
	public String getInput2SqlMap() {
		return input2SqlMap;
	}
	public void setInput2SqlMap(String input2SqlMap) {
		this.input2SqlMap = input2SqlMap;
	}
	public String getSql2MongoMap() {
		return sql2MongoMap;
	}
	public void setSql2MongoMap(String sql2MongoMap) {
		this.sql2MongoMap = sql2MongoMap;
	}
	public String getOutput2SqlMap() {
		return output2SqlMap;
	}
	public void setOutput2SqlMap(String output2SqlMap) {
		this.output2SqlMap = output2SqlMap;
	}
	public String getOutput2MongoMap() {
		return output2MongoMap;
	}
	public void setOutput2MongoMap(String output2MongoMap) {
		this.output2MongoMap = output2MongoMap;
	}
	public String getBeforeToDo() {
		return BeforeToDo;
	}
	public void setBeforeToDo(String beforeToDo) {
		BeforeToDo = beforeToDo;
	}
	public String getAfterToDo() {
		return AfterToDo;
	}
	public void setAfterToDo(String afterToDo) {
		AfterToDo = afterToDo;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public boolean isbDeleted() {
		return bDeleted;
	}
	public void setbDeleted(boolean bDeleted) {
		this.bDeleted = bDeleted;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}


}
