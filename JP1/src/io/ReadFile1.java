/**
 * 
 */
/**
 * @author Nagaraju_Kura
 *
 */
package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile1 {

	public static void main(String args[]) throws FileNotFoundException,IOException 
	   {
	      FileInputStream fis = null;
	      fis = new FileInputStream("resources/CoveringLetter.txt"); 
	      int k; 
	      	    

	      /*while(( k = fis.read() ) != -1){ 
		   System.out.print((char)k); 	      
	      } */
	      
	      byte[] b = null;
		while((k=fis.read(b, 1, 2))!=-1){
	    	  System.out.print((char)k);
	      }
	      
	      fis.close(); 	
	   }
}