create database pagir;

create table pagir.user_basic_info
(
username varchar(25),
password varchar(100),
email varchar(100),
gender char(1),
user_type char(4),
crte_timestamp timestamp,
last_upd_timestamp timestamp,
);

drop table pagir.user_extra_info
create table pagir.user_extra_info
(
user_id bigint primary key,
username varchar(25),
full_nme varchar(100),
gender char(1),
dob timestamp,
contact_num varchar(26),
e1_contact_num varchar(26),
e2_contact_num varchar(26)
e_msg varchar(160),
dr_lic_numb varchar(25),
dr_lic_exp timestamp,
crte_timestamp timestamp
last_upd_timestamp timestamp,
contraint fk_username FOREIGN KEY(username) REFERENCES pagir.user_basic_info(username));


create table pagir.user_images
(
username varchar(25),
dr_lic_img blob,
other_id blob,
upd_timestamp timestamp
last_upd_timestamp timestamp,
contraint fk_username FOREIGN KEY(username) REFERENCES pagir.user_basic_info(username) 
);

create table pagir.user_activities;
create table pagir.user_requests;
create table pagir.user_current_location;
