package loops;

public class Loop_ConditionalTests {

	public static void main(String[] args) {

		
		
		boolean isTrue	=false;
		if(isTrue==true){
						System.out.println(isTrue);//Will	not	be	printed
		}
		
		/*if(isTrue=true){
						System.out.println(isTrue);//Will	be	printed.
		}*/
		
		if(isTrue){
			System.out.println("condition resulted as true");
		}else{
			System.out.println("condition resulted as false");
		}
		
		
		
	}

}
