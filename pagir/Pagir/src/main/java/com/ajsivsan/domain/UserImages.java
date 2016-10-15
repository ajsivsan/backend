package com.ajsivsan.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserImages {
	@Id
	private String username;
	private byte[] dr_lic_img;
	private byte[] other_id;
	private Date upd_timestamp;
	private Date last_upd_timestamp;
	//contraint fk_username FOREIGN KEY(username) REFERENCES pagir.user_basic_info(username) 
	private UserImages(){
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public byte[] getDr_lic_img() {
		return dr_lic_img;
	}
	public void setDr_lic_img(byte[] dr_lic_img) {
		this.dr_lic_img = dr_lic_img;
	}
	public byte[] getOther_id() {
		return other_id;
	}
	public void setOther_id(byte[] other_id) {
		this.other_id = other_id;
	}
	public Date getUpd_timestamp() {
		return upd_timestamp;
	}
	public void setUpd_timestamp(Date upd_timestamp) {
		this.upd_timestamp = upd_timestamp;
	}
	public Date getLast_upd_timestamp() {
		return last_upd_timestamp;
	}
	public void setLast_upd_timestamp(Date last_upd_timestamp) {
		this.last_upd_timestamp = last_upd_timestamp;
	}
	
}
