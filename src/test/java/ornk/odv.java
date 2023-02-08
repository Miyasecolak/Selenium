package ornk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class odv {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(5000);
        String expectedUrl="facebook";
        String expectedTitle="facebook";


        String actualUrl=driver.getCurrentUrl();
        String actuelTitle= driver.getTitle();
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Url test passed");
        }else {
            System.out.println("actuelTitle");
        }

        System.out.println(driver.getTitle());
        if (actuelTitle.contains(expectedTitle)){
            System.out.println("Title test passed");
        }else {
            System.out.println(actuelTitle);
            driver.close();
        }
    }
}
