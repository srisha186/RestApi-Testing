package restApi;
import static io.restassured.RestAssured.*;
import org.hamcrest.Matchers.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DeleteEmp {

	@Test
	public void deleteEmp() {
		
		Response response=
		given()
		.when().delete("https://dummy.restapiexample.com/api/v1/delete/3710")
		.then().statusCode(200).assertThat().extract().response();
		String formatToString=response.asString();
		Assert.assertEquals(formatToString.contains("Successfully! Record has been deleted"), true);
		System.out.println(formatToString);
		
	}
	
	
	
}
