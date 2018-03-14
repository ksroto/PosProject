package com.posproject.jspweb.dao;

import java.util.List;

import com.posproject.jspweb.entity.Classs;

public interface ClasssDao {
	int insert(Classs classs);
	int delete(String id);
	int update(Classs classs);
	
	Classs get(String id);
	List<Classs> getList();
}
