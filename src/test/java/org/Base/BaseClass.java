package org.Base;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class BaseClass {
	
	public static RequestSpecification requestSpecification;
	
	
	
	public static void requestObject(String baseURI)
	{
		RestAssured.baseURI=baseURI;
		requestSpecification = RestAssured.given();
	}
	public static void addQueryParameter(String parameterName,String parameterValue)
	{
		requestSpecification.queryParam(parameterName, parameterValue);
	}
	
	public static Response responseObject(String requestType,String resources)
	{
	switch(requestType)
	{
		case "GET":
		{
		return requestSpecification.request(Method.GET,resources);
		}
		case "POST":
		{
			return requestSpecification.request(Method.POST,resources);
		}
		case "PUT":
		{
			return requestSpecification.request(Method.PUT,resources);
		}
		default:
		{
			return requestSpecification.request(Method.DELETE,resources);
		}
	}
	
	}
	
	public static void verifyResponseCode(Response response,int expected)
	{
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(expected,statusCode);
		System.out.println("Validation of Response Code is done");
				
	}
	
	public static void verifyResponseBody(Response response,String jsonPath,String expected)
	{
		Object object = response.jsonPath().get(jsonPath);
	    String s=(String)object;
	    System.out.println(response.getBody().asPrettyString());
	    Assert.assertEquals(expected, s);
	    System.out.println("Validation of Response Body is done");
	}

	
	
}

