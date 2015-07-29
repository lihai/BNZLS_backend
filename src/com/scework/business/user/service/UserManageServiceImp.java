package com.scework.business.user.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scework.business.user.dao.UserManageDao;
@Service("UserManageBio")
public class UserManageServiceImp implements UserManageService {
	private static final Logger LOGGER=LogManager.getLogger(UserManageServiceImp.class);
	@Autowired
	private UserManageDao dao;
	/**
	 * get dao
	 * @return  the dao
	 * @since   V1.0
	 */
	public UserManageDao getDao() {
		return dao;
	}
	/**
	 * @param dao the dao to set
	 */
	public void setDao(UserManageDao dao) {
		this.dao = dao;
	}
	
}
