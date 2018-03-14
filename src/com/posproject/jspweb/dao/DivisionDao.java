package com.posproject.jspweb.dao;

import java.util.List;

import com.posproject.jspweb.entity.Division;

public interface DivisionDao {
	int insert (Division division);
	int delete(String id);
	int update(Division division);
	
	Division get(String id);
	List<Division> getList();
}
