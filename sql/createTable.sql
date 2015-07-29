###################################################################################################################################################
#																																				  #
#					FindLawer Create Table Scripts                                              												  #
#																		  																		  #
###################################################################################################################################################
#************************************************************create database hdms******************************************************************
DROP SCHEMA IF EXISTS `mfzls` ;
CREATE SCHEMA IF NOT EXISTS `mfzls` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `mfzls` ;
drop user mfzls_user;
create user 'mfzls_user' identified by 'mfzls_user';
grant select on table `mfzls`.* TO 'mfzls_user';
grant select, insert, TRIGGER, UPDATE, DELETE on table `mfzls`.* TO 'mfzls_user';
#--------------------------------------------------------------System Management-------------------------------------------------------------------
DROP TABLE IF EXISTS `mfzls`.`tab_city` ;
CREATE TABLE IF NOT EXISTS `mfzls`.`tab_city`
(
  area_id    int(18) not null comment '区域编号',
  area_name  VARCHAR(50) not null comment '区域名称',
  area_enname VARCHAR(50) not null comment '区域名称(English)',
  parent_id  int(18) not null comment '父级编号',
  area_level int(3) not null comment '区域等级(1省/2市/3区县)',
  status     int(1) default 1 not null comment '状态（1可用/0不可用）'
);

alter table tab_city add constraint pk_city primary key (area_id);
alter table tab_city add constraint uk_city unique (area_id, parent_id);


source initTable.sql