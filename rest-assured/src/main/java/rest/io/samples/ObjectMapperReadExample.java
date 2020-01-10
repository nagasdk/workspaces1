package rest.io.samples;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.resources.Car2;
public class ObjectMapperReadExample {

	public static void main(String[] args) {
		double price1 =1000000.00;
		
		String json =  "{\"color\":\"black\",\"price\":1000000.0,\"model\":\"2020new\", \"brand\":\"hyundai\" }";
		
		ObjectMapper om = new ObjectMapper();
		try {
			//Car c1 = om.readValue(new File("src/main/resources/C1.json"), Car.class);
			Car2 c1 = om.readValue(json, Car2.class);
			System.out.println(c1.getBrand()+ ","+ c1.getColor() + ","+ c1.getModel() + ","+ c1.getPrice());
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
