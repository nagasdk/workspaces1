package p1.p2;

import java.util.Random;

public  class Car implements IEngineMotor {

	public int startEngine(int key) {
		System.out.println("Engine Started after inputting the Key:"+ key);
		return new Random().nextInt(100);
	}
	
	
	public int getSpeed(int min, int max) {
		
		if (min > max) {
			throw new IllegalArgumentException("Invalid range");
		}
		
		double rand = Math.random();
		return (int)(rand * ((max - min) + 1)) + min;
		
	}

	public int getSpeed() {
		return new Random().nextInt(50);
	}

	public int getMileage() {
		return new Random().nextInt(23);
	}

	public static void main(String args[]){
		Car c1 = new Car();
		System.out.println(c1.getMileage());
	}

	public String getColor() {
		return "Blue";
	}

	public void showSpecifications() {
		System.out.println("showing CarEngine Specification");
		
	}

}
