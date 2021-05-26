package com.linovce.blog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

public class Menu{
	
	private Integer menuId;
	private String menuName;
	private String menuUrl;
	private Integer parentId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private java.util.Date createDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private java.util.Date doneDate;
	
	public void setMenuId(Integer menuId){
		this.menuId = menuId;
	}
	
	public Integer getMenuId(){
		return this.menuId;
	}
	public void setMenuName(String menuName){
		this.menuName = menuName;
	}
	
	public String getMenuName(){
		return this.menuName;
	}
	public void setMenuUrl(String menuUrl){
		this.menuUrl = menuUrl;
	}
	
	public String getMenuUrl(){
		return this.menuUrl;
	}
	public void setParentId(Integer parentId){
		this.parentId = parentId;
	}
	
	public Integer getParentId(){
		return this.parentId;
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