package com.huatec.teaching.domain;
import java.io.Serializable;


/**
 * 
 * 
 * @author 
 */
public class TClass implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private java.lang.Integer id;
	private java.lang.String className;
	private java.lang.Integer studentNum;
	
	
			
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Integer getId() {
		return id;
	}
			
	public void setClassName(java.lang.String value) {
		this.className = value;
	}
	
	public java.lang.String getClassName() {
		return className;
	}
			
	public void setStudentNum(java.lang.Integer value) {
		this.studentNum = value;
	}
	
	public java.lang.Integer getStudentNum() {
		return studentNum;
	}
}


