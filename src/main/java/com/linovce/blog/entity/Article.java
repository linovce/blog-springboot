package com.linovce.blog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

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
	private boolean original;
	private boolean isComments;
	private boolean isCopyright;
	private boolean isPublish;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private java.util.Date createDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private java.util.Date doneDate;

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getHomePicture() {
		return homePicture;
	}

	public void setHomePicture(String homePicture) {
		this.homePicture = homePicture;
	}

	public String getLabels() {
		return labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
	}

	public String getClassifications() {
		return classifications;
	}

	public void setClassifications(String classifications) {
		this.classifications = classifications;
	}

	public Integer getAppreciate() {
		return appreciate;
	}

	public void setAppreciate(Integer appreciate) {
		this.appreciate = appreciate;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public boolean isOriginal() {
		return original;
	}

	public void setOriginal(boolean original) {
		this.original = original;
	}

	public boolean isComments() {
		return isComments;
	}

	public void setComments(boolean comments) {
		isComments = comments;
	}

	public boolean isCopyright() {
		return isCopyright;
	}

	public void setCopyright(boolean copyright) {
		isCopyright = copyright;
	}

	public boolean isPublish() {
		return isPublish;
	}

	public void setPublish(boolean publish) {
		isPublish = publish;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getDoneDate() {
		return doneDate;
	}

	public void setDoneDate(Date doneDate) {
		this.doneDate = doneDate;
	}
}
