import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestingSteamPage {

    @Test

    public void testcase1() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //maximize screen

        driver.get("https://www.google.ca/"); //opening google chrome
        driver.navigate().to("https://store.steampowered.com/"); //navigating to steam website

        driver.findElement(By.linkText("ABOUT")).click(); //clicking on About going to that page

        driver.navigate().back(); //navigating back to steam main page

        driver.findElement(By.linkText("News")).click(); //clicking on news and going to that page

        driver.navigate().back(); //navigating back to steam main page

        driver.findElement(By.id("store_nav_search_term")).sendKeys("God Of War"); //typing on search bar God Of War

        driver.findElement(By.id("store_nav_search_term")).clear(); //clears text

        driver.findElement(By.id("store_nav_search_term")).sendKeys("Terraria"); // types Terraria on search bar

        driver.findElement(By.linkText("Top Sellers")).click(); //clicking on Top Sellers and going to that page

        driver.navigate().back(); //navigating back to steam main page



    }

}
