package com.mss;

public class newjavaclass {
	public static String getMessage(String name, String country) {
		System.out.println("Entered into static method");
		return "hello"+name+"from"+country;
	}
public String getCountry(String city) {
	if (city.equals("vijayawada")) {
		return "200";
	
	}
	else if(city.equals("vizag")) {
		return "300";
	}
	else {
		
		return "invalid city";
	}

}
}
