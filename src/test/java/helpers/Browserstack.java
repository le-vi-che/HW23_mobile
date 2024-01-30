package helpers;

import static io.restassured.RestAssured.given;


public class Browserstack {

    public static String videoUrl(String sessionId) {

        String url = String.format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .auth().basic("bsuser_pdUY8b", "79pcBr1TZ8xZ9U4bcw36")
                .get(url)
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}
