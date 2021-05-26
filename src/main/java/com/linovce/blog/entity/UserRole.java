package com.linovce.blog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

public class UserRole{
	
	private Integer userRoleId;
	private Integer userId;
	private Integer roleId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private java.util.Date createDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private java.util.Date doneDate;
	
	public void setUserRoleId(Integer userRoleId){
		this.userRoleId = userRoleId;
	}
	
	public Integer getUserRoleId(){
		return this.userRoleId;
	}
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	
	public Integer getUserId(){
		return this.userId;
	}
	public void setRoleId(Integer roleId){
		this.roleId = roleId;
	}
	
	public Integer getRoleId(){
		return this.roleId;
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