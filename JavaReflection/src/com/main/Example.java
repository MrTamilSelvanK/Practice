package com.main;

public class Example {
	 Example(String msg){
		 System.err.println("Example class runned : "+msg);
	 }
	public   String str1="hii how are you";
	public void publicMethod(String msg) {
		System.out.println("public method called successfully : "+msg);
	}
	private void privateMethod() {
		System.err.println("private method called successfully");
	}
}
