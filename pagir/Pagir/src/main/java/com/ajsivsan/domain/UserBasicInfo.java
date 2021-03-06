package com.ajsivsan.domain;

import java.sql.Date;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class UserBasicInfo {
	
	@Id
	private String username;
	private String password;
	private String email;
	private char gender;
	private String userType;
	private Date crte_timestamp;
	private Date last_upd_timestamp;
	
	private UserBasicInfo(){
		
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public Date getCrte_timestamp() {
		return crte_timestamp;
	}
	public void setCrte_timestamp(Date crte_timestamp) {
		this.crte_timestamp = crte_timestamp;
	}
	public Date getLast_upd_timestamp() {
		return last_upd_timestamp;
	}
	public void setLast_upd_timestamp(Date last_upd_timestamp) {
		this.last_upd_timestamp = last_upd_timestamp;
	}
	
}
