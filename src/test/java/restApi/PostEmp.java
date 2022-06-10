package restApi;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;


public class PostEmp {
	
	public static HashMap map=new HashMap();

	@BeforeClass
	public void data() {
		map.put("name", "aaa");
		map.put("salary", "123");
		map.put("age", "33");
	}
	

	@Test
	public void postEmp() {
		given()
		.contentType("application/json")
		.body(map)
		.when().post("https://dummy.restapiexample.com/api/v1/create")
		//post have 201 status code.
		.then().statusCode(200).assertThat().body("status",equalTo("success")).header("Content-Type", "application/json")
		.log().all();
		
	}
	
}
