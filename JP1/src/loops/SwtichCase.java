package loops;

public class SwtichCase {

	private int number=2;
	public static void main(String[] args) {
		
		SwtichCase sc1= new SwtichCase();
		//number = getNumber();
		switch (sc1.getNumber())	{
		case 1:
						System.out.println(1);
						break;
		case 2:
		case 3:
						System.out.println("Number	is	2	or	3");
						break;
		default:
						System.out.println("Default");
						break;
		}
	}
	public int getNumber() {
		return number;
	}

}
