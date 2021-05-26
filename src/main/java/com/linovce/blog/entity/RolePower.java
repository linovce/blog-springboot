package com.linovce.blog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

public class RolePower{
	
	private Integer rolePowerId;
	private Integer powerId;
	private Integer roleId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private java.util.Date createDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private java.util.Date doneDate;
	
	public void setRolePowerId(Integer rolePowerId){
		this.rolePowerId = rolePowerId;
	}
	
	public Integer getRolePowerId(){
		return this.rolePowerId;
	}
	public void setPowerId(Integer powerId){
		this.powerId = powerId;
	}
	
	public Integer getPowerId(){
		return this.powerId;
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