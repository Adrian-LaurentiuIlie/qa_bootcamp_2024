import org.testng.annotations.*;

public class MyFirstTestngTest {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Running the code before suite");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Running the code before class");
    }

    @BeforeGroups(groups = {"print"})
    public void beforeGroup(){
        System.out.println("Running the code before group");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Running the code before class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Running the code before method");
    }

    @Test(testName = "MyFirstTest", description = "This is my first testng test", groups = {"basicTests"}, priority = 2)
    public void test01(){
        System.out.println("My first testng test");
    }

    @Test(groups = {"print"})
    public void test02(){
        printSomething("test02");
    }

    @Test(groups = {"print"}, enabled = false)
    public void test03(){
        printSomething("test03");
    }

    private void printSomething(String something){
        System.out.println("Printing something " + something);
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Running the code after method");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Running the code after class");
    }

    @AfterGroups
    public void afterGroup(){
        System.out.println("Running the code after group");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Running the code after class");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Running the code after suite");
    }
}
