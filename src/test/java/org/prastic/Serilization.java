package org.prastic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Serilization {
	
	
	@Test
	public void serilizationConcept() {
		
		Map<String,Object> m=new HashMap<>();
		m.put("name","umaS");
		m.put("age",24);
		m.put("status",true);
		
		List li=new ArrayList();
		li.add("java");
		li.add("selenium");
		li.add("C");
		m.put("li",li);
		System.out.println(m);
		
		given()
		.baseUri("https://reqres.in/")
		.header("content-Type","application/json")
		.body(m)
		.log()
		.all()
		.when()
		.post("api/users")
		.then()
		.log()
		.all();
		

	}

}
