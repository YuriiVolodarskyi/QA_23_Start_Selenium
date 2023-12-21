import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
    public void tableTest(){
        WebElement elementCanada = wd.findElement(By.cssSelector("tr:nth-child(3) td:last-child"));
        Assert.assertEquals(elementCanada.getText(),"Canada");
    }

    @Test
    public void cssLocators() {
        //by tag name
        WebElement elementDiv = wd.findElement(By.tagName("div"));
        System.out.println(elementDiv.getTagName());
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
        WebElement elementUl = wd.findElement(By.tagName("ul"));
        System.out.println(elementUl.getTagName());
        WebElement elementLi = wd.findElement(By.tagName("li"));
        System.out.println(elementLi.getTagName());
        System.out.println("value type --> " + elementInput.getAttribute("type"));
        System.out.println("value placeholder -->" + elementInput.getAttribute("placeholder"));
        WebElement elementTbody = wd.findElement(By.tagName("tbody"));
        System.out.println(elementTbody.getTagName());
        List<WebElement> listTr = wd.findElements(By.tagName("tr"));
        System.out.println("size listTr --> " + listTr.size());
        WebElement elementNav = wd.findElement(By.cssSelector("[id='nav']"));
        WebElement elementCountrytable = wd.findElement(By.cssSelector("[id='country-table']"));
        WebElement elementAlert = wd.findElement(By.cssSelector("[id=alert]"));
        WebElement elementP = wd.findElement(By.tagName("p"));
        System.out.println("attribute p --> " + elementP.getAttribute("class"));
        WebElement elementClassName1 = wd.findElement(By.className("container"));
        WebElement elementClassName2 = wd.findElement(By.cssSelector(".container"));
        List<WebElement>listNav = wd.findElements(By.className("nav-item"));
        WebElement elementId1 = wd.findElement(By.id("nav"));
        WebElement elementId2 = wd.findElement(By.cssSelector("#nav"));
        WebElement elementAttributeHref = wd.findElement(By.cssSelector("[href='#item1']"));
        WebElement elementAttributePlaceholder = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement elementAttName1 = wd.findElement(By.name("name"));
        WebElement elementAttName2 = wd.findElement(By.cssSelector("[name='surname']"));
        WebElement elementInputStart = wd.findElement(By.cssSelector("[placeholder^='Type']"));
        WebElement elementInputFinish = wd.findElement(By.cssSelector("[placeholder$='name']"));
        WebElement elementInputPart = wd.findElement(By.cssSelector("[placeholder*='your']"));


    }

    @AfterClass
    public void stop(){
        wd.close();
    }

}

