package com.scework.business.login.service;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scework.business.user.dao.UserManageDao;
import com.scework.spi.constants.UserConstants;
import com.scework.spi.po.user.UserPO;
import com.system.SystemConstants;
import com.system.exception.SystemException;
@Service("loginBio")
public class LoginServiceImp implements LoginService {
	private static final Logger LOGGER=LogManager.getLogger(LoginServiceImp.class);
	@Autowired
	private UserManageDao userManageDao;
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hdms.system.login.bio.LoginBio#checkUser(java.util.Map,
	 * java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	public UserPO checkUser(Map session, UserPO po, String ipAddr)
			throws SystemException {
		
		return po;
	}

	@Override
	public void removeSession(Map session) {
		session.remove("curUser");
	}

	/**
	 * get userManageDao
	 * @return  the userManageDao
	 * @since   V1.0
	 */
	
	public UserManageDao getUserManageDao() {
		return userManageDao;
	}

	/**
	 * @param userManageDao the userManageDao to set
	 */
	public void setUserManageDao(UserManageDao userManageDao) {
		this.userManageDao = userManageDao;
	}
}
