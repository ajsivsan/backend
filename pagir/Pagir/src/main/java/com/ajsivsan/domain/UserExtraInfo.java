package com.ajsivsan.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserExtraInfo {
	@Id
	@GeneratedValue
	private String user_id;
	private String username;
	private String full_nme;
	private char gender;
	private Date dob;
	private String contact_num;
	private String e1_contact_num;
	private String e2_contact_num;
	private String e_msg;
	private String dr_lic_numb;
	private String dr_lic_exp;
	private Date crte_timestamp;
	private Date last_upd_timestamp;
	//contraint fk_username FOREIGN KEY(username) REFERENCES pagir.user_basic_info(username));
	
	private UserExtraInfo(){
		
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFull_nme() {
		return full_nme;
	}
	public void setFull_nme(String full_nme) {
		this.full_nme = full_nme;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getContact_num() {
		return contact_num;
	}
	public void setContact_num(String contact_num) {
		this.contact_num = contact_num;
	}
	public String getE1_contact_num() {
		return e1_contact_num;
	}
	public void setE1_contact_num(String e1_contact_num) {
		this.e1_contact_num = e1_contact_num;
	}
	public String getE2_contact_num() {
		return e2_contact_num;
	}
	public void setE2_contact_num(String e2_contact_num) {
		this.e2_contact_num = e2_contact_num;
	}
	public String getE_msg() {
		return e_msg;
	}
	public void setE_msg(String e_msg) {
		this.e_msg = e_msg;
	}
	public String getDr_lic_numb() {
		return dr_lic_numb;
	}
	public void setDr_lic_numb(String dr_lic_numb) {
		this.dr_lic_numb = dr_lic_numb;
	}
	public String getDr_lic_exp() {
		return dr_lic_exp;
	}
	public void setDr_lic_exp(String dr_lic_exp) {
		this.dr_lic_exp = dr_lic_exp;
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
