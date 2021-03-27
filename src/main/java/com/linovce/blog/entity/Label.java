package com.linovce.blog.entity;

public class Label{
	
	private Integer labelId;
	private String labelName;
	
	public void setLabelId(Integer labelId){
		this.labelId = labelId;
	}
	
	public Integer getLabelId(){
		return this.labelId;
	}
	public void setLabelName(String labelName){
		this.labelName = labelName;
	}
	
	public String getLabelName(){
		return this.labelName;
	}
}