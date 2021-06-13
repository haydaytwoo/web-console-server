import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 
import org.junit.*; 
  
public class First{  
  
    public static void main(String[] args) {  
     	System.out.println("Hey");
    System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");  
    WebDriver driver=new ChromeDriver();  
      
    driver.get("https://www.google.com"); 
           
    driver.quit();
      
    }  
  
}  
