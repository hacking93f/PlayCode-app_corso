package com.corso.ereditarieta;

public class Child extends Parent {
	
	String d;
	String c;
	
	Child(){
		d="child d";
		c="child c";
	}


	public String getD() {
		return d;
	}


	public void setD(String d) {
		this.d = d;
	}


	public String getC() {
		return c;
	}


	public void setC(String c) {
		this.c = c;
	}


	public String getParentC() {
		return super.c;
	}

}
