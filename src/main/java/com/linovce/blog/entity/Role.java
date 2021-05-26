package com.linovce.blog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

public class Role{
	
	private Integer roleId;
	private String roleName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private java.util.Date createDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private java.util.Date doneDate;
	
	public void setRoleId(Integer roleId){
		this.roleId = roleId;
	}
	
	public Integer getRoleId(){
		return this.roleId;
	}
	public void setRoleName(String roleName){
		this.roleName = roleName;
	}
	
	public String getRoleName(){
		return this.roleName;
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