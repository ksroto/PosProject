package com.posproject.jspweb.dao;

import java.util.List;

import com.posproject.jspweb.entity.Discount;

public interface DiscountDao {
	
	int insert(Discount discount);
	int delete(String id);
	int update(Discount discount);
	
	Discount get(String id);
	List<Discount> getList();
}
