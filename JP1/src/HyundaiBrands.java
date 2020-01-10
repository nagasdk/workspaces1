

import java.util.Random;
import java.util.stream.IntStream;

public class HyundaiBrands extends Car {

	@Override
	public void showSpecifications(){
		System.out.println("::: Hyundai Car Specifications :::");
	}
	
	
	@Override
	public int getSpeed(int min, int max) {
		
		if (min > max) {
			throw new IllegalArgumentException("Invalid range");
		}
		
		double rand = Math.random();
		return (int)(rand * ((max - min) + 1)) + min;
		
	}
	
}
