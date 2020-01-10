

public class Snippet {
	
	public static void main(String args[]){
		
	
		String	str	=	"Testing";
		System.out.println(str.toString());
		System.out.println(str.hashCode());
		
		String	str1	=	"Testing";System.out.println(str1.hashCode());
		//System.out.println(str.clone());
		
		if(str	instanceof Object){
			System.out.println("I	extend	Object");//Will	be	printed
		}
	}
}