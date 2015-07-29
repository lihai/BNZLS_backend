package com.scework.business.user.dao;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.scework.spi.po.user.UserPO;
import com.system.database.spring.splitPage.BaseSupportDAO;
@Repository("userManageDao")
public class UserManageDaoImp extends BaseSupportDAO implements UserManageDao {
	private static final Logger LOGGER = LogManager.getLogger(UserManageDaoImp.class);
	

}
