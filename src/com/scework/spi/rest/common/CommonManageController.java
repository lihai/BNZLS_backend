package com.scework.spi.rest.common;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scework.business.common.service.CommonManageService;
import com.scework.spi.po.common.ParamPO;
import com.system.view.BaseSupportController;
@Controller
@RequestMapping("/common")
public class CommonManageController extends BaseSupportController{
	/**
	 * CommonManageController.java[long]
	 * serialVersionUID
	 * @since V1.0
	 */
	private static final long serialVersionUID = -6827148502552640633L;
	@Autowired
	private CommonManageService commonManageBio;
	
	@RequestMapping(value = "/getCityList")
	public String getCityList(HttpServletResponse response) throws IOException{
		ajax=commonManageBio.getAllCityList();
		writeHtml(response,ajax);
		return null;
	}
	
	@RequestMapping(value = "/getParamList/{paramName}")
	public String getParamList(@PathVariable String paramName,HttpServletResponse response) throws IOException{
		ajax=commonManageBio.getParamList(new ParamPO(paramName));
		writeHtml(response,ajax);
		return null;
	}
	
	/**
	 * get commonManageBio
	 * @return  the commonManageBio
	 * @since   V1.0
	 */
	
	public CommonManageService getCommonManageBio() {
		return commonManageBio;
	}
	/**
	 * @param commonManageBio the commonManageBio to set
	 */
	public void setCommonManageBio(CommonManageService commonManageBio) {
		this.commonManageBio = commonManageBio;
	}
	
}
