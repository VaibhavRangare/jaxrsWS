package com.test;

import java.util.HashSet;
import java.util.Set;


import javax.ws.rs.core.Application;


public class WSApplication extends Application {

	@Override
	public Set<Class<?>> getClasses(){
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(ServiceEndPoint.class);
		//classes.add(Welcome.class);
		return classes;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
