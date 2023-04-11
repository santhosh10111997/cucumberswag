package com.pom;



public class PageObjectManager {
	
	private Page1 p1;
	private Page2 p2;
	private Page3 p3;
	
	
	public Page1 GetinstancePage1() {
		return p1 =new Page1 ();
		
	}
	public Page2 GetinstancePage2() {
		return p2=new Page2();
		
	}
	public Page3 GetinstancePage3() {
		return p3=new Page3();
		
	}

}
