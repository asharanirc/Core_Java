package com.tech.assignment;

import java.util.ArrayList;

public class firstDuplicateNumber {

		public static void main(String[] args) {
			
			ArrayList<Integer> al= new ArrayList();
			
			al.add(10);
			al.add(20);
			al.add(30);
			al.add(50);
			al.add(20);
			al.add(9);
			al.add(50);
			al.add(10);
			
			System.out.println(al);
			ArrayList al2=new ArrayList();
			for(int i=0;i<al.size();i++) 
			{
				for (int j=+1;j<al.size();j++) 
				{
					if(al.get(i)==al.get(j)) 
					{
						al2.add(al.get(i));
						
					}
				}
			}
			
			
		}
	}

