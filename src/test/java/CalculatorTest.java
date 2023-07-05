import org.junit.*;

public class CalculatorTest {

    Calculator cal=new Calculator();
    @BeforeClass
    public static void beforeClass(){
        System.out.println("this is beforeclass");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("this is Afterclass");
    }
    @Before
    public void befores(){
        System.out.println("this is beforemethod");
    }
    @After
    public void after(){
        System.out.println("this is Aftermethod");
    }



    @Test
    public void addition(){
        Calculator cal =new Calculator();
        Assert.assertEquals(10,cal.add(5,5));
    }
    @Test
    public void subtraction(){
        Calculator cal=new Calculator();
        Assert.assertEquals(5,cal.sub(10,5));
    }
    @Test
    public void multi(){
        Calculator cal=new Calculator();
        Assert.assertEquals(20,cal.mul(5,4));
    }
    @Test
    public void div(){
        double res= cal.divide(10,0);
        Assert.assertEquals(0,res,0.0002);
    }

  }

