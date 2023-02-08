package ornk;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class q02_DriverManageMetodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        System.out.println("fullscreenPosition"+driver.manage().window().getPosition());
        System.out.println("fullscreenSize"+driver.manage().window().getSize());
        Thread.sleep(2000);
        driver.manage().window().maximize();
        System.out.println("MximizePosition"+driver.manage().window().getPosition());
        System.out.println("maximizesize"+driver.manage().window().getSize());
        Thread.sleep(2000);
        driver.manage().window().minimize();
        System.out.println("MinimizePosition"+driver.manage().window().getPosition());
        System.out.println("Minimizesize"+driver.manage().window().getSize());
        Thread.sleep(2000);
        driver.close();


    }
}
