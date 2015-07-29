package com.scework.spi.po.common;

import java.util.Map;

import com.system.po.CommonPO;
/**
 * @ClassName: com.scework.spi.po.common.ParamPO.java
 * @Description: TODO
 * @author TonyBen
 * @date 2015Äê4ÔÂ8ÈÕ
 * @version V1.0
 */
public class ParamPO extends CommonPO {
	private int id;
	private String paramName;
	private String paramValue;
	public ParamPO(){
		
	}
	public ParamPO(String paramName){
		this.paramName=paramName;
	}
	public ParamPO(String paramName,String paramValue){
		this.paramName=paramName;
		this.paramValue=paramValue;
	}
	public ParamPO(int id,String paramName,String paramValue){
		this.id=id;
		this.paramName=paramName;
		this.paramValue=paramValue;
	}
	public ParamPO(Map<String,Object> map){
		this.id=getIntValue("id",map);
		this.paramName=getStrValue("param_name",map);
		this.paramValue=getStrValue("param_value",map);
	}
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
	 * get paramName
	 * @return  the paramName
	 * @since   V1.0
	 */
	
	public String getParamName() {
		return paramName;
	}
	/**
	 * @param paramName the paramName to set
	 */
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	/**
	 * get paramValue
	 * @return  the paramValue
	 * @since   V1.0
	 */
	
	public String getParamValue() {
		return paramValue;
	}
	/**
	 * @param paramValue the paramValue to set
	 */
	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}
	
}
