package com.test.pkg1;

public class KClass {
	public void publicMethod() {
		System.out.println("KClass - public");
	}
	
	void defaultMethod() {
		System.out.println("KClass - default");
	}
	
	protected void protectedMethod() {
		System.out.println("KClass - protected");
	}
	
	private void privateMethod() {
		System.out.println("KClass - private");
	}
}
