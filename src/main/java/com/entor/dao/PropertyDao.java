package com.entor.dao;

import java.util.List;
import java.util.Map;

import com.entor.entity.Property;

public interface PropertyDao extends BaseDao<Property>{

	
	public List<Property> queryByPage(Class<?> cls, Map<String, Integer> map,int cid);
	

}
