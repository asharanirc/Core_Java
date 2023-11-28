package com.tech;

import java.util.Arrays;
import java.util.List;

public class question1 {
    // creating a sample array
	
	public static void main(String[] args) {
		
	String[] sample_array = {"Monday", "Tuesday","wednesday","Thursday", "Friday", "Saturday","Sunday"};
	
	List<String> l= Arrays.asList(sample_array);
	
	for(String sample:l)
	{
		System.out.println(sample);
	}
}		
}	
	
	
	
