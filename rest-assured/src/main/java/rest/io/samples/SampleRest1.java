package rest.io.samples;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleRest1 {

	public static void main(String[] args) {

		/*RestAssured ra = new RestAssured();		
		ra.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest  = ra.given();*/
		
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";		
		RequestSpecification httpRequest  = RestAssured.given();
		
		Response httpResponse = httpRequest.request(Method.GET, "/Hyderabad");		
		if(httpResponse.getStatusCode()==200){
			 String resBody = httpResponse.getBody().asString();
			 System.out.println(resBody);
			 
			 JsonPath jp = httpResponse.jsonPath();
			 System.out.println(jp.getString("City"));			
		 }else{
			 System.out.println(httpResponse.getBody().asString());
			 JsonPath jp = httpResponse.jsonPath();
			 System.out.println(jp.getString("FaultId")+":"+jp.getString("fault"));	
		 }
		 
		 
		 
	}

}
