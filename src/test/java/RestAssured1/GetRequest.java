package RestAssured1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {
	@Test
	public void getWeatherDetails() {
		
		//specify base uri
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		
		//Request object=to send request to server
		RequestSpecification httprequest=RestAssured.given();
		
		//Response object
		Response response=httprequest.request(Method.GET,"/Hyderabad");
		
		
		//print response in console window
		String responseBody=response.getBody().asString();
		System.out.println(responseBody);
	}
	
	
	

}
