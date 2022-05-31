package in.reqres.reqresinfo;

import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ReqresDeleteTest extends TestBase {

    @Test
    public void deleteAllProductInfo() {
        Response response = given()
                .pathParam("id",364)
                .when()
                .delete("/users/{id}");
        response.prettyPrint();
        response.then().statusCode(204);

    }

}



