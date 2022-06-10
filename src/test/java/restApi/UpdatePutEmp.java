package restApi;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UpdatePutEmp {

	public static HashMap map=new HashMap();
	
	@BeforeClass
	public void data() {
		map.put("name","aaamorpheus");
		map.put("job","zion residentaaa");
		//map.put("age","36");

	}
	
	
	@Test
	public void updatemeth() {
		given()
		.contentType("application/json")
		.body(map)
		.when().put("https://reqres.in/api/users/7")
		.then().assertThat().body("name",equalTo("aaamorpheus")).header("Content-Type", "application/json; charset=utf-8")
		.log().all();
	}
}
