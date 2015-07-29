package com.scework.spi.po.common;

import java.util.Map;

import com.system.po.CommonPO;

public class CityPO extends CommonPO{
	private int cityId;//cityId
	private String cityName;//cityName
	private String cityEnName;//EnglishName
	private int parentId;//ParentId
	private int areaLevel;//区域等级(1省/2市/3区县)
	private int status;//状态（1可用/0不可用）
	/**
	 * CityPO.
	 * com.scework.spi.po.common.CityPO.java.CityPO
	 * since v1.0
	 */
	public CityPO(){
		
	}
	/**
	 * CityPO.
	 * com.scework.spi.po.common.CityPO.java.CityPO
	 * @param cityId
	 * since v1.0
	 */
	public CityPO(int cityId){
		this.cityId=cityId;
	}
	/**
	 * CityPO.
	 * com.scework.spi.po.common.CityPO.java.CityPO
	 * @param map
	 * since v1.0
	 */
	public CityPO(Map<String,Object> map){
		this.cityId=getIntValue("city_id",map);
		this.cityName=getStrValue("city_name",map);
		this.cityEnName=getStrValue("area_enname",map);
		this.parentId=getIntValue("parent_id",map);
		this.areaLevel=getIntValue("area_level",map);
		this.status=getIntValue("status",map);
	}
	/**
	 * get cityId
	 * @return  the cityId
	 * @since   V1.0
	 */
	
	public int getCityId() {
		return cityId;
	}
	/**
	 * @param cityId the cityId to set
	 */
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	/**
	 * get cityName
	 * @return  the cityName
	 * @since   V1.0
	 */
	
	public String getCityName() {
		return cityName;
	}
	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * get cityEnName
	 * @return  the cityEnName
	 * @since   V1.0
	 */
	
	public String getCityEnName() {
		return cityEnName;
	}
	/**
	 * @param cityEnName the cityEnName to set
	 */
	public void setCityEnName(String cityEnName) {
		this.cityEnName = cityEnName;
	}
	/**
	 * get parentId
	 * @return  the parentId
	 * @since   V1.0
	 */
	
	public int getParentId() {
		return parentId;
	}
	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	
	/**
	 * get status
	 * @return  the status
	 * @since   V1.0
	 */
	
	public int getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	/**
	 * get areaLevel
	 * @return  the areaLevel
	 * @since   V1.0
	 */
	
	public int getAreaLevel() {
		return areaLevel;
	}
	/**
	 * @param areaLevel the areaLevel to set
	 */
	public void setAreaLevel(int areaLevel) {
		this.areaLevel = areaLevel;
	}
	
	
}
