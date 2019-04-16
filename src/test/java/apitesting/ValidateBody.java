package apitesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;


public class ValidateBody {
	
	@SuppressWarnings("deprecation")
	@Test
	public void GetValidateBody() {
	RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	
	RequestSpecification httpRequest = RestAssured.given();
	
	Response response = httpRequest.get("/Hyderabad");
	
	ResponseBody body = response.getBody();
	
	System.out.println("Response: "+ body.asString());
	
	String validateBody = body.asString();
	
	//Assert.assertEquals(validateBody.toLowerCase().contains("Hyderabad") /*Expected value*/, true /*Actual value*/);
	
	
	

	}
}
