package inheritance;


   interface ActDriver{
	   void act();   
   }
   
   interface fightDriver{
	   void fight();   
   }
   
   interface comedyDriver{
	   void performComedy();
   }
   
   interface Webydriver extends  ActDriver,fightDriver,comedyDriver{
	   void drive();
   }
      
   class Actor implements ActDriver	{
		public void act(){
						System.out.println("Act");
			};
	}
		
	//IS-A	relationship.	Hero	is-a	Actor
	class Hero	extends Actor implements fightDriver	{
			public void fight(){
							System.out.println("fight");
			};
	}
		
	//IS-A	relationship.	Comedian	is-a	Actor
	class Comedian	extends Actor implements comedyDriver	{
			public void performComedy(){
							System.out.println("Comedy");
			};
	}
	
	public class TestInheritance {
		public static void main(String[] args) {
			Actor actor1 = new Hero();
			Actor actor2 = new Comedian();
			Object obj = new Hero();
		
			
			ActDriver driver = (ActDriver) new Actor();
			//driver.act();
			//driver.fight();
			
			driver.act();
			
		}
	}
