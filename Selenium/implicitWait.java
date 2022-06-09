import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

class SeleniumImplicitWait{
  private WebDriver driver;
  private String baseUrl;
  private WebElement element;
  
  @BeforeMethod
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.google.com";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  public static void main(String[] args){
   
    
  @Test
  public void testUntitled() throws Exception {
    driver.get(baseUrl);
    element = driver.findElement(By.id("lst-ib"));
    element.sendKeys("Selenium WebDriver Interview questions");
    element.sendKeys(Keys.RETURN);
    List<WebElement> list = driver.findElements(By.className("container"));
    System.out.println(list.size());
  }
    
    
   @AfterMethod
   public void tearDown() throws Exception {
    driver.quit();
   }
 
}
