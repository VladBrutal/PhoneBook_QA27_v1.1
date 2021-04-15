import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogOutTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        // login
        String login = "josephbenmoshe@yahoo.com";
        String password = "$V06021988m";
        loginTest(login, password);
    }

    @Test
    public void logoutTest(){
        wd.findElement(By.tagName("button")).click();

        //test
        String text = wd.findElement(By.linkText("LOGIN")).getText();
        Assert.assertEquals(text,"LOGIN");


    }
}
