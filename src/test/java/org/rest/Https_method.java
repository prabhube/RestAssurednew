package org.rest;

import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Https_method {
	@Test
	public void methodOne() {
		String jsonbody = "{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}";

		given().body(jsonbody).when().post("https://reqres.in/api/users").then().assertThat().statusCode(HttpStatus.SC_CREATED);
		
		
		
	}


}
