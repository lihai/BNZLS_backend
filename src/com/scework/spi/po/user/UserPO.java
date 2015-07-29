package com.scework.spi.po.user;

import com.system.po.CommonPO;

public class UserPO extends CommonPO{
	private int id;//ID
	private String username;//UserName
	private String name;//Name
	private char gender='M';//Gender
	private String phone;//Phone
	private String oldPhone;//OldPhone
	private String newPhone;//NewPhone
	private String email;//Email
	private String cityCode;//CityCode
	private String addr;//Address
	private String picName;//PicName
	
	/**
	 * get id
	 * @return  the id
	 * @since   V1.0
	 */
	
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * get username
	 * @return  the username
	 * @since   V1.0
	 */
	
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * get name
	 * @return  the name
	 * @since   V1.0
	 */
	
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * get gender
	 * @return  the gender
	 * @since   V1.0
	 */
	
	public char getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}
	/**
	 * get phone
	 * @return  the phone
	 * @since   V1.0
	 */
	
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * get oldPhone
	 * @return  the oldPhone
	 * @since   V1.0
	 */
	
	public String getOldPhone() {
		return oldPhone;
	}
	/**
	 * @param oldPhone the oldPhone to set
	 */
	public void setOldPhone(String oldPhone) {
		this.oldPhone = oldPhone;
	}
	/**
	 * get newPhone
	 * @return  the newPhone
	 * @since   V1.0
	 */
	
	public String getNewPhone() {
		return newPhone;
	}
	/**
	 * @param newPhone the newPhone to set
	 */
	public void setNewPhone(String newPhone) {
		this.newPhone = newPhone;
	}
	/**
	 * get email
	 * @return  the email
	 * @since   V1.0
	 */
	
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * get cityCode
	 * @return  the cityCode
	 * @since   V1.0
	 */
	
	public String getCityCode() {
		return cityCode;
	}
	/**
	 * @param cityCode the cityCode to set
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	/**
	 * get addr
	 * @return  the addr
	 * @since   V1.0
	 */
	
	public String getAddr() {
		return addr;
	}
	/**
	 * @param addr the addr to set
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}
	/**
	 * get picName
	 * @return  the picName
	 * @since   V1.0
	 */
	
	public String getPicName() {
		return picName;
	}
	/**
	 * @param picName the picName to set
	 */
	public void setPicName(String picName) {
		this.picName = picName;
	}

}
