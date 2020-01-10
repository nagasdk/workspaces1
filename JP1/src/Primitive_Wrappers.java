
public class Primitive_Wrappers {

	public static void main(String[] args) {

		Integer	nineA1	=	new Integer(9);
		Integer	nineA2	=	Integer.valueOf(9);
		Integer	nineB	=	new Integer(9);
		Integer	tenA	=	new Integer(10);

	 System.out.println(nineA1==nineB);
	 System.out.println(nineA1.equals(nineB));
	 System.out.println(nineA1.equals(tenA));
	 System.out.println(nineA1.equals(nineA2));
	
	 
	 /*Integer	ten	=	new Integer(10);
	 int primten=10;
	 System.out.println(ten);
	 System.out.println(ten == primten);
	 ten++;//allowed.	Java	does	had	work	behind the	screen	for	us
	 System.out.println(ten);
	 */
	 
	 
	 
	 
	}

}
	