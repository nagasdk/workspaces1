package com.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest2 {
  @Test
  public void fun() {
	  
	  JsonPath jpath = null;
	  /*
	  System.out.println("fun");
	  
	  Response resp = RestAssured.get("https://samples.openweathermap.org/data/2.5/history/city?q=London,UK&appid=b1b15e88fa797225412429c1c50c122a1");
	  System.out.println(resp.getStatusCode());	  
	  System.out.println( resp.getTime());
	  System.out.println(resp.getBody().asString());
	  
	  jpath = resp.getBody().jsonPath();
	  System.out.println(jpath.getString("list"));
	  System.out.println(jpath.getString("list.wind"));
	  System.out.println(jpath.getString("list[0].wind"));
	  
	  System.out.println(jpath.getString("list.wind[0]"));
      System.out.println(jpath.getString("list.wind[0].speed"));
      */
	  
      RequestSpecification rs = RestAssured.given();
      Response resp1 = rs.get("https://samples.openweathermap.org/data/2.5/history/city?q=London,UK&appid=b1b15e88fa797225412429c1c50c122a1");
      System.out.println(resp1.getStatusCode() + resp1.getTime());
      jpath = resp1.getBody().jsonPath();
      System.out.println(resp1.getBody().asString());
	  System.out.println(jpath.getString("list.wind[0]"));
      System.out.println(jpath.getString("list.wind[0].speed"));
      
  
      
      
  }
  
}
