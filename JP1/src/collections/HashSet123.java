package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet123 {

	public static void main(String[] args) {

		Set<String> hs = new HashSet<String>();

		/*hs.add("sachin");
		hs.add("dravid");
		hs.add("Sachin");hs.add("dravid");
		System.out.println(hs);*/
		
		Set<String> hashsetObj=new HashSet<String>();  
		hashsetObj.add("Ravi");  
		hashsetObj.add("Vijay"); 
		System.out.println(hashsetObj);
		hashsetObj.remove("Ravi");
		System.out.println(hashsetObj);
		hashsetObj.add("Ajay");  
		hashsetObj.add("Ravi");  

		System.out.println(hashsetObj);
		System.out.println(hashsetObj);

		//Traversing elements  
		/*Iterator<String> itr=hashsetObj.iterator();  
		while(itr.hasNext()){  
		 System.out.println(itr.next());  
		}*/ 
		
		for(String sd:hashsetObj){
			System.out.println(sd);
		}
	}

}
