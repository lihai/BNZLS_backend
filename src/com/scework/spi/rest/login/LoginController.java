package com.scework.spi.rest.login;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scework.business.login.service.LoginService;
import com.scework.spi.po.user.UserPO;
import com.system.view.BaseSupportController;

@Controller
@RequestMapping("/")
public class LoginController extends BaseSupportController{
	/**
	 * LoginController.java[long]
	 * serialVersionUID
	 * @since V1.0
	 */
	private static final long serialVersionUID = -3900924961212330241L;
	private static final Logger LOGGER=LogManager.getLogger(LoginController.class);
	@Autowired
	private LoginService loginBio; // BIO
	
	@RequestMapping(value = "/checksession", method = RequestMethod.GET)
	public String valiteSession(HttpServletResponse response) throws IOException{
		ajax=String.valueOf(checkSession());
		ajax=System.getenv().toString();
		LOGGER.debug(ajax);
		writeHtml(response,ajax);
		return null;
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String checkUser(@ModelAttribute("person") UserPO dto, Model mode,HttpServletResponse response)
			throws IOException {
		
		LOGGER.debug(ajax);
		writeHtml(response,ajax);
		return null;
	}
	
	
	

	/**
	 * get loginBio
	 * 
	 * @return the loginBio
	 * @since V1.0
	 */

	public LoginService getLoginBio() {
		return loginBio;
	}

	/**
	 * @param loginBio
	 *            the loginBio to set
	 */
	public void setLoginBio(LoginService loginBio) {
		this.loginBio = loginBio;
	}
}
