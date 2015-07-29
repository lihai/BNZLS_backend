package com.scework.business.login.service;

import java.util.Map;

import com.scework.spi.po.user.UserPO;
import com.system.exception.SystemException;

public interface LoginService {
	/**
	 * 检查用户是否正确
	 * 
	 * @param session
	 *            :Session Map
	 * @param loginName
	 *            :登录用户名
	 * @param loginPassword
	 *            :登录密码
	 * @param code
	 *            :验证码
	 * @param ipAddr
	 *            :用户登录IP
	 * @return <ul>
	 *         <li>1:正确</li>
	 *         <li>-1:验证码错误</li>
	 *         <li>-2:用户名或密码错误</li>
	 *         <li>-3:用户数据错误</li>
	 *         <li>0:没有用户数据</li>
	 *         </ul>
	 * @throws SystemException
	 */
	UserPO checkUser(Map session, UserPO po, String ipAddr) throws SystemException;

	/**
	 * 注销Session
	 * 
	 * @param session
	 */
	void removeSession(Map session);
}
