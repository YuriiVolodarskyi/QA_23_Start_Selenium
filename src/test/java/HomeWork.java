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
        WebElement divId = wd.findElement(By.id("root"));
        WebElement divId_css = wd.findElement(By.cssSelector("#root"));
        WebElement divId_xpath = wd.findElement(By.xpath("//*[@id='root']"));

        //by class
        WebElement divClass1 = wd.findElement(By.className("container"));
        WebElement divClass1_css = wd.findElement(By.cssSelector(".container"));
        WebElement divClass1_xpath = wd.findElement(By.xpath("//div[@class = 'container']"));
        WebElement divClass2 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement divClass2_css = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement divClass2_xpath = wd.findElement(By.xpath("//div[@class = 'navbar-component_nav__1X_4m']"));
        WebElement divClass3 = wd.findElement(By.className("active"));
        WebElement divClass3_css = wd.findElement(By.cssSelector(".active"));
        WebElement divClass3_xpath = wd.findElement(By.xpath("//a[@class = 'active']"));
        WebElement divClass4 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement divClass4_css = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement divClass4_xpath = wd.findElement(By.xpath("//div[@class = 'login_login__3EHKB']"));

        //by attribute
        WebElement divAttHref1 = wd.findElement(By.cssSelector("[href = '/home']"));
        WebElement divAttHref2 = wd.findElement(By.cssSelector("[href = '/about']"));
        WebElement divAttHref3 = wd.findElement(By.cssSelector("[href = '/login']"));
        WebElement divAttAria = wd.findElement(By.cssSelector("[aria-current = 'page']"));
        WebElement divAttStyle = wd.findElement(By.cssSelector
                ("[style = 'border: 1px solid black; background-color: black; color: white;']"));
        WebElement divAttName1 = wd.findElement(By.name("email"));
        WebElement divAttName1_css = wd.findElement(By.cssSelector("[name='email']"));
        WebElement divAttName = wd.findElement(By.name("password"));
        WebElement divAttName2_css = wd.findElement(By.cssSelector("[name='password']"));
        WebElement divAttName3 = wd.findElement(By.name("login"));
        WebElement divAttName3_css = wd.findElement(By.cssSelector("[name='login']"));
        WebElement divAttName4 = wd.findElement(By.name("registration"));
        WebElement divAttName4_css = wd.findElement(By.cssSelector("[name='registration']"));
        WebElement divAttType_css = wd.findElement(By.cssSelector("[type='submit']"));
        WebElement divAttPlaceholder1 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement divAttPlaceholder2 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement divAttSrc = wd.findElement(By.cssSelector("[src='/static/js/2.03ed4652.chunk.js']"));

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



    }

    @AfterClass
    public void stop() {
        wd.close();
    }
}
