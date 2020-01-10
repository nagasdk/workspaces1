

public class I10 extends HyundaiBrands{

	public static void main(String args[]){
		IEngineMotor em1  = new I10();
		System.out.println("Engine Mileage : "+em1.getMileage());
		em1.showSpecifications();
		
		em1.startEngine(2);
		try{
			System.out.println("Speed : "+ new HyundaiBrands().getSpeed(25,22));
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		//System.out.println("Speed : "+ em1.getSpeed(20,25));
	}
	
}
