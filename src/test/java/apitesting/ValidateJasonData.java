package apitesting;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class ValidateJasonData {
	
	@Test
	public void validatejsonData() {
		
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest =RestAssured.given();
		Response response = httpRequest.get("/Hyderabad");
		JsonPath jsonPathEvaluator = response.jsonPath();
		
		String city = jsonPathEvaluator.get("City");
		System.out.println("City received from Response:  " + city);
		//Assert.assertEquals(city, "Hyderabad","Correct city name received in the Response");
		
	}

}
