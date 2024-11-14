package petStore;

import com.google.gson.Gson;
import io.restassured.http.Method;
import io.restassured.response.Response;
import juiceShop.frameworkUtils.Utils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import petStore.models.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class UsetTest extends BaseTest{

    @DataProvider(name = "userDp")
    public Iterator<Object[]> userDp () {
        Collection<Object[]> dp = new ArrayList<>();
        dp.add(new String[] {Utils.generateRandomNumber(1000) +"", "Adrian12", "Adrian", "Ilie", "adrian@adi.com", "12345Adi", "078944561233", "0"});
        return dp.iterator();
    }

    @Test(dataProvider = "userDp")
    public void createUser(String id, String username, String firstName, String lastName, String email, String password, String phone, String userStatus){
        User u = new User(Integer.parseInt(id), username, firstName, lastName, email, password, phone, Integer.parseInt(userStatus));
        Gson gson = new Gson();
        System.out.println(gson.toJson(u));
        httpRequest.body(gson.toJson(u));
        Response response = httpRequest.request(Method.POST, "/user");
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
    }
}
