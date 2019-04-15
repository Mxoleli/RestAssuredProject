package apitesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateStatusCode {
	
	
	@Test
	public void GetStatusCode() {
		
		
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Response response = httpRequest.request(Method.GET,"/Hyderabad");
		
		int statusCode = response.statusCode();
		System.out.println("The Status Code is: => "+ statusCode);
	}
	
	

}
