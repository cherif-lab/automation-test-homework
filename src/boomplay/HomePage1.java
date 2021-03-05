package boomplay;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePage1 {
    WebDriver driver;
    String pathFirefox = "/Users/ameurcherif/Desktop/WebAutomationCherifPractice/browserDriver/mac/geckodriver";
    String url = "https://www.boomplay.com";

    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.gecko.driver", pathFirefox);
        driver = new FirefoxDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

    }

    @Test
    public void checkGenre() {
        boolean genreIsAvailable = driver.findElement(By.cssSelector("a.log_clickEvent:nth-child(6)")).isDisplayed();
        System.out.println("genre available is " + genreIsAvailable);
    }
    @Test
    public void checkGenre1() {
        String message = driver.findElement(By.cssSelector("a.log_clickEvent:nth-child(6)")).getText();
        System.out.println("message text is " + message);
    }

    @Test
    public void checkGenre2() {
        driver.findElement(By.cssSelector("a.log_clickEvent:nth-child(6)")).click();

    }

    @Test
    public void checkArtists() {
        boolean artistsIsAvailable = driver.findElement(By.cssSelector("a.log_clickEvent:nth-child(5)")).isDisplayed();
        System.out.println("artists Available is " + artistsIsAvailable);
    }

    @Test
    public void checkArtists1() {
        String message1 = driver.findElement(By.cssSelector("a.log_clickEvent:nth-child(5)")).getText();
        System.out.println("text message is " + message1);
    }

    @Test
    public void checkArtists2() {
        driver.findElement(By.cssSelector("a.log_clickEvent:nth-child(5)")).click();
    }

    @Test
    public void checkPlayLists() {
        boolean playListsIsAvailable = driver.findElement(By.cssSelector(".nav_playlists")).isDisplayed();
        System.out.println("play Lists Is Available " + playListsIsAvailable);
    }

    @Test
    public void checkPlayLists1() {
        String PlayListsMessage = driver.findElement(By.cssSelector(".nav_playlists")).getText();
        System.out.println(" Message is " + PlayListsMessage);
    }

    @Test
    public void checkPlayLists2() {
        driver.findElement(By.cssSelector(".nav_playlists")).click();
    }

    @Test
    public void checkPlayLists3() {
        driver.findElement(By.cssSelector(".nav_playlists")).click();
        driver.findElement(By.xpath("/html/body/main/div/div/ul/li[1]/div/a[1]")).click();

    }

    @Test
    public void checkCharts() {
        boolean chartsIsAvailable = driver.findElement(By.xpath("/html/body/article[1]/nav/section[1]/a[2]")).isDisplayed();
        System.out.println("charts Is Available " + chartsIsAvailable);
    }

    @Test
    public void checkCharts1() {
        String chartsMessage = driver.findElement(By.cssSelector(".nav_charts")).getText();
        System.out.println("txt massage is " + chartsMessage);

    }

    @Test
    public void checkCharts2() {
        driver.findElement(By.cssSelector(".nav_charts")).click();


    }

    @Test
    public void checkCharts3() {
        driver.findElement(By.cssSelector(".nav_charts")).click();
        driver.findElement(By.xpath("//div[@class='img hasToPlay_icon']/span[3]")).click();

    }

    @Test
    public void searchCheckBox() {
        driver.findElement(By.cssSelector(".search_event")).sendKeys("music", Keys.ENTER);
        driver.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/article[1]/div/ul/li[1]/a/div/div/span[3]")).click();
    }

    @Test
    public void checkAddPlayLists() {
        boolean addPlayListsIsAvailable = driver.findElement(By.cssSelector(".nav_addAPlaylist")).isDisplayed();
        System.out.println("add Play Lists Is Available " + addPlayListsIsAvailable);
    }

    @Test
    public void checkAddPlayLists1() {
        String addPlayListsIsMessage = driver.findElement(By.cssSelector(".nav_addAPlaylist")).getText();
        System.out.println("add Play Lists Message is " + addPlayListsIsMessage);
    }

    @Test
    public void checkAddPlayLists2() {
        driver.findElement(By.cssSelector(".nav_addAPlaylist")).click();
    }

    @Test
    public void checkAddPlayLists3() {
        driver.findElement(By.cssSelector(".nav_addAPlaylist")).click();
        driver.findElement(By.cssSelector(".logIn")).click();
    }

    @Test
    public void checkLogin4() {
        driver.findElement(By.cssSelector(".nav_addAPlaylist")).click();
        driver.findElement(By.cssSelector(".logIn")).click();
        driver.findElement(By.cssSelector(".logInForm > div:nth-child(1) > label:nth-child(2) > input:nth-child(1)")).sendKeys("5512638212");
    }

    @Test
    public void checkLogin5() {
        driver.findElement(By.cssSelector(".nav_addAPlaylist")).click();
        driver.findElement(By.cssSelector(".logIn")).click();
        driver.findElement(By.cssSelector(".logInForm > div:nth-child(1) > label:nth-child(2) > input:nth-child(1)")).sendKeys("5512638212");
        driver.findElement(By.cssSelector(".logInForm > div:nth-child(2) > label:nth-child(1) > input:nth-child(1)")).sendKeys("cherif83");
    }

    @Test
    public void checkLogin6() {
        driver.findElement(By.cssSelector(".nav_addAPlaylist")).click();
        driver.findElement(By.cssSelector(".logIn")).click();
        driver.findElement(By.cssSelector(".logInForm > div:nth-child(1) > label:nth-child(2) > input:nth-child(1)")).sendKeys("5512638212");
        driver.findElement(By.cssSelector(".logInForm > div:nth-child(2) > label:nth-child(1) > input:nth-child(1)")).sendKeys("cherif83");
        driver.findElement(By.xpath("/html/body/article[2]/form[1]/div[4]")).click();

    }

    @Test
    public void checkSignUp() {
        driver.findElement(By.xpath("/html/body/article[1]/nav/section[2]/a[1]")).click();
        driver.findElement(By.cssSelector(".signUp")).click();
        driver.findElement(By.cssSelector(".signUpForm > div:nth-child(1) > label:nth-child(2) > input:nth-child(1)")).sendKeys("5512638212");
        driver.findElement(By.cssSelector(".signUpForm > div:nth-child(2) > label:nth-child(1) > a:nth-child(2)")).click();
        driver.findElement(By.cssSelector("div.li:nth-child(6) > label:nth-child(1)")).click();
    }

    @Test
    public void checkFavorite() {
        driver.findElement(By.cssSelector(".nav_favourites")).click();
    }

    @Test
    public void checkMyPlayLists() {
        driver.findElement(By.cssSelector(".nav_myPlaylists")).click();
    }

    @Test
    public void checkRecommended() {
        driver.findElement(By.xpath("/html/body/article[1]/nav/section[3]/a")).click();
    }

    @Test
    public void checkCompany() {
        boolean compDisp = driver.findElement(By.xpath("/html/body/main/div/footer/dl[1]/dt")).isDisplayed();
        System.out.println("company is displayed : " + compDisp);
    }

    @Test
    public void companyText() {
        String compText = driver.findElement(By.xpath("/html/body/main/div/footer/dl[1]/dt")).getText();
        System.out.println("company text is : " + compText);
    }

    @Test
    public void clickOnCompany() {
        driver.findElement(By.xpath("/html/body/main/div/footer/dl[1]/dt")).click();
    }

    @Test
    public void checkWebSite() {
        boolean webDisp = driver.findElement(By.xpath("/html/body/main/div/footer/dl[1]/dd[1]/a")).isDisplayed();
        System.out.println("Web Site is displayed : " + webDisp);
    }

    @Test
    public void webSiteTxt() {
        String expectedText = "Website";
        String webSiteText = driver.findElement(By.xpath("/html/body/main/div/footer/dl[1]/dd[1]/a")).getText();
        System.out.println("web Site Text is : " + webSiteText);
        Assert.assertEquals(expectedText, webSiteText);
        System.out.println("assertion passed");
    }

    @Test
    public void clickOnWebSit() {
        driver.findElement(By.xpath("/html/body/main/div/footer/dl[1]/dd[1]/a")).click();
    }

    @Test
    public void homePageTitle() {
        String expectedHomeTitle = "Boomplay: Home of Music";
        String actualHomeTitle = driver.getTitle();
        Assert.assertEquals(expectedHomeTitle, actualHomeTitle);
        System.out.println("title assertion passed");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {

        driver.quit();

    }
}
