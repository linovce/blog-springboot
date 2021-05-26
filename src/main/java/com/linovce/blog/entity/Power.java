package com.linovce.blog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

public class Power{
	
	private Integer powerId;
	private String powerName;
	private String powerType;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private java.util.Date createDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private java.util.Date doneDate;
	
	public void setPowerId(Integer powerId){
		this.powerId = powerId;
	}
	
	public Integer getPowerId(){
		return this.powerId;
	}
	public void setPowerName(String powerName){
		this.powerName = powerName;
	}
	
	public String getPowerName(){
		return this.powerName;
	}
	public void setPowerType(String powerType){
		this.powerType = powerType;
	}
	
	public String getPowerType(){
		return this.powerType;
	}
	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}
	
	public java.util.Date getCreateDate(){
		return this.createDate;
	}
	public void setDoneDate(java.util.Date doneDate){
		this.doneDate = doneDate;
	}
	
	public java.util.Date getDoneDate(){
		return this.doneDate;
	}
}