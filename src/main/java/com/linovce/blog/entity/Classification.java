package com.linovce.blog.entity;

public class Classification{
	
	private Integer classificationId;
	private String classificationName;
	
	public void setClassificationId(Integer classificationId){
		this.classificationId = classificationId;
	}
	
	public Integer getClassificationId(){
		return this.classificationId;
	}
	public void setClassificationName(String classificationName){
		this.classificationName = classificationName;
	}
	
	public String getClassificationName(){
		return this.classificationName;
	}
}