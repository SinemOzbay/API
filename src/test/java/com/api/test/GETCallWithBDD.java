package com.api.test;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class GETCallWithBDD {
	
	// BDD Approach
	
	/**
	 * For all Users GET
	 */
	
	@Test(priority=1, enabled = false)
	public void getUserAPITest() {
		
		RestAssured.baseURI = "https://gorest.co.in";
		
		given().log().all()
		.contentType("application/json")
		.header("Authorization", "Bearer 4242b4a465097df28229861ee3a53a1ab3e674935bb89e135543e470750c4e3b")
		.when().log().all()
		 .get("/public-api/users")
		.then().log().all()
		 .statusCode(200)
		.and()
		 .header("Server", "nginx")
		 .header("Connection", "keep-alive");
		
   
	
		
	}
	/**
	 * For Single User GET
	 */
	
	@Test(priority=2, enabled = false)
	public void getSingleUserAPITest() {
		
		RestAssured.baseURI = "https://gorest.co.in";
		
		given().log().all()
		.contentType("application/json")
		.header("Authorization", "Bearer 4242b4a465097df28229861ee3a53a1ab3e674935bb89e135543e470750c4e3b")
		.when().log().all()
		 .get("/public-api/users?name=Devvrat Rana")
		.then().log().all()
		 .statusCode(200)
		.and()
		 .header("Server", "nginx")
		 .header("Connection", "keep-alive");
		
		
	}
	/**
	 * For Single User GET
	 */
	
	@Test(priority=3, enabled = false)
	public void getSingleUserAPITest_1() {
		
		RestAssured.baseURI = "https://gorest.co.in";
		
		given().log().all()
		.contentType("application/json")
		.header("Authorization", "Bearer 4242b4a465097df28229861ee3a53a1ab3e674935bb89e135543e470750c4e3b")
		.when().log().all()
		 .get("/public-api/users/1")
		.then().log().all()
		 .statusCode(200)
		.and()
		 .header("Server", "nginx")
		 .header("Connection", "keep-alive");
	
	}
	@Test
	public void getUserWithQueryParameters() {
RestAssured.baseURI = "https://gorest.co.in";
		
		given().log().all()
		.contentType("application/json")
		.header("Authorization", "Bearer 4242b4a465097df28229861ee3a53a1ab3e674935bb89e135543e470750c4e3b")
		.queryParam("name", "Devvrat Rana")
		.queryParam("gender", "Female")
		.queryParam("status", "Inactive")
		.when().log().all()
		 .get("/public-api/users")
		.then().log().all()
		 .statusCode(200)
		.and()
		 .header("Server", "nginx")
		 .header("Connection", "keep-alive");
	}
	

}
