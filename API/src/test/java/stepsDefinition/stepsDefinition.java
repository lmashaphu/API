package stepsDefinition;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertEquals;

public class stepsDefinition {

	
	@Given("^i perform an api request to produce a list of all dogs$")
	public void i_perform_an_api_request_to_produce_a_list_of_all_dogs() throws Throwable {

		RestAssured.baseURI = "https://dog.ceo/api/breeds/list/all";
		
		Response _response = given().when().get().then().assertThat().contentType(ContentType.JSON)
					   .and().body("status",equalTo("success")).extract().response();

	}

	@Then("^using code, verify retriever breed is within the list$")
	public void using_code_verify_retriever_breed_is_within_the_list() throws Throwable {
		
		RestAssured.baseURI = "https://dog.ceo/api/breeds/list/all";
		
		Response _response = given().when().get().then().assertThat().contentType(ContentType.JSON)
					   .and().body("status",equalTo("success")).extract().response();
		
		
		//converting the response to string
		String stringResponse = _response.asString();
		
		//convert string response to JSON
		JsonPath convertStringResponseJS = new JsonPath(stringResponse);
		
		System.out.println("MESSAGE " +  convertStringResponseJS.get("message"));
		
		//Store JSON message object in Map 
		Map<String,List<String>> message = convertStringResponseJS.get("message");
		
		//(Diagram 2) Verifies that "retriever" is within the list by checking key
		boolean checkRetrieveBreed = message.containsKey("retriever");
		
		//change actual value to false to see this assetion is working
		assertEquals(true, checkRetrieveBreed);
	  
	}

	@Then("^perform an api request to produce a list of sub-breeds for retriever$")
	public void perform_an_api_request_to_produce_a_list_of_sub_breeds_for_retriever() throws Throwable {
		
		//Here we not verifying anything, we just doing a request to produce sub-breeds for retriever
		//So we achieve that putting "retriever"on the endpoint
		
		RestAssured.baseURI = "https://dog.ceo/api/breed/retriever/list";
		
		given().when().get().then().assertThat().contentType(ContentType.JSON)
					   .and().body("status",equalTo("success"));
	    
	}

	@Then("^perform an api request to produce a random image/link for sub-breed golden$")
	public void perform_an_api_request_to_produce_a_random_image_link_for_sub_breed_golden() throws Throwable {
		
		//Here we not verifying anything, we just doing a request to produce sub-breeds for retriever
		//So we achieve that putting "retriever"on the endpoint
		
		RestAssured.baseURI = "https://dog.ceo/api/breeds/image/random/golden";
		
		given().when().get().then().assertThat().contentType(ContentType.JSON)
					   .and().body("status",equalTo("success"));
	  
	}

}
