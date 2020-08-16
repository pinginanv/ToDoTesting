import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    WebDriver driver;

    @BeforeClass
    public static void testBefore() {
        System.out.println("before");
        System.setProperty("webdriver.gecko.driver","C:\\Projects\\Drivers\\geckodriver.exe");
    }
    @Before
    public void preCondition(){
        driver = new FirefoxDriver();
        System.out.println("beforecondition");
    }

    @Test
    public void Test1() {
        System.out.println("Test1");
        driver.get("http://todomvc.com/examples/backbone/");
        driver.findElement(By.cssSelector(".new-todo")).sendKeys("Nata testToDo", Keys.ENTER);

    }



    @AfterClass
    public static void testafter() {
        System.out.println("before");
    }



    @After
    public void postCondtion(){
        //driver.quit();
        System.out.println("aftercondition");
    }
}

