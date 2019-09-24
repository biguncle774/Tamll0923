package com.entor.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;

import com.entor.dao.PropertyDao;
import com.entor.entity.Property;

@RequestMapping("propertyDao")
public class PropertyDaoImpl extends BaseDaoImpl<Property> implements PropertyDao{

	
	public List<Property> queryByPage(Class<?> cls, Map<String, Integer> map,int cid) {

		return getSqlSession().selectList(cls.getSimpleName()+".queryByPage", map   );
	}

}
