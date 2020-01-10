package collections;

import java.util.*;
import java.util.Map;
import collections.Cricketer;

public class HashMap123 {

	public static void main(String[] args) {

		HashMap<Integer,Cricketer> mp = new java.util.HashMap<Integer,Cricketer>();

		mp.put(40,new Cricketer("sachin",40));
		mp.put(50,new Cricketer("dravid",50));
		mp.put(60,new Cricketer("Sachin",60));
		System.out.println(mp);
		
		Cricketer cric =null;
		Iterator hm = mp.entrySet().iterator();
		/*while(hm.hasNext()){
			 Map.Entry mapElement = (Map.Entry) hm.next();
			System.out.println("Key:"+ mapElement.getKey());
			cric = (Cricketer) mapElement.getValue();
			System.out.println("ID:"+cric.getId() + "\t Name:"+cric.getName());
		}*/
		
		
		/*for(Map.Entry mapElement:mp.entrySet()){
		  System.out.println(mapElement.getKey());	
		  System.out.println(((Cricketer)mapElement.getValue()).getId()+ ":\t"+((Cricketer)mapElement.getValue()).getName());
		}
		*/
		
		
		for(Map.Entry<Integer, Cricketer> mapElement : mp.entrySet()){
			System.out.println(mapElement.getKey() +":" + ((Cricketer)mapElement.getValue()).getId() +"_"+((Cricketer)mapElement.getValue()).getName());
		}
	}
	
	


}
