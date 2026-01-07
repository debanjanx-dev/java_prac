package tests;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class GetTest extends BaseTest {
  @Test
  public void getProducts() {
	  given().when().get("/products").then().statusCode(200).body("size()", greaterThan(0));
  }
  @Test
  public void getSingleProduct() {
      given()
      .when()
          .get("/products/1")
      .then()
          .statusCode(200)
          .body("id", equalTo(1))
          .body("title", notNullValue());
  }
  @Test
  public void addProduct() {
	  String body = "{\n" +
              "  \"title\": \"New Phone\",\n" +
              "  \"price\": 299,\n" +
              "  \"description\": \"Latest smartphone\",\n" +
              "  \"image\": \"https://i.pravatar.cc\",\n" +
              "  \"category\": \"electronics\"\n" +
              "}";
	  given().contentType("application/json").body(body).
	  when().post("/products").then().statusCode(201).body("title", equalTo("New Phone "));
  }
  @Test
  public void updateProduct() {
	  String body = "{\n" +
              "  \"title\": \"Updated Phone\",\n" +
              "  \"price\": 199,\n" +
              "  \"description\": \"Updated description\"\n" +
              "}";
	  given().contentType("application/json").body(body).then().statusCode(200).body("title", equalTo("Updated phone"));
  }
  @Test
  public void deleteTest() {
	  given().when().delete("/users/1").then().statusCode(200);
  }
}
