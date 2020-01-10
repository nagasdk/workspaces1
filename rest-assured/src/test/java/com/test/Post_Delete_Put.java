package com.test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_Delete_Put {
  
	
  @Test
  public void test1Post() {
	  
	  
	  JSONObject jo = new JSONObject();
	  jo.put("id", "14");
	  jo.put("title", "naga14");
	  jo.put("author", "naga14");
	  
	  RequestSpecification request = RestAssured.given();
	  request.header("Content-Type","application/json");
	  request.body(jo.toString());
	  Response resp = request.post("http://localhost:3000/posts");
	  System.out.println(resp.getStatusCode());
	  
	  
	  //DELETE POST
	  /*resp = request.delete("http://localhost:3000/posts/11");
	  System.out.println("Delete operatoion:" + resp.getStatusCode());*/
	  
	  //UPDATE POST
	  jo = new JSONObject();
	  jo.put("id", "14");
	  jo.put("title", "naga414");
	  jo.put("author", "naga414");
	  request.body(jo.toString());

	  resp = request.put("http://localhost:3000/posts/14");
	  System.out.println("Delete operatoion:" + resp.getStatusCode());
	  
  }
}
