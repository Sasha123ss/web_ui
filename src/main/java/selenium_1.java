import org.graalvm.compiler.debug.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://crm.geekbrains.space/contact/create");

        browser.findElement(By.id("prependedInput")).sendKeys(" Applanatest1");
        browser.findElement(By.xpath("//input[@class='span2' and @placeholder=\"Пароль\"]")).sendKeys("Student2020!");
        browser.findElement(By.name("_submit")).click();
//        browser.findElement(By.xpath("//input[@type='text' and @data-required=\"data-required\"]")).sendKeys("Test");
//        Select org = new Select(browser.findElement(By.xpath("//span[@class=\"select2-chosen\" and .=\"Укажите организацию\"]")))
//        org.selectByIndex(1);
//        browser.findElement(By.xpath("//span[@class=\\\"select2-chosen\\\" and .=\\\"Укажите организацию\\\"]")).click();
//        Thread.sleep(1000);
//        browser.findElement(By.xpath("//div[@class=\"select2-search\"]/input[@type=\"text\" and @class=\"select2-input\"]")).sendKeys("1234");
        browser.findElement(By.xpath("//input[@name=\"crm_contact[lastName]\"]")).sendKeys("Doe");
        browser.findElement(By.name("crm_contact[firstName]")).sendKeys("John");

        Thread.sleep(50000);
        browser.close();
        browser.quit();
    }
}
