package com.huatec.teaching.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




import com.huatec.teaching.domain.TClass;
import com.huatec.teaching.dao.TClassDao;
import com.huatec.teaching.service.TClassService;

/**
 * 更高效的实现，基于MyBatis + Memcached的方案，以JSON格式存储Memcached中的内容。
 * 
 * @author jiabo
 */
@Service
public class TClassServiceImpl implements TClassService{
	
	private static Logger logger = LoggerFactory.getLogger(TClassServiceImpl.class);
	
	@Autowired
	private TClassDao dao;
	
	
	public int save(TClass entity)
	{
		return dao.save(entity);
	}
	
	public int update(TClass entity)
	{
		return dao.update(entity);
	}
	
	public int delete(String id)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", id);

		
		return dao.delete(map);
	}
	
	public TClass findById(String id)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", id);

		return dao.findById(map);
	}
	
	public List<TClass> findTclassList(TClass entity)
	{
		//fb.setPaged(true);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("entity", entity);
		return dao.findTclassList(map);
	}
	
	public int findTclassCount(TClass entity)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("entity", entity);
		return dao.findTclassCount(map);
	}
	
	
	
}


