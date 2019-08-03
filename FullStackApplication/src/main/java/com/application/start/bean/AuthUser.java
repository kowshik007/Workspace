package com.application.start.bean;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="auth_user")
public class AuthUser {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="username")
	private String username;
	@Column(name="userpassword")
	private String userpassword;
	@Column(name="lastlogintime")
	private Timestamp lastlogintime;
	@Column(name="created_timestamp")
	private Timestamp created_timestamp;
	@Column(name="modified_timestamp")
	private Timestamp modified_timestamp;
	public int getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public Timestamp getLastlogintime() {
		return lastlogintime;
	}
	public void setLastlogintime(Timestamp lastlogintime) {
		this.lastlogintime = lastlogintime;
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