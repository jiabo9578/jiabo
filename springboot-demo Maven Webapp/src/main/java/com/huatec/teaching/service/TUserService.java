package com.huatec.teaching.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.huatec.teaching.domain.TUser;

/**
 * 
 * @author jiabo
 */

public interface TUserService{

	public int save(TUser entity);
	
	public int update(TUser entity);
	
	public int delete(String id);

	public TUser findById(String id);
	
	public List<TUser> findTuserList(TUser entity);
	
	public int findTuserCount(TUser entity);
	
	
}


