package restassured;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.junit.Ignore;
import org.junit.Test;
import java.util.Map;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class StepDefinitionLogicLayer {
	
	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;

	
	@Test
	public void deletUser() {
		
		request = given().contentType(ContentType.JSON);
		response = request.delete("http://10.0.10.10:9966/petclinic/api/owners/11");
		
		//json = response.then().statusCode(204);

	
		
		
		
	}
	



	
	

}
