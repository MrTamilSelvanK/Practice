package com.main;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		// java reflection method 
//		System.err.println("run successfully "+Example.str1);
		try {
//			Class obj= Class.forName("com.main.Example");
			
			Class<? extends Example> obj =Example.class;
			Object instance=obj.getDeclaredConstructor(String.class).newInstance("dc");
			
//			Example instance=new Example("getha");
//			Class<? extends Example> obj=instance.getClass();
			Field field=obj.getDeclaredField("str1");
			field.set(instance, "ranie");
			System.err.println(field.get(instance)); 
//	
			Method method=obj. getDeclaredMethod("publicMethod", String.class);
			method.invoke(instance, "john");
			Method privateMethod=obj. getDeclaredMethod("privateMethod");
			privateMethod.setAccessible(true);
			privateMethod.invoke(instance);
//			Constructor constructor=obj.getDeclaredConstructor();
//			constructor.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
