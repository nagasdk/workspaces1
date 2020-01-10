package com.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Rest1 {
  @Test
  public void fun() {
	  System.out.println("fun");
	  
	  Response resp = RestAssured.get("https://samples.openweathermap.org/data/2.5/history/city?q=London,UK&appid=b1b15e88fa797225412429c1c50c122a1");
	  System.out.println(resp.getStatusCode());	  
	  System.out.println( resp.getTime());
	  System.out.println(resp.getBody().asString());
	  JsonPath jpath = resp.getBody().jsonPath();
	  System.out.println(jpath.getString("list"));
	  System.out.println(jpath.getString("list.wind"));
	  System.out.println(jpath.getString("list[0].wind"));
	  System.out.println(jpath.getString("list.wind[0]"));
      System.out.println(jpath.getString("list.wind[0].speed"));
	  
  }
}
