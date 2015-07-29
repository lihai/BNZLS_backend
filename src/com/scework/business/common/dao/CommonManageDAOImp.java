package com.scework.business.common.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.system.database.spring.splitPage.BaseSupportDAO;
@Repository("commonManageDao")
public class CommonManageDAOImp extends BaseSupportDAO implements
		CommonManageDAO {
	private static final String GET_ALL_CITY_SQL="select * from tab_city order by area_id";
	@Override
	public List<Map<String, Object>> getAllCityList() {
		return jt.queryForList(GET_ALL_CITY_SQL);
	}
	
}
