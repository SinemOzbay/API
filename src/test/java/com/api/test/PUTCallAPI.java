package com.api.test;

import java.io.File;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class PUTCallAPI {
	@Test
	public void createUserwithPUTTest() {
		RestAssured.baseURI = "https://gorest.co.in";
		RequestSpecification request = RestAssured.given().log().all();
	    request.header("Authorization", "Bearer 4242b4a465097df28229861ee3a53a1ab3e674935bb89e135543e470750c4e3b");
	    request.contentType("application/json");
	    File file = new File("/Users/bobit/Documents/workspace/APIC4/"
	    		+ "src/test/java/com/api/tests/updateuser.json");
	    request.body(file);
	    Response response = request.put("/public-api/users/1461"); //do not forget id number for the user
	    System.out.println(response.prettyPrint());
	}
}
