package Day1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class etsyLike {



    @Test
    public void likeAt() throws InterruptedException {
        Driver.get().manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        Driver.get().get("https://www.etsy.com/");
        Driver.get().manage().window().maximize();

        WebElement signIn = Driver.get().findElement(By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']"));

        signIn.click();

        Thread.sleep(2000);

        WebElement register = Driver.get().findElement(By.cssSelector("button[class='wt-btn wt-btn--secondary wt-btn--small inline-overlay-trigger register-header-action select-register']"));
        register.click();

        Thread.sleep(3000);
        String mail = "abcd@hotmail.com";
        WebElement email = Driver.get().findElement(By.id("join_neu_email_field"));

        email.sendKeys(mail);

        Driver.get().findElement(By.id("join_neu_first_name_field")).sendKeys("Lukas Ibne");

        Driver.get().findElement(By.id("join_neu_password_field")).sendKeys("Darica1990");
    }
}
