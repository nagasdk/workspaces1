package abstractexample;


interface VehicleParts2{
	int counter=20;

}

class Lorry implements VehicleParts,VehicleParts2{

	int tyres=4;
	public int getCountofTyres() {
		return tyres;
	}

	public void showNoOfLights() {
		System.out.println("no of tyres for Lorry:"+ tyres);
	}

	public void showGears() {
		// TODO Auto-generated method stub		
	}

	public void displayCurrentCounterVal() {
		System.out.println("counter:"+VehicleParts.counter);
	}
	
	public int incrementcounter(){
		return VehicleParts.counter+1;
	}
}

class Truck extends Lorry{
	int tyres=8;
	public int getCountofTyres() {
		return tyres;
	}
	
	public void showNoOfLights() {
		System.out.println("no of tyres for heavy truck :"+ tyres);
	}

}

public class HeavyVehicle {


	public static void main(String[] args) {

		//VehicleParts hv = new Lorry();
		VehicleParts hv = new Truck();
		

		hv.showNoOfLights();
		hv.displayCurrentCounterVal();
		System.out.println(hv.incrementcounter());
		//hv.incrementcounter();hv.incrementcounter();hv.incrementcounter();hv.incrementcounter();
		//hv.displaycounter();
		
		System.out.println(VehicleParts2.counter);
	
		
		
	}

}
