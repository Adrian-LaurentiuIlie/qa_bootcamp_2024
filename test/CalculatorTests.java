import org.junit.jupiter.api.*;


public class CalculatorTests {

    Calculator c;
    @BeforeAll
    public static void classSetup(){
        System.out.println("Preparing all the test from the class");
    }

    @BeforeEach
    public void testSetup(){
        System.out.println("The methode runs before each test");
        c = new Calculator();
    }

    @Test
    public void testAddition01(){

        double result = c.compute(3, 4, "+");
        Assertions.assertEquals(7, result,"Addition fail");
    }

    @Test
    public void testAddition02(){
        Assertions.assertEquals(14.5,c.compute(10,4.5,"+"),"Addition failed");
    }

    @Test
    public void testInvalidOperator(){
        IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, () ->
            {
                c.compute(5,7,"abc");
            },"Operator not valid"
        );
    }

    @Test
    public void testDivisionByZero(){
        IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, () ->
                {
                    c.compute(5,0,"/");
                },"Operator not valid"
        );
    }

    @Test
    public void testSubtraction01(){
        Assertions.assertEquals(10, c.compute(5, -5, "-"),"Subtraction failed");
    }

    @Test
    public void testSubtraction02(){
        Assertions.assertEquals(-1, c.compute(-8,-7,"-"), "Subtraction failed");
    }

    @Test
    public void testSubtraction03(){
        Assertions.assertEquals(71, c.compute(71,0,"-"), "Subtraction failed");
    }

    @Test
    public void testMultiplication01(){
        Assertions.assertEquals(14, c.compute(7,2,"*"),"Multiplication failed");
    }

    @Test
    public void testMultiplication02(){
        Assertions.assertEquals(-15, c.compute(5,-3,"*"),"Multiplication failed");
    }

    @Test
    public void testMultiplication03(){
        Assertions.assertEquals(88, c.compute(-11,-8,"*"),"Multiplication failed");
    }

    @Test
    public void testMultiplication04(){
        Assertions.assertEquals(0, c.compute(0,35,"*"),"Multiplication failed");
    }

    @Test
    public void testDivision01(){
        Assertions.assertEquals(11, c.compute(77,7,"/"), "Division failed");
    }

    @Test
    public void testDivision02(){
        Assertions.assertEquals(-5, c.compute(-25,5,"/"), "Division failed");
    }

    @Test
    public void testDivision03(){
        Assertions.assertEquals(0, c.compute(0,21,"/"), "Division failed");
    }

    @Test
    public void testSquareRoot01(){
        Assertions.assertEquals(8, c.compute(64, 0 ,"SQRT"),"SQRT failed");
    }


    @Test
    public void testSquareRoot03(){
        Assertions.assertEquals(Math.sqrt(2), c.compute(2, 0 ,"SQRT"),"SQRT failed");
    }

    @AfterEach
    public void cleanTest(){
        System.out.println("Cleanup after the test");
    }

    @AfterAll
    public static void cleanClass(){
        System.out.println("Cleanup at the end");
    }
}
