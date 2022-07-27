package com.advance.linkedhashset;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetA {

	public static void main(String[] args) {
	   Set<String>carBrands=new LinkedHashSet<>(01,0.6f);
	   carBrands.add("toyota");
	   carBrands.add("nissan");
	   carBrands.add("kia");
	   carBrands.add("ford");
	   System.out.println("car brands:" +carBrands);

	}

}
