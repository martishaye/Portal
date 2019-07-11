
package autotest;

import com.google.common.io.Files;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.io.Writer;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PortalLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        
        System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
        WebDriver driver;
        driver = new FirefoxDriver();

        driver.get("https://portal.aait.edu.et/");

        System.out.println("Successfully opened the website localhost");

        driver.findElement(By.id("UserName")).sendKeys("IDnum");
        driver.findElement(By.id("Password")).sendKeys("password");
        driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div[2]/div[2]/div[2]/form/div[4]/div/button")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("//*[@id=\"ml2\"]")).click();
        // driver.findElement(By.id("m12")).click();

        String output = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]")).getText();
        // File DestFile= new File("Desktop/grade.doc");

        try {
            FileWriter aa = new FileWriter("grade.doc");
            aa.write(output);
            aa.close();
        }catch(IOException e){
            
            
        }
//        List<WebElement> unreademail = driver.findElements(By.className("zE"));
//        System.out.println("Total No. of Unread Mails: " + unreademail.size());
    }
}


