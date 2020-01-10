
public class Varargs {

	public static void main(String[] args) {

		System.out.println(sum(10,20,30,40,50));

	}

	
	public static int sum(int...	numbers)	{
		//inside	the	method	a	variable	argument	is	similar	to	an	array.
		//number	can	be	treated	as	if	it	is	declared	as	int[]	numbers;
		int sum	=	0;
		for (int number:	numbers)	{
						sum	+=	number;
		}
		
		
		return sum;
	}
}
