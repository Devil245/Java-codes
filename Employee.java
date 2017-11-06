package com.atos.java.file;

import java.beans.Transient;
import java.io.Serializable;

public class Employee implements Serializable {
	
	private int eid;
	transient String ename;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}

}
