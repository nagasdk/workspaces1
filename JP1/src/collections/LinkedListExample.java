package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
	      LinkedList<String> l = new LinkedList<String>();
	      System.out.println(l.size() + " " + l.isEmpty());
	      l.add("a");
	      l.add("b");
	      l.add("c");
	      l.add("d");
	      l.add("e");
	      l.add("f");
	      System.out.println(l);
	      System.out.println(l.set(1, "x"));
	      l.add(2, "a");
	      System.out.println(l);
	      System.out.println(l.pollFirst() + " " + l.peekFirst());
	      System.out.println(l);
	      System.out.println(l.get(4));
	      l.remove("a");
	      System.out.println(l);
	      System.out.println(l.size() + " " + l.isEmpty());
	      for (String s : l) {
	         System.out.print(s);
	      }
	      
	      Iterator<String> itr = l.iterator();
	      while(itr.hasNext()){
	    	  System.out.print("\n"+itr.next());
	      }
	      
	     for (String string : l) {
			
		}
	      

	}

}
