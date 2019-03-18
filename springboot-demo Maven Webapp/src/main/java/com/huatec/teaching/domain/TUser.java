package com.huatec.teaching.domain;
import java.io.Serializable;


/**
 * 
 * 
 * @author 
 */
public class TUser implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private java.lang.Integer id;
	private java.lang.String name;
	private java.lang.Integer age;
	
	
			
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Integer getId() {
		return id;
	}
			
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return name;
	}
			
	public void setAge(java.lang.Integer value) {
		this.age = value;
	}
	
	public java.lang.Integer getAge() {
		return age;
	}
}


