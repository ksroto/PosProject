package com.posproject.jspweb.dao;

import java.util.List;

import com.posproject.jspweb.entity.Rank;

public interface RankDao {
	int insert (Rank rank);
	int delete(String id);
	int update(Rank rank);
	
	Rank get(String id);
	List<Rank> getList();
}
