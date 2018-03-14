package com.posproject.jspweb.dao;

import java.util.List;

import com.posproject.jspweb.entity.Sales;

public interface SalesDao {
	int insert (Sales sales);
	int delete(String id);
	int update(Sales sales);
	
	Sales get(String id);
	List<Sales> getList();
}
