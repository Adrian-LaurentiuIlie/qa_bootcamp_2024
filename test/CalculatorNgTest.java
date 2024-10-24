import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class CalculatorNgTest {

    Calculator c;
    final String additionFailedMessage = "Addition Failed.";
    ExtentReports extent = new ExtentReports();
    ITestContext testContext;

    @DataProvider
    public Object[][] calculatorDataProviderClassic() {
        return new Object[][]{
                {100, 20, 80, "+", additionFailedMessage},
                {1000, 555, 445, "+", additionFailedMessage},
                {1, 1, 0, "+", additionFailedMessage},
        };
    }

    @DataProvider
    public Iterator<Object[]> calculatorDataProvider() {
        Collection<Object[]> dp =new ArrayList<>();
        dp.add(new Object[]{100, 20, 80, "+", additionFailedMessage});
        dp.add(new Object[]{1000, 555, 445, "+", additionFailedMessage});
        dp.add(new Object[]{1, 1, 0, "+", additionFailedMessage});
        return dp.iterator();
    }

    private void setUpGeneric(){
        c = new Calculator();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("target/report.html");
        extent.attachReporter(sparkReporter);
    }

    @BeforeSuite
    public void setUpSuite(){
        setUpGeneric();
    }

    @BeforeClass
    public void setUpClass() {
        setUpGeneric();
    }

    @BeforeMethod
    public void setUp() {
        setUpGeneric();
    }

    @BeforeGroups(groups = {"Addition", "Calculator"})
    public void setUpGroup() {
        setUpGeneric();
    }

    @BeforeTest
    public void setUpTest(final ITestContext testContext){
        setUpGeneric();
        this.testContext = testContext;
    }

    @Test(testName = "AdditionPositive", groups = {"Addition", "Calculator"})
    public void test01() {
        ExtentTest mytest = extent.createTest("Addition Positive");
        Assert.assertEquals(37, c.compute(24,13,"+"), "Addition failed");
        mytest.log(Status.PASS, "test finished");
    }

    @Test(testName = "AdditionNegatives", groups = {"Addition", "Calculator"})
    public void test02(){
        ExtentTest mytest = extent.createTest("Addition Negatives");
        Assert.assertEquals(-23, c.compute(-11,-12,"+"), "Addition failed");
        mytest.log(Status.PASS, "test finished");
    }

    @Test(testName = "AdditionParameters", groups = {"Addition", "Calculator"})
    @Parameters({"expected","d1","d2","operator","errorMessage"})
    public void test03(String expected, String d1, String d2, String operator, String errorMessage){
        ExtentTest mytest = extent.createTest("AdditionParameters");
        Assert.assertEquals(Double.parseDouble(expected), c.compute(Double.parseDouble(d1),Double.parseDouble(d2),operator), errorMessage);
        mytest.log(Status.PASS, "test finished");
    }

    @Test(testName = "AdditionDataProviderClassic", groups = {"Addition", "Calculator"},dataProvider = "calculatorDataProviderClassic")
    public void test04(double expected, double d1, double d2, String operator, String errorMessage){
        ExtentTest mytest = extent.createTest("AdditionDataProviderClassic");
        Assert.assertEquals(expected, c.compute(d1, d2,operator), errorMessage);
        mytest.log(Status.PASS, "test finished");
    }

    @Test(testName = "AdditionDataProvider", groups = {"Addition", "Calculator"},dataProvider = "calculatorDataProvider")
    public void test05(double expected, double d1, double d2, String operator, String errorMessage){
        ExtentTest mytest = extent.createTest("AdditionDataProvider");
        Assert.assertEquals(expected, c.compute(d1, d2,operator), errorMessage);
        mytest.log(Status.PASS, "test finished");
    }

    private void cleanUpGeneric(){
        extent.flush();
    }

    @AfterSuite
    public void afterSuitGeneric(){
        cleanUpGeneric();
    }

    @AfterClass
    public void afterClassGeneric(){
        cleanUpGeneric();
    }

    @AfterGroups(groups = {"Addition", "Calculator"})
    public void afterGroupGeneric(){
        cleanUpGeneric();
    }

}
