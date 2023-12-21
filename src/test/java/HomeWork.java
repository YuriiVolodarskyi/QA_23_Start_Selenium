import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWork {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd=new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocator(){
       //by tag name
        WebElement h1 = wd.findElement(By.xpath("//h1"));
       // by id
        WebElement div = wd.findElement(By.xpath("//*[@id='root']"));
       //by class
        WebElement div1 = wd.findElement(By.xpath("//div[@class = 'container']"));
       //by attribute

       //one element find by attribute (start, finish, contains)
        WebElement input = wd.findElement(By.cssSelector("[placeholder = 'Email']"));
        WebElement inputX = wd.findElement(By.xpath("//input[@placeholder = 'Email']"));
        WebElement inputXstart = wd.findElement(By.xpath("//input[starts-with(@placeholder, 'Em')]"));
        WebElement inputfinish = wd.findElement(By.cssSelector("[placeholder $= 'il']"));
        WebElement inputXcontains1 = wd.findElement(By.cssSelector("[placeholder *= 'ma']"));
        WebElement inputXcontains2 = wd.findElement(By.xpath("//input[contains(@placeholder, 'Em')]"));




    }
    @AfterClass
    public void stop(){
        wd.close();
    }
}
