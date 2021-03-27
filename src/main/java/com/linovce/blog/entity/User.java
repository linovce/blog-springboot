package com.linovce.blog.entity;

public class User{
	
	private Integer userId;
	private String userName;
	private String password;
	private String email;
	private String type;
	private java.util.Date createDate;
	private java.util.Date doneDate;
	
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	
	public Integer getUserId(){
		return this.userId;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public String getUserName(){
		return this.userName;
	}
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return this.password;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return this.email;
	}
	public void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return this.type;
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