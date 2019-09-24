package com.entor.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.dao.PropertyDao;
import com.entor.entity.Property;
import com.entor.service.PropertyService;

@Service("propertyService")
public class PropertyServiceImpl extends BaseServiceImpl<Property> implements PropertyService{
	@Resource
	private PropertyDao propertyDao;
	@Override
	public List<Property> queryByPage(Class<?> cls, int currentPage, int pageSize, int cid) {
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("start", (currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		return propertyDao.queryByPage(cls, map,cid);
	}

}
