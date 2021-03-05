package boomplay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homepage {
    public static void main(String args[]) throws InterruptedException {

        checkGenre();

    }
    //        String chromePath = "/Users/ameurcherif/Desktop/WebAutomationCherifPractice/browserDriver/mac/chromedriver";
    String geckoPath = "/Users/ameurcherif/Desktop/WebAutomationCherifPractice/browserDriver/mac/geckodriver";
    //        System.setProperty("webdriver.chrome.driver", chromePath);
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.boomplay.com");
//        driver.manage().deleteAllCookies();
//        driver.manage().window().maximize();
//        //driver.findElement(By.className("search_event")).sendKeys("beca fever");
//        driver.findElement(By.linkText("Charts")).click(); //charts black writing
//
//
//        sleep(5000);
//        driver.close();
    public static void checkGenre() {

        System.setProperty("webdriver.gecko.driver", "/Users/ameurcherif/Desktop/WebAutomationCherifPractice/browserDriver/mac/geckodriver 3");
        WebDriver driver1 = new FirefoxDriver();
        driver1.get("https://www.boomplay.com");
        driver1.manage().deleteAllCookies();
        driver1.manage().window().maximize();
        driver1.findElement(By.linkText("Genres")).click();
//        Thread.sleep(5000);
//        driver1.quit();


    }

}
