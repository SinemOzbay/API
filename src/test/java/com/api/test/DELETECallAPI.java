package com.api.test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import org.testng.Assert;
import org.testng.annotations.Test;
public class DELETECallAPI {
	@Test
	public void deleteUserAPI() {
		RestAssured.baseURI = "https://gorest.co.in";
		RequestSpecification request = RestAssured.given().log().all();
	    request.header("Authorization", "Bearer 4242b4a465097df28229861ee3a53a1ab3e674935bb89e135543e470750c4e3b");
	    Response response = request.delete("/public-api/users/22");	
	    System.out.println(response.prettyPrint());
	  //Verification
	    int statusCode = response.getStatusCode();
	    System.out.println(statusCode);
	    Assert.assertEquals(statusCode, 200);
	    JsonPath js = response.jsonPath();
	    System.out.println(js.get("result"));
	    Assert.assertNull(js.get("result"));
	}
}
