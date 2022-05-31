package in.reqres.reqresinfo;


import in.reqres.ReqresPojo;
import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ReqresPostTest extends TestBase {

    @Test
    public void createReqres(){
        ReqresPojo reqresPojo = new ReqresPojo();

        reqresPojo.setName("morpheus");
        reqresPojo.setJob("leader");
        reqresPojo.setId(709);
        reqresPojo.setCreatedAt("");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(reqresPojo)
                .when()
                .post("/users");
        response.then().statusCode(201);
        response.prettyPrint();

    }
    @Test
    public void createReqreslogin(){
        ReqresPojo reqresPojo = new ReqresPojo();

        reqresPojo.setEmail("Ema@gmail.com");
        reqresPojo.setPassword("123jiya456");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(reqresPojo)
                .when()
                .post("/login");
        response.prettyPrint();
        response.then().statusCode(201);

    }
    }