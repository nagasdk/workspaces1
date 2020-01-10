package rest.io.samples;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.resources.*;
public class ObjectMapperWriteExample {

	public static void main(String[] args) {
		double price1 =1000000.00;
		Car c1 = new Car("black",price1,"2020new","hyundai");
		
		ObjectMapper om = new ObjectMapper();
		try {
			om.writeValue(new File("src/main/resources/C1.json"), c1);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
