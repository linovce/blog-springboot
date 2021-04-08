package com.linovce.blog.entity;

public class Article{
	
	private Integer articleId;
	private String articleName;
	private String content;
	private String summary;
	private String homePicture;
	private String labels;
	private String classifications;
	private Integer appreciate;
	private Integer views;
	private Integer original;
	private Integer isComments;
	private Integer isCopyright;
	private Integer isPublish;
	private java.util.Date createDate;
	private java.util.Date doneDate;
	
	public void setArticleId(Integer articleId){
		this.articleId = articleId;
	}
	
	public Integer getArticleId(){
		return this.articleId;
	}
	public void setArticleName(String articleName){
		this.articleName = articleName;
	}
	
	public String getArticleName(){
		return this.articleName;
	}
	public void setContent(String content){
		this.content = content;
	}
	
	public String getContent(){
		return this.content;
	}
	public void setHomePicture(String homePicture){
		this.homePicture = homePicture;
	}
	
	public String getHomePicture(){
		return this.homePicture;
	}
	public void setLabels(String labels){
		this.labels = labels;
	}
	
	public String getLabels(){
		return this.labels;
	}
	public void setClassifications(String classifications){
		this.classifications = classifications;
	}
	
	public String getClassifications(){
		return this.classifications;
	}
	public void setAppreciate(Integer appreciate){
		this.appreciate = appreciate;
	}
	
	public Integer getAppreciate(){
		return this.appreciate;
	}
	public void setViews(Integer views){
		this.views = views;
	}
	
	public Integer getViews(){
		return this.views;
	}
	public void setOriginal(Integer original){
		this.original = original;
	}
	
	public Integer getOriginal(){
		return this.original;
	}
	public void setIsComments(Integer isComments){
		this.isComments = isComments;
	}
	
	public Integer getIsComments(){
		return this.isComments;
	}
	public void setIsCopyright(Integer isCopyright){
		this.isCopyright = isCopyright;
	}
	
	public Integer getIsCopyright(){
		return this.isCopyright;
	}
	public void setIsPublish(Integer isPublish){
		this.isPublish = isPublish;
	}
	
	public Integer getIsPublish(){
		return this.isPublish;
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

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
}
