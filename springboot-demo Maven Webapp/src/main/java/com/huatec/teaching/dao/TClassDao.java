package com.huatec.teaching.dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.huatec.teaching.domain.TClass;
import org.apache.ibatis.annotations.Mapper;

/**
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * 
 * @author jiabo
 */
@Mapper
public interface TClassDao{
		public int save(TClass entity);
	  
	  public int update(TClass entity);
	  
	  public int delete(Map<String,Object> map);
	  
	  public TClass findById(Map<String,Object> map);
	  
	  public List<TClass> findTclassList(Map<String,Object> map);
	  
	  public int findTclassCount(Map<String,Object> map);
	
	
}
