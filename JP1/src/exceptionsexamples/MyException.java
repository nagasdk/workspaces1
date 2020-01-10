package exceptionsexamples;

public class MyException extends Exception {

	public MyException(String string) {
		System.out.println("Invalis criteria of Age or weight specifie, correct it");
	}

	public MyException(String string, Exception e) {
		System.out.println("Invalis criteria of Age or weight specifie, correct it");
		e.printStackTrace();
	}
	
	 
}
