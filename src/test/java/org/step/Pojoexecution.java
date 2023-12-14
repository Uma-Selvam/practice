package org.step;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import io.restassured.config.ObjectMapperConfig;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperType;

public class Pojoexecution {

	public static void main(String[] args) {
		
		REsponsetime t= new REsponsetime("morphise","Testing engineer",
				new String[]{"java","c"},new Details("xyz","umasit77@gmail.com"));
		
		
		
		
			Response postreq=given().auth().none().header("content-Type","application/Json")
				.contentType(ContentType.JSON).when()
				.body(t).when().post("https://reqres.in/");
			System.out.println(postreq.asPrettyString());
			Assert.assertEquals(postreq.statusCode(),200);
			//Assert.assertEquals(postreq.contentType(),"application/Json");
				
		
		

	}

}
 