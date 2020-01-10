package staticexample;


interface incrementCounter{
	void incrementCounterByVal(int val);
}
public class StaticClass implements incrementCounter {


	private static int count;
	public StaticClass()	{
					count++;
	}
	static int getCount()	{
					return count;
	}
	public static void main(String[]	args)	{
		StaticClass	cricketer1 =	new StaticClass();
		StaticClass	cricketer2 =	new StaticClass();
		StaticClass	cricketer3 =	new StaticClass();
		StaticClass	cricketer4 =	new StaticClass();
		System.out.println(StaticClass.getCount());//4
		
		
		
		
		
		
		
	}
	
	public void incrementCounterByVal(int val) {
		count = count + val;	
	}
}