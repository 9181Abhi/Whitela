package test.classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import pom.classes.Category_pomclass;
import pom.classes.Categorycount_Pomclass;
import pom.classes.Registerpomclass;
import pom.classes.Testbaseclass;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;


import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
public class Verify_categorycount extends Testbaseclass
{

	@Test
	public void category() throws InterruptedException, IOException
	{
		Registerpomclass register = new Registerpomclass(driver);
		register.languagebtn();
		Thread.sleep(2000);
		register.englishlangbtn();
		Thread.sleep(4000);
		
		

	 
		System.out.println("Enter into Dingdong..");
		Category_pomclass category= new  Category_pomclass(driver);
		category.clickcategory();
		Thread.sleep(1500);
		category.clickDingdong();
		
		Thread.sleep(3000);
		System.out.println("Start the json");	
		//RestAssured.baseURI = "https://wl2-test-alb.dev-diamondteam.com/api/";
		System.out.println("pass base url");
       
		String endpoint = "https://wl2-test-alb.dev-diamondteam.com/api/user/user/listProviderGame";

		
		JSONObject jsonPayload = new JSONObject();
		jsonPayload.put("category_code", "dingdong");
		jsonPayload.put("search_term", "");
		jsonPayload.put("provider_name", "");
		jsonPayload.put("dropdown_filter", false); // False as per the requirement

		// Print payload for debugging
		System.out.println("Request Payload: " + jsonPayload.toString());

		// Make the API request
		System.out.println("Sending Request...");
		Response response = RestAssured.given()
		        .header("Content-Type", "application/json")
		        .header("Origin", "https://wl2-test-user.dev-diamondteam.com")
		        .body(jsonPayload.toString())  // Convert JSONObject to string for request
		        .log().all()
		        .post(endpoint)
		        .then()
		        .extract()
		        .response();

		
		System.out.println("Response Code: " + response.getStatusCode());
		System.out.println("Response Body: " + response.getBody().asString());
		
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = objectMapper.readTree(response.getBody().asInputStream());
		
		
		String categoriesArray = jsonNode.path("data").path("gameInfo").path("total").asText();
		System.out.println("Final result");
		System.out.println(categoriesArray);
		



	Thread.sleep(2000);
	
	
	driver.close();
	

	
	
}

}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        String requestBody = "[{\r\n"
//                + "  \"search_term\": \"\",\r\n"
//                + "  \"provider_name\": \"\",\r\n"
//                + "  \"category_code\": \"dingdong\",\r\n"
//                + "  \"dropdown_filter\": true\r\n"
//                + "}]";

        // Convert String to JsonArray
//        JsonArray jsonArray1 = JsonParser.parseString(requestBody).getAsJsonArray();
//        
//        JSONObject jsonPayload = new JSONObject();
//        jsonPayload.put("category_code", "dingdong");
//        jsonPayload.put("dropdown_filter", "true");
//        System.out.println("enter log ");
////        jsonPayload.put("age", 30);
////        jsonPayload.put("email", "johndoe@example.com");
//        
//        
//
//        // Make the API request
//        Response response = RestAssured.given()
//                .header("Content-Type", "application/json")
//                .header("Origin", "https://wl2-test-user.dev-diamondteam.com")
//               // .body(jsonPayload)  // Convert JsonArray to string
//              //  .log().all()
//                .post(endpoint)
//                .then()
//                .extract()
//                .response();
//        
//        System.out.println("Exit log");
//
//        // Convert response to JsonNode
//        ObjectMapper objectMapper = new ObjectMapper();
//        JsonNode jsonNode = objectMapper.readTree(response.getBody().asInputStream());
//
//        // Print full JSON response
//        System.out.println(jsonNode);
//
//        // Extract gameInfo -> data array
//        JsonNode gameDataArray = jsonNode.path("data").path("gameInfo").path("data");
//        System.out.println(gameDataArray);
        
//        String gamesArray = jsonNode.path("data").path("gameInfo").path("data").path("total").asText();
//      String total = jsonNode.path("data").path("gameInfo").path("total").asText();
        

//        int dingdongCount = 0;
//
//        // Iterate through each game and count the ones with category_code = "dingdong"
//        if (gameDataArray.isArray()) {
//            for (JsonNode game : gameDataArray) {
//                String categoryCode = game.path("category_code").asText();
//                if ("dingdong".equalsIgnoreCase(categoryCode)) {
//                    dingdongCount++;
//                }
//            }
//        }

//        System.out.println("Dingdong Category Count: " + dingdongCount);
//    

//        String requestbody="[{\r\n"
//        		+ "  \"search_term\": \"\",\r\n"
//        		+ "  \"provider_name\": \"\",\r\n"
//        		+ "  \"category_code\": \"dingdong\",\r\n"
//        		+ "  \"dropdown_filter\": true\r\n"
//        		+ "  \r\n"
//        		+ "}]";
//        
//        JsonArray jsonarray1= JsonParser.parseString(requestbody).getAsJsonArray();
//        
//        // Make the API request and log the response
//        Response response = RestAssured
//                .given()
//                .header("Content-Type", "application/json")
//                .header("Origin","https://wl2-test-user.dev-diamondteam.com")
////                .header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vd2wyLXRlc3QtYWxiLmRldi1kaWFtb25kdGVhbS5jb20vYXBpL3VzZXIvdXNlci9sb2dpbiIsImlhdCI6MTczNzk1NzMxMSwibmJmIjoxNzM3OTU3MzExLCJqdGkiOiI0YjB3R1k4bTM4aEI0S2p0Iiwic3ViIjoiNjZiNDVhN2Y0ZWE0ZDkzNDkyMGNkNjgyIiwicHJ2IjoiMjNiZDVjODk0OWY2MDBhZGIzOWU3MDFjNDAwODcyZGI3YTU5NzZmNyJ9.2pP9xSPi2BsgBPxiwy387d4WkYGmrxgA1NFmeZXSF6k")
//                .body(jsonarray1.toString())
//                .log().all() // Logs the request details
//                .post(endpoint)
//                .then()
////                .log().all() // Logs the response details	5555
//                .extract()
//                .response();
//        
//        // Convert response to JsonNode
//        ObjectMapper objectMapper = new ObjectMapper();
//        JsonNode jsonNode = objectMapper.readTree(response.getBody().asInputStream());
//System.out.println(jsonNode);
//
////String gamesArray = jsonNode.path("data").path("gameInfo").path("data").path("total").asText();
//String total = jsonNode.path("data").path("gameInfo").path("total").asText();
//System.out.println(total);

//if (gamesArray.isArray()) {
//    for (JsonNode game : gamesArray) {
//        String gameId = game.path("_id").asText();
//        String gameName = game.path("name").asText();
//        System.out.println("Game ID: " + gameId + ", Name: " + gameName);
//    }
//}
        // Iterate through JSON keys
//        System.out.println("Iterating JSON Keys:");
//        Iterator<Map.Entry<String, JsonNode>> fields = jsonNode.fields();
//        while (fields.hasNext()) {
//            Map.Entry<String, JsonNode> field = fields.next();
//            System.out.println("Key: " + field.getKey() + ", Value: " + field.getValue());
//        }
        

//        String resp =  response.getBody().asString();
        // Log response details programmatically
      //  System.out.println("Response Status Code: " + response.getStatusCode());
//        System.out.println("Response Body: " + resp);
       // int total=response.jsonPath().

//			System.out.println("Response: " + response);

			// Check the status code
			
        
//        Thread.sleep(2500);
//        // Parse the total count from the response
//        System.out.println(response);
//        int totalGames = response.jsonPath().getInt("data.data");
//        System.out.println(response.jsonPath().getInt("data.data"));
//      
//       System.out.println("Total Games in Category: " + totalGames);
//		
     
