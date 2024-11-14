package petStore;

import com.google.gson.Gson;
import io.restassured.http.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import petStore.models.Category;
import petStore.models.Pet;
import petStore.models.Tag;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import static org.hamcrest.MatcherAssert.assertThat;

public class PetTest extends BaseTest{

    @DataProvider(name = "FindPetById")
    public Iterator<Object[]> registerDp () {
        Collection<Object[]> dp = new ArrayList<>();
        dp.add(new String[] {"9999", "404", ""});
        dp.add(new String[] {"10", "200", "doggie"});
        return dp.iterator();
    }

    @Test(dataProvider = "FindPetById")
    public void findPetById(String petId, String responseCode, String name){

        Response response = httpRequest.request(Method.GET, "/pet/" + petId);
        Assert.assertEquals(response.getStatusCode(), Integer.parseInt(responseCode));

        assertThat(response.getStatusLine(), Matchers.containsStringIgnoringCase("http/1.1"));
        Assert.assertEquals(response.getHeader("Content-Type"), "application/json");
        Assert.assertEquals(response.getHeader("Access-Control-Allow-Methods"), "GET, POST, DELETE, PUT");

        Assert.assertEquals(response.getDetailedCookies().asList().size(), 0);

        JsonPath jsonPathEvaluator = response.jsonPath();
        if(response.getStatusCode() == 404){
            Assert.assertEquals(jsonPathEvaluator.getString("message"), "Pet not found");
        }
        if(response.getStatusCode() == 200){
            Assert.assertEquals(jsonPathEvaluator.getString("name"), name);
        }
    }

    @Test
    public void createPet(){
        Category c = new Category(2468, "Zebra");
        Tag t = new Tag(2468, "tagName");
        ArrayList<Tag> tags = new ArrayList<>();
        tags.add(t);
        ArrayList<String> photoUrl = new ArrayList<>();
        photoUrl.add("http://zebra.com");
        Pet p = new Pet(13579, c, "zebra", photoUrl, tags, "available");
        // Serializing Object to JSON String
        Gson gson = new Gson();
        String jsonOutput = gson.toJson(p);
        System.out.println(jsonOutput);

        httpRequest.body(jsonOutput);
        Response response = httpRequest.request(Method.POST, "/pet");
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());

        // Deserlizing Json string to Object
        Pet myPet = gson.fromJson(jsonOutput, Pet.class);
        System.out.println(myPet.getName());
    }
}
