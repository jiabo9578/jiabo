package com.huatec.teaching.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.huatec.teaching.domain.TUser;
import com.huatec.teaching.dao.TUserDao;
import com.huatec.teaching.service.TUserService;

/**
 * 更高效的实现，基于MyBatis + Memcached的方案，以JSON格式存储Memcached中的内容。
 * 
 * @author jiabo
 */
@Service
public class TUserServiceImpl implements TUserService{
	
	private static Logger logger = LoggerFactory.getLogger(TUserServiceImpl.class);
	
	@Autowired
	private TUserDao dao;
	
	
	public int save(TUser entity)
	{
		return dao.save(entity);
	}
	
	public int update(TUser entity)
	{
		return dao.update(entity);
	}
	
	public int delete(String id)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", id);

		
		return dao.delete(map);
	}
	
	public TUser findById(String id)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", id);

		return dao.findById(map);
	}
	
	public List<TUser> findTuserList(TUser entity)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("entity", entity);
		return dao.findTuserList(map);
	}
	
	public int findTuserCount(TUser entity)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("entity", entity);
		return dao.findTuserCount(map);
	}
	
}


