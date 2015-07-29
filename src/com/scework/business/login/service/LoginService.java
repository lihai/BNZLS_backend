package com.scework.business.login.service;

import java.util.Map;

import com.scework.spi.po.user.UserPO;
import com.system.exception.SystemException;

public interface LoginService {
	/**
	 * ����û��Ƿ���ȷ
	 * 
	 * @param session
	 *            :Session Map
	 * @param loginName
	 *            :��¼�û���
	 * @param loginPassword
	 *            :��¼����
	 * @param code
	 *            :��֤��
	 * @param ipAddr
	 *            :�û���¼IP
	 * @return <ul>
	 *         <li>1:��ȷ</li>
	 *         <li>-1:��֤�����</li>
	 *         <li>-2:�û������������</li>
	 *         <li>-3:�û����ݴ���</li>
	 *         <li>0:û���û�����</li>
	 *         </ul>
	 * @throws SystemException
	 */
	UserPO checkUser(Map session, UserPO po, String ipAddr) throws SystemException;

	/**
	 * ע��Session
	 * 
	 * @param session
	 */
	void removeSession(Map session);
}
