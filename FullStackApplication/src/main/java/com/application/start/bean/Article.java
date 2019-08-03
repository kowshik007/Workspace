package com.application.start.bean;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="userid")
	private int userid;
	@Column(name="subcategory_id")
	private short subcategory_id;
	@Column(name="articlename")
	private String articlename;
	@Column(name="articledescription")
	private String articledescription;
	@Column(name="seo_keywords")
	private String seo_keywords;
	@Column(name="seo_metadata")
	private String seo_metadata;
	@Column(name="created_timestamp")
	private Timestamp created_timestamp;
	@Column(name="modified_timestamp")
	private Timestamp modified_timestamp;
	public int getId() {
		return id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public short getSubcategory_id() {
		return subcategory_id;
	}
	public void setSubcategory_id(short subcategory_id) {
		this.subcategory_id = subcategory_id;
	}
	public String getArticlename() {
		return articlename;
	}
	public void setArticlename(String articlename) {
		this.articlename = articlename;
	}
	public String getArticledescription() {
		return articledescription;
	}
	public void setArticledescription(String articledescription) {
		this.articledescription = articledescription;
	}
	public String getSeo_keywords() {
		return seo_keywords;
	}
	public void setSeo_keywords(String seo_keywords) {
		this.seo_keywords = seo_keywords;
	}
	public String getSeo_metadata() {
		return seo_metadata;
	}
	public void setSeo_metadata(String seo_metadata) {
		this.seo_metadata = seo_metadata;
	}
	public Timestamp getCreated_timestamp() {
		return created_timestamp;
	}
	public void setCreated_timestamp(Timestamp created_timestamp) {
		this.created_timestamp = created_timestamp;
	}
	public Timestamp getModified_timestamp() {
		return modified_timestamp;
	}
	public void setModified_timestamp(Timestamp modified_timestamp) {
		this.modified_timestamp = modified_timestamp;
	}	
}
