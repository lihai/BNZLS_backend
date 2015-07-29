package com.scework.spi.action.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.scework.business.login.service.LoginService;
import com.scework.spi.po.user.UserPO;
import com.system.struts.action.BaseSupportPageJsonAction;

public class LoginAction extends BaseSupportPageJsonAction implements
ModelDriven<UserPO>{

	/**
	 * LoginAction.java[long]
	 * serialVersionUID
	 * @since V1.0
	 */
	private static final long serialVersionUID = -499319278324611026L;
	private static final Logger LOGGER = LogManager
			.getLogger(LoginAction.class);
	
	@Autowired
	private LoginService loginBio; // BIO
	private UserPO dto = new UserPO();
	

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		return "login";
	}
	
	/**
	 * ºÏ≤È”√ªß
	 * 
	 * @return
	 * @throws Exception
	 */
	public String checkUser() {
		return "ajax";
	}
	
	@Override
	public UserPO getModel() {
		// TODO Auto-generated method stub
		return dto;
	}

	/**
	 * get loginBio
	 * @return  the loginBio
	 * @since   V1.0
	 */
	
	public LoginService getLoginBio() {
		return loginBio;
	}

	/**
	 * @param loginBio the loginBio to set
	 */
	public void setLoginBio(LoginService loginBio) {
		this.loginBio = loginBio;
	}

	/**
	 * get dto
	 * @return  the dto
	 * @since   V1.0
	 */
	
	public UserPO getDto() {
		return dto;
	}

	/**
	 * @param dto the dto to set
	 */
	public void setDto(UserPO dto) {
		this.dto = dto;
	}

}
