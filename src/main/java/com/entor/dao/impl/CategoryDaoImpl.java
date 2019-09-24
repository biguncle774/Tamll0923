package com.entor.dao.impl;

import org.springframework.web.bind.annotation.RequestMapping;

import com.entor.dao.CategoryDao;
import com.entor.entity.Category;

@RequestMapping("categoryDao")
public class CategoryDaoImpl extends BaseDaoImpl<Category> implements CategoryDao{

}
