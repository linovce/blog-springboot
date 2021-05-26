package com.linovce.blog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

public class Comment{
	
	private Integer commentId;
	private Integer articleId;
	private String replyCommentId;
	private Integer isParent;
	private String commentDetail;
	private String userName;
	private String userEmail;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Integer appreciate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private java.util.Date createDate;
	
	public void setCommentId(Integer commentId){
		this.commentId = commentId;
	}
	
	public Integer getCommentId(){
		return this.commentId;
	}
	public void setArticleId(Integer articleId){
		this.articleId = articleId;
	}
	
	public Integer getArticleId(){
		return this.articleId;
	}
	public void setReplyCommentId(String replyCommentId){
		this.replyCommentId = replyCommentId;
	}
	
	public String getReplyCommentId(){
		return this.replyCommentId;
	}
	public void setIsParent(Integer isParent){
		this.isParent = isParent;
	}
	
	public Integer getIsParent(){
		return this.isParent;
	}
	public void setCommentDetail(String commentDetail){
		this.commentDetail = commentDetail;
	}
	
	public String getCommentDetail(){
		return this.commentDetail;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public String getUserName(){
		return this.userName;
	}
	public void setUserEmail(String userEmail){
		this.userEmail = userEmail;
	}
	
	public String getUserEmail(){
		return this.userEmail;
	}
	public void setAppreciate(Integer appreciate){
		this.appreciate = appreciate;
	}
	
	public Integer getAppreciate(){
		return this.appreciate;
	}
	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}
	
	public java.util.Date getCreateDate(){
		return this.createDate;
	}
}