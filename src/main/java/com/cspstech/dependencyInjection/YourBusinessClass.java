package com.cspstech.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class YourBusinessClass {
	//@Autowired
	Dependency1 dependency1;  //With out autowring object will be null 
	//@Autowired
	Dependency2 dependency2;  // it's called Field injections 
	
	
//	@Autowired   it's setter injection
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Setter injection Dependency 1");
//		this.dependency1 = dependency1;
//	}
//
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Setter injection Dependency 2");
//		this.dependency2 = dependency2;
//	}
//


	public String toString() {
		return "Get" +dependency1 +"and " +dependency2;
	}

	//Constrictor injection 
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
}
