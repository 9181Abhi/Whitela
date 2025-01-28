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

public class Verify_categorycount extends Testbaseclass
{

	@Test
	public void category() throws InterruptedException
	{
		Registerpomclass register = new Registerpomclass(driver);
		register.languagebtn();
		Thread.sleep(2000);
		register.englishlangbtn();
		Thread.sleep(4000);
		
		
		
//		WebElement countarcade=driver.findElement(By.xpath("(//p[@class='gc-sub-title text-categories_game_count'])[5]"));
//		String arcadecount=countarcade.getText();
//		
//		System.out.println("print");
//		System.out.println(arcadecount);
//		
//		Thread.sleep(3000);
//		 
		
		Category_pomclass category= new  Category_pomclass(driver);
		category.clickcategory();
		Thread.sleep(1500);
		category.clickDingdong();
		
		Thread.sleep(3000);
		System.out.println("Start the json");
		//RestAssured.baseURI = "https://wl2-test-alb.dev-diamondteam.com/api/";
		System.out.println("pass base url");
        // Call the API and get the response
		   // Define the API endpoint
        String endpoint = "https://wl2-test-alb.dev-diamondteam.com/api/user/user/listProviderGame";
        String requestbody="[{\r\n"
        		+ "  \"search_term\": \"\",\r\n"
        		+ "  \"provider_name\": \"\",\r\n"
        		+ "  \"category_code\": \"dingdong\",\r\n"
        		+ "  \"dropdown_filter\": true\r\n"
        		+ "  \r\n"
        		+ "}]";
        // Make the API request and log the response
        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("Origin","https://wl2-test-user.dev-diamondteam.com")
//                .header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vd2wyLXRlc3QtYWxiLmRldi1kaWFtb25kdGVhbS5jb20vYXBpL3VzZXIvdXNlci9sb2dpbiIsImlhdCI6MTczNzk1NzMxMSwibmJmIjoxNzM3OTU3MzExLCJqdGkiOiI0YjB3R1k4bTM4aEI0S2p0Iiwic3ViIjoiNjZiNDVhN2Y0ZWE0ZDkzNDkyMGNkNjgyIiwicHJ2IjoiMjNiZDVjODk0OWY2MDBhZGIzOWU3MDFjNDAwODcyZGI3YTU5NzZmNyJ9.2pP9xSPi2BsgBPxiwy387d4WkYGmrxgA1NFmeZXSF6k")
                .body(requestbody)
                .log().all() // Logs the request details
                .post(endpoint)
                .then()
//                .log().all() // Logs the response details
                .extract()
                .response();

        // Log response details programmatically
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());

//			System.out.println("Response: " + response);

			// Check the status code
			
        
//        Thread.sleep(2500);
//        // Parse the total count from the response
//        System.out.println(response);
//        int totalGames = response.jsonPath().getInt("total");
//      
//        System.out.println("Total Games in Category: " + totalGames);
//		
//     	Thread.sleep(2000);
		
			
		driver.close();
		
	
		
		
	}
	
}
