/**
 * 
 */
/**
 * @author Nagaraju_Kura
 *
 */
package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExample1{
	
	public static void main(String args[]){
		
		List<Integer> listArray= new ArrayList<Integer>();
		
		listArray.add(100);listArray.add(26);listArray.add(15);listArray.add(20);listArray.add(30);listArray.add(3);listArray.add(22);
		Collections.sort(listArray);
		
		/*Iterator<Integer> itr = listArray.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		
		for(Integer i:listArray){
			System.out.println(i);
		}
		
	}
}