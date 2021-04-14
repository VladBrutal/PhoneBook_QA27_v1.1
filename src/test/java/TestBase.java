import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBase {
    WebDriver wd;

    @Test
    public void startGoogle(){
        wd = new ChromeDriver();
        wd.get("https://www.google.com/");
    }
}
