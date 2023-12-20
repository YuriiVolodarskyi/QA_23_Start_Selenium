import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

public class Index {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd=new ChromeDriver();
        wd.get("file:///C:/Users/User/Downloads/21.index.html");
    }

    @Test
    public void cssLocators() {
        //by tag name
        WebElement elementButton = wd.findElement(By.tagName("button"));
        System.out.println(elementButton.getTagName());
        List<WebElement> listA = wd.findElements(By.tagName("a"));
        System.out.println("size listA --> " + listA.size());
        WebElement elementForm = wd.findElement(By.tagName("form"));
        System.out.println(elementForm.getTagName());
        WebElement elementTable = wd.findElement(By.tagName("table"));
        System.out.println(elementTable.getTagName());
        WebElement elementInput = wd.findElement(By.tagName("input"));
        System.out.println(elementInput.getTagName());
        System.out.println("value type --> " + elementInput.getAttribute("type"));
        System.out.println("value placeholder -->" + elementInput.getAttribute("placeholder"));
        WebElement elementTbody = wd.findElement(By.tagName("tbody"));
        System.out.println(elementTbody.getTagName());
        List<WebElement> listTr = wd.findElements(By.tagName("tr"));
        System.out.println("size listTr --> " + listTr.size());
        WebElement elementNav = wd.findElement(By.cssSelector("[id='nav']"));
        WebElement elementCountrytable = wd.findElement(By.cssSelector("[id=country-table]"));
        WebElement elementAlert = wd.findElement(By.cssSelector("[id=alert]"));
        WebElement elementP = wd.findElement(By.tagName("p"));
        System.out.println("attribute p --> " + elementP.getAttribute("class"));

    }

    @AfterClass
    public void stop(){
        wd.close();
    }

}

