package restApi;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;


public class RestApi {
	
	//BDD Approach
//given--prerequisite, set cookies add authr, add parameter,set header
	//when--action get,post,delete,update
	//then--validation
	
	@Test
	public void getRequest() {
		
		given()
		.when().get("https://dummy.restapiexample.com/api/v1/employees")
		//body has multiple elements,.body("msg",hasItems("sss","aaa","vvv"))
		.then().statusCode(200).assertThat().header("Content-Type","application/json").body("status",equalTo("success"))
		.log().all();
	}
	
	
}
