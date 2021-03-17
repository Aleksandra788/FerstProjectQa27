import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Firsttest {
    WebDriver wd;

    @Test
    public void  startgoogle(){

        System.setProperty("webdriver.chrome.driver","/Users/tayahatum/Tools/cromedriver");Введите сообщение

        wd = new ChromeDriver();
        wd.get("https://www.google.co.il/");

    }


}
