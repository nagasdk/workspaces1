package staticexample;

public class Stex1 {
	
	public static void main(String[] args) {
		
		StaticClass st1 = new StaticClass();
		System.out.println(st1.getCount());
		st1.incrementCounterByVal(3);
		System.out.println(st1.getCount());
		
		StaticClass st2 = new StaticClass();
		System.out.println(st1.getCount());
		System.out.println(st1.getCount());
	}
}
