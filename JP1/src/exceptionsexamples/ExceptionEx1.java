/**
 * 
 */
/**
 * @author Nagaraju_Kura
 *
 */
package exceptionsexamples;

public class ExceptionEx1 {

	int n=10;
	int zero=0;

	public int performDivideOperation() throws  ArithmeticException{
		int reminder=0;
		reminder=n/zero;
		return reminder;
	}
	
	public static void main (String args[]){
		
		
		ExceptionEx1 ee = new ExceptionEx1();
		//System.out.println(ee.performDivideOperation());
		
		try {
			int num = Integer.parseInt("XYZ");
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Number format exception occurred");
		}
		
		
	     try{
			String str = "beginnersbook";
			System.out.println(str.length());
			;
			char c = str.charAt(0);
			c = str.charAt(40);
			System.out.println(c);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException!!");
		}
		
	     
	 	try{
			String str=null;
			System.out.println (str.length());
		}
	        catch(NullPointerException e){
			System.out.println("NullPointerException..");
		}
	     
	     
	}
	
}