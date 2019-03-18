package com.huatec.teaching.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.huatec.teaching.domain.TClass;

/**
 * 
 * @author jiabo
 */

public interface TClassService{

	public int save(TClass entity);
	
	public int update(TClass entity);
	
	public int delete(String id);

	public TClass findById(String id);
	
	public List<TClass> findTclassList(TClass entity);
	
	public int findTclassCount(TClass entity);
	
	
}


