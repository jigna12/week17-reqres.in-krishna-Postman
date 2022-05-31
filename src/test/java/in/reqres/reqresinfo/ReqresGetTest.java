package in.reqres.reqresinfo;

import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;


public class ReqresGetTest extends TestBase {

    @Test
    public void getAllReqresInfo() {
        Response response = given()
                .when()
                .get("?page=2");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleReqresInfo() {
        Response response = given()
                .pathParam("id",7)
                .when()
                .get("?page=2/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void searchStudentWithParameter() {
        HashMap<String, Object> qParams = new HashMap<>();
        qParams.put("page",2);

        Response response = given()
                .queryParams(qParams)
                .when()
                .get("?page=2");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void getSingleuserReqresInfo() {
        Response response = given()
                .pathParam("id",2)
                .when()
                .get("/{id}");
        response.prettyPrint();
        response.then().statusCode(200);

    }
    }


