/** TYPES OF CHECKED EXCEPTIONS
SQLException | IOException | ClassNotFoundException | InvocationTargetException
 
 FileNotFoundException extends IOException
 
*/


package exceptionsexamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException1 {

	public static void main(String args[]) throws FileNotFoundException,IOException 
	   {
	      FileInputStream fis = null;
	      fis = new FileInputStream("resources/CoveringLetter.txt"); 
	      int k; 

	      while(( k = fis.read() ) != -1){ 
		   System.out.print((char)k); 
	      
	      } 
	      fis.close(); 	
	   }
}

