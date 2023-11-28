package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class AscendingNo {
	
	public static void main(String[]args)
	{
		List l=new ArrayList();
		List l1= new ArrayList();
		List l2= new ArrayList();
		
 		for(int i=1; i<=10; i++) {
			l.add(i);
			
			if (i%2!=0) {
				System.out.println(i+ "");
			}
			
		}
 		  l.add(l2);     
 		  l.add(4,11);   
 		  l.add(7,20);   
 		  
        System.out.println(l);  			//[1, 2, 3, 4, 11, 5, 6, 20, 7, 8, 9, 10,]
        System.out.println(l.size());  		//13
      
			//for descending order                
     
        		for(int i=l.size(); i>=1; i--)// for(int i=l.size()-1; i>=0,i--)
        		{
					 l1.add(i);
						
					
				 }
				 System.out.println(l1);   //[13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
				 
				
	}
}

