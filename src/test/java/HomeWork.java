import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocator() {
        //by tag name
        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h1_xpath = wd.findElement(By.xpath("//h1"));
        WebElement form = wd.findElement(By.tagName("form"));
        WebElement form_xpath = wd.findElement(By.xpath("//form"));
        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input_xpath = wd.findElement(By.xpath("//input"));
        WebElement button =wd.findElement(By.tagName("button"));
        WebElement button_xpath = wd.findElement(By.xpath("//button"));
        WebElement br = wd.findElement(By.tagName("br"));
        WebElement br_xpath = wd.findElement(By.xpath("//br"));
        WebElement script = wd.findElement(By.tagName("script"));
        WebElement script_xpath = wd.findElement(By.xpath("//script"));
        WebElement a = wd.findElement(By.tagName("a"));
        WebElement a_xpath = wd.findElement(By.xpath("//a"));

        // by id
        WebElement id = wd.findElement(By.id("root"));
        WebElement id_css = wd.findElement(By.cssSelector("#root"));
        WebElement id_xpath = wd.findElement(By.xpath("//*[@id='root']"));

        //by class
        WebElement class1 = wd.findElement(By.className("container"));
        WebElement class1_css = wd.findElement(By.cssSelector(".container"));
        WebElement class1_xpath = wd.findElement(By.xpath("//div[@class = 'container']"));
        WebElement class2 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement class2_css = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement class2_xpath = wd.findElement(By.xpath("//div[@class = 'navbar-component_nav__1X_4m']"));
        WebElement class3 = wd.findElement(By.className("active"));
        WebElement class3_css = wd.findElement(By.cssSelector(".active"));
        WebElement class3_xpath = wd.findElement(By.xpath("//a[@class = 'active']"));
        WebElement class4 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement class4_css = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement class4_xpath = wd.findElement(By.xpath("//div[@class = 'login_login__3EHKB']"));

        //by attribute
        WebElement attHref1 = wd.findElement(By.cssSelector("[href = '/home']"));
        WebElement attHref_xpath = wd.findElement(By.xpath("//*[@href = '/home']"));
        WebElement attHref2 = wd.findElement(By.cssSelector("[href = '/about']"));
        WebElement attHref3 = wd.findElement(By.cssSelector("[href = '/login']"));
        WebElement attAria = wd.findElement(By.cssSelector("[aria-current = 'page']"));
        WebElement attStyle = wd.findElement(By.cssSelector
                ("[style = 'border: 1px solid black; background-color: black; color: white;']"));
        WebElement attName1 = wd.findElement(By.name("email"));
        WebElement attName1_css = wd.findElement(By.cssSelector("[name='email']"));
        WebElement attName = wd.findElement(By.name("password"));
        WebElement attName2_css = wd.findElement(By.cssSelector("[name='password']"));
        WebElement attName3 = wd.findElement(By.name("login"));
        WebElement attName3_css = wd.findElement(By.cssSelector("[name='login']"));
        WebElement attName4 = wd.findElement(By.name("registration"));
        WebElement attName4_css = wd.findElement(By.cssSelector("[name='registration']"));
        WebElement attType_css = wd.findElement(By.cssSelector("[type='submit']"));
        WebElement attPlaceholder1 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement attPlaceholder2 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement attSrc = wd.findElement(By.cssSelector("[src='/static/js/2.03ed4652.chunk.js']"));

        //one element find by attribute (start, finish, contains)
        WebElement input1 = wd.findElement(By.cssSelector("[placeholder = 'Email']"));
        WebElement inputX = wd.findElement(By.xpath("//input[@placeholder = 'Email']"));
        WebElement inputXstart = wd.findElement(By.xpath("//input[starts-with(@placeholder, 'Em')]"));
        WebElement inputfinish = wd.findElement(By.cssSelector("[placeholder $= 'il']"));
        WebElement inputXcontains1 = wd.findElement(By.cssSelector("[placeholder *= 'ma']"));
        WebElement inputXcontains2 = wd.findElement(By.xpath("//input[contains(@placeholder, 'Em')]"));

        WebElement styleStart_css = wd.findElement(By.cssSelector("[style ^='border']"));
        WebElement styleStart_xpath = wd.findElement(By.xpath("//a[starts-with(@style, 'border')]"));
        WebElement styleFinish_css = wd.findElement(By.cssSelector("[style $='white;']"));
        WebElement styleContains_css = wd.findElement(By.cssSelector("[style *='color']"));
        WebElement styleContains_xpath = wd.findElement(By.xpath("//a[contains(@style, 'color')]"));

        WebElement longWay_css = wd.findElement(By.cssSelector("div[id='root'] :nth-child(2) div form button[name='login']"));
        WebElement longWay_xpath = wd.findElement(By.xpath("//*[@id='root']/div/div/form/button[@name='login']"));

        WebElement a3_xpath = wd.findElement(By.xpath("//a[3]"));
    }

    @Test
    public void classwork() {
        //parent
        WebElement el = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el1 = wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el2 = wd.findElement(By.xpath("//h1/.."));

        //ancestor
        WebElement el3 = wd.findElement(By.xpath("//h1/ancestor::*"));//all
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::div"));//two options
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div[2]"));//one option

        //ancestor or self (plus one more)
        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
        List<WebElement> list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling
        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::a"));

        //preceding-sibling
        WebElement el7 = wd.findElement(By.xpath("//a[last()]/preceding-sibling::h1"));
        List<WebElement> list2 = wd.findElements(By.xpath("//a[last()]/preceding-sibling::a"));
    }

    @AfterClass
    public void stop() {
        wd.close();
    }
}
