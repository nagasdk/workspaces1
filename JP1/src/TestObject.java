
public class TestObject {

	public static void main(String[] args) {
		TestObject to = new TestObject();
		Object	object;
		object =	new TestObject();
		

		Actors	actor1 =	to.new Actors();
		Actors	actor2 =	to.new Comedian();
		Actors	actor3 =	to.new Hero();

		actor1.act();
		
	}

	
	//Object	is	super	class	of	all	java	classes
	public class Actors	{
					public void act(){
									System.out.println("Act");
					};
	}

	
	//IS-A	relationship.	Hero	is-a	Actor
	public class Hero	extends Actors	{
					public void fight(){
									System.out.println("fight");
					};
	}

	//// IS-A	relationship.	Comedian	is-a	Actor
	public class Comedian	extends Actors	{
					public void performComedy(){
									System.out.println("Comedy");
					};
	}
	
	



}