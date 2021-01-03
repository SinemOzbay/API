package com.api.test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GETCallNoBDD {
	
	// NO BDD
	
	@Test(priority=1, enabled=false)
	public void getAllUsersAPITest() {
		RestAssured.baseURI = "https://gorest.co.in";
		RequestSpecification request = RestAssured.given().log().all();
	    request.header("Authorization", "Bearer 4242b4a465097df28229861ee3a53a1ab3e674935bb89e135543e470750c4e3b");
	    Response response = request.get("/public-api/users");
	    System.out.println(response.asString()); //to print all results in JSON
	    System.out.println(response.prettyPrint()); //to print on the console appropriate format
	    //Verification
	    int statusCode = response.getStatusCode();
	    Assert.assertEquals(statusCode, 200);
	    String server = response.getHeader("Server");
	    Assert.assertEquals(server, "nginx");
	}
	@Test(priority=2, enabled=true)
	public void getSingleUserAPITest() {
		RestAssured.baseURI = "https://gorest.co.in";
		RequestSpecification request = RestAssured.given().log().all();
	    request.header("Authorization", "Bearer 4242b4a465097df28229861ee3a53a1ab3e674935bb89e135543e470750c4e3b");
	    request.queryParam("name", "Devvrat Rana");
	    request.queryParam("gender", "Female");
	    request.queryParam("status", "Inactive");
	    Response response = request.get("/public-api/users");
	    System.out.println(response.asString()); //to print all results in JSON
	    System.out.println(response.prettyPrint()); //to print on the console appropriate format
	    //Verification
	    int statusCode = response.getStatusCode();
	    Assert.assertEquals(statusCode, 200);
	    String server = response.getHeader("Server");
	    Assert.assertEquals(server, "nginx");
	}

}
