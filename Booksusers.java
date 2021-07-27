package selenium_demo.selenium_demo;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Booksusers {

	@Test
	
	public void postreq1()
	{
		
		
		
		JSONObject str = new JSONObject();
		str.put("id","2");
		str.put("username","thanuja");
	    str.put("firstname", "thanuja");
		str.put("email", "string");
	    
		
		Response resp = RestAssured.given().
		                body(str.toJSONString()).
		                header("Content-Type","Application/json").
		                header("accept","application/json").
		                when().
		                post("https://reqres.in/api/users");
		
		System.out.println(resp.asPrettyString());
		Assert.assertEquals(resp.getStatusCode(),201);
		        		
		
	}
	
}
