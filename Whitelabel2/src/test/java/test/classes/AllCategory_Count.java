package test.classes;

import java.io.IOException;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;



public class AllCategory_Count {
	
	
	 public static int getCategoryTotalGames(String categoryCode) throws IOException {
	        String endpoint = "https://wl2-test-alb.dev-diamondteam.com/api/user/user/listProviderGame";

	        JSONObject jsonPayload = new JSONObject();
	        jsonPayload.put("category_code", categoryCode);
	        jsonPayload.put("search_term", "");
	        jsonPayload.put("provider_name", "");
	        jsonPayload.put("dropdown_filter", false);

	        Response response = RestAssured.given()
	                .header("Content-Type", "application/json")
	                .header("Origin", "https://wl2-test-user.dev-diamondteam.com")
	                .body(jsonPayload.toString())
	                .post(endpoint)	
	                .then()
	                .extract()
	                .response();

	        ObjectMapper objectMapper = new ObjectMapper();
	        JsonNode jsonNode = objectMapper.readTree(response.getBody().asInputStream());

	        int totalGames = jsonNode.path("data").path("gameInfo").path("total").asInt();

	        System.out.print(categoryCode.substring(0, 1).toUpperCase() + categoryCode.substring(1) + " Total Games: ");
	        System.out.println(totalGames);
			return totalGames;
	    }
	
}
