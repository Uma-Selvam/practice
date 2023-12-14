package org.prastic;

import org.junit.Test;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.PrettyPrint;
import static io.restassured.RestAssured.*;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class simple {
	
//	@Test
//	public void UsingGet() {
//		RestAssured.baseURI="https://reqres.in/";
//		
//		RequestSpecification requestSpecification = RestAssured.given();
//			
//	Response response = requestSpecification.request(Method.GET,"api/users");
//	System.out.println(response.asPrettyString());
//	System.out.println(response.getStatusLine());
//	
//
//	}
	@Test
	public void UsingPost()
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification requestSpecification = RestAssured.given().header("content-Type","application/json")
				.body("{\r\n" + 
						"    \"name\": \"morpheus\",\r\n" + 
						"    \"job\": \"leader\",\r\n" + 
						"    \"id\": \"424\",\r\n" + 
						"    \"createdAt\": \"2023-11-21T09:49:06.192Z\"\r\n" + 
						"}");
		Response response = requestSpecification.request(Method.POST,"api/users");
		System.out.println(response.getStatusCode());
		System.out.println(response.asPrettyString());
		}

	/*@Test
	public void UsingPut() {
		
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification requestSpecification = RestAssured.given().header("content-type","application/json")
				.body("{\r\n" + 
						"    \"name\":\"Kavitha\",\r\n" + 
						"    \"job\":\"Senior\"\r\n" + 
						"}");
		Response response = requestSpecification.request(Method.PUT,"api/users/5");
		System.out.println(response.asPrettyString());*/

		//BDD Style
		
//		when()
//		.post("api/users/2")
//		.prettyPrint();
		
	//}
	/*@Test
	public void fileread() {
	File file=new File("C:\\Users\\Dell\\eclipse-workspace\\CucumberwithRestAssured"
			+ "\\src\\test\\resources\\sample.json");
	given().baseUri("https://reqres.in/")
	.header("content-Type","application/Json").body(file).when()
	.post("api/users")
	.then()
	.log()
	.all();
	System.out.println(file);*/
	//.prettyPrint();

}
	
	
	
	



	
	

