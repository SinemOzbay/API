package com.api.test;
import static io.restassured.RestAssured.*;
import java.io.File;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class POSTCallAPI {
	//POST == create user
	@Test
	public void createUserwithPOSTTest() {
		RestAssured.baseURI = "https://gorest.co.in";
		RequestSpecification request = RestAssured.given().log().all();
	    request.header("Authorization", "Bearer 4242b4a465097df28229861ee3a53a1ab3e674935bb89e135543e470750c4e3b");
	    request.contentType("application/json");
	    File file = new File("/Users/testersinem/Documents/workspace/API/src/test/java/com/api/test/createuser.json");
	    request.body(file);
	    Response response = request.post("/public-api/users");
	    System.out.println(response.prettyPrint());
	}
}
	

