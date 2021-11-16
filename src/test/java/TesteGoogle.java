import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {

    @Test
    public void teste() {
        //System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().setSize(new Dimension(1200,765));
        driver.get("https://www.google.com.br/");

        assertEquals("Google",driver.getTitle());
        driver.quit();
    }
}
