package com.huatec.teaching.dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.huatec.teaching.domain.TUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * 
 * @author jiabo
 */
@Mapper
public interface TUserDao{
		public int save(TUser entity);
	  
	  public int update(TUser entity);
	  
	  public int delete(Map<String,Object> map);
	  
	  public TUser findById(Map<String,Object> map);
	  
	  public List<TUser> findTuserList(Map<String,Object> map);
	  
	  public int findTuserCount(Map<String,Object> map);
	
	
}
