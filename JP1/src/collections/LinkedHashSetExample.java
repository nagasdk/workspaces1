package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {

	      LinkedHashSet<String> s = new LinkedHashSet<String>();
	      System.out.println("LinkedHashSet Size:"+s.size() + "\nIs LinkedHashSet Empty? - " + s.isEmpty());
	      s.add("england");
	      s.add("india");
	      s.add("australia");
	      s.add("england");
	      
	      System.out.println("current LinkedHashSet:" +s);
	      System.out.println("LinkedHashSet contains 'australia' : "+ s.contains("australia") + " \nLinkedHashSet contains 'mexico' : " + s.contains("mexico"));
	      System.out.println("Removing 'India' from LinkedHashSet");
	      s.remove("india"); s.remove("india");
	      System.out.println("current LinkedHashSet:" +s);
	      System.out.println("LinkedHashSet Size:"+s.size() + "\nIs LinkedHashSet Empty? - " + s.isEmpty());
	      for (String v : s) {
	         System.out.print(v);
	      }
	      
	      Iterator<String> itr =s.iterator();
	      while(itr.hasNext()){
	    	  System.out.println("\n"+itr.next());
	      }
		
	      
	      for (String sItem:s) System.out.println(sItem);
	}

}
