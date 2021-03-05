package boomplay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage1{

    public void testCheckGenre(){
        String expetedResult="Weekly Charts";
        WebElement actualresult=driver.findElement(By.className("moreBtn"));
        Assert.assertEquals(actualresult,actualresult,"test fail");

    }
    @Test
    public void testCheckArtists() throws InterruptedException {
        searchCheckBox();

        String expectedText="Music";
        String actualText= driver.findElement(By.xpath("//div[@id='searchDetails']/nav/a")).getText();
        System.out.println(actualText);
        Assert.assertEquals(expectedText,actualText,"not match");

    }
}
