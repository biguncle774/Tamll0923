package com.entor.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entor.entity.Property;
import com.entor.service.PropertyService;

@Controller
public class PropertyController {
	@Resource
	private PropertyService propertyService;
	
	@RequestMapping("/admin_property_list/{cid}/{currentPage}")
	public String cctv(@PathVariable int cid,@PathVariable String currentPage,Map<String,Object> map) {
		int sp = 1;
		int pageSize = 10;
		int totals = propertyService.getTotals(Property.class);
		int pageCounts = totals/pageSize;
		if(totals%pageSize!=0) {
			pageCounts++;
		}
		try {
			sp = Integer.parseInt(currentPage);
		}catch(Exception e) {
			sp = 1;
		}
		if(sp>pageCounts) {
			sp = pageCounts;
		}
		if(sp<1) {
			sp = 1;
		}
		List<Property> list = propertyService.queryByPage(Property.class, sp, pageSize);
		map.put("totals", totals);
		map.put("sp", sp);
		map.put("pageCounts", pageCounts);
		map.put("list", list);
		return "admin/listCategory";
	}

}
