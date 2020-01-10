package abstractexample;




public  class AbstractClassFinal extends AbstractClass2{

	public static void main(String[] args) {
		AbstractClassFinal ab1 = new AbstractClassFinal();
		System.out.println(ab1.getCountofTyres());
		ab1.showNoOfLights();
	}

	public void showGears() {
		System.out.println("No of GEARS:"+ 5);		
	}

	public void displayCurrentCounterVal() {		
	}

	public int incrementcounter() {
		return 0;
	}
	

}


 abstract class AbstractClass implements VehicleParts{

	public void showNoOfLights() {
		System.out.println("No of lights:"+ 5);	
	}
}

 abstract class AbstractClass2 extends AbstractClass{

		public int getCountofTyres() {
			// TODO Auto-generated method stub
			return 0;
		}
}

