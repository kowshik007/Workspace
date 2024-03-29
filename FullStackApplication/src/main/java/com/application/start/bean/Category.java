package com.application.start.bean;

import java.sql.Timestamp;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="category")
class Category {
	@Id
	@Column(name="id")
	private short id;
	@Column(name="category_name")
	private String category_name;
	@Column(name="category_image")
	private Blob category_image;
	@Column(name="seo_title")
	private String seo_title;
	@Column(name="seo_keywords")
	private String seo_keywords;
	@Column(name="seo_metadata")
	private String seo_metadata;
	@Column(name="created_timestamp")
	private Timestamp created_timestamp;
	@Column(name="modified_timestamp")
	private Timestamp modified_timestamp;
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public Blob getCategory_image() {
		return category_image;
	}
	public void setCategory_image(Blob category_image) {
		this.category_image = category_image;
	}
	public String getSeo_title() {
		return seo_title;
	}
	public void setSeo_title(String seo_title) {
		this.seo_title = seo_title;
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
	public short getId() {
		return id;
	}
}
