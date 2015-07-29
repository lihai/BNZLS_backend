package com.scework.business.common.service;

import com.scework.spi.po.common.ParamPO;

/**
 * @ClassName: com.scework.business.common.service.CommonManageService.java
 * @Description: TODO
 * @author TonyBen
 * @date 2015Äê4ÔÂ8ÈÕ
 * @version V1.0
 */
public interface CommonManageService {
	/**
	 * getAllCityList
	 * @return
	 * return String
	 * @exception  
	 * @since  V1.0
	 */
	String getAllCityList();
	/**
	 * getParamList
	 * @param po
	 * @return
	 * return String
	 * @exception  
	 * @since  V1.0
	 */
	String getParamList(ParamPO po);
}
