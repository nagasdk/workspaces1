/** TYPES OF CHECKED EXCEPTIONS
 SQLException | IOException | ClassNotFoundException | InvocationTargetException
 
 FileNotFoundException extends IOException
 */



package exceptionsexamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class UnCheckedException1 {

	public static void main(String args[]) {
		FileInputStream fis = null;
		int k;

		try {
			fis = new FileInputStream("resources/CoveringLetter.txt");
			while ((k = fis.read()) != -1) {
				System.out.print((char) k);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} /*catch( SQLException | IOException | ClassNotFoundException | InvocationTargetException xx){
			
		}*/


		
	}
}

