import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Index {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd=new ChromeDriver();
        wd.get("file:///C:/Users/User/Downloads/21.index.html");
    }

}
