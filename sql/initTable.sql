#####################################################################################################################################################
#																		  																		  	#
#					FindLawer Initsize Table Scripts                                            													#
#																		  																			#
#####################################################################################################################################################
truncate table tab_city;
insert into tab_city (AREA_ID, AREA_NAME,area_enname, PARENT_ID, AREA_LEVEL, STATUS) values (110000, '北京','BEI JING', 0, 1, 1);
insert into tab_city (AREA_ID, AREA_NAME,area_enname, PARENT_ID, AREA_LEVEL, STATUS) values (120000, '天津','TIAN JIN', 0, 1, 1);
insert into tab_city (AREA_ID, AREA_NAME,area_enname, PARENT_ID, AREA_LEVEL, STATUS) values (310000, '上海','SHANG HAI', 0, 1, 1);
insert into tab_city (AREA_ID, AREA_NAME,area_enname, PARENT_ID, AREA_LEVEL, STATUS) values (320100, '南京','NAN JING', 320000, 2, 1);
insert into tab_city (AREA_ID, AREA_NAME,area_enname, PARENT_ID, AREA_LEVEL, STATUS) values (320500, '苏州','SU ZHOU', 320000, 2, 1);
insert into tab_city (AREA_ID, AREA_NAME,area_enname, PARENT_ID, AREA_LEVEL, STATUS) values (440100, '广州','GUANG ZHOU', 440000, 2, 1);
insert into tab_city (AREA_ID, AREA_NAME,area_enname, PARENT_ID, AREA_LEVEL, STATUS) values (440300, '深圳','SHEN ZHEN', 440000, 2, 1);


truncate table tab_param;
insert into tab_param (type_name,type_value) values ('','');
commit;