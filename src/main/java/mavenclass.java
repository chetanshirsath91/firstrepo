import java.util.concurrent.TimeUnit;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

 

public class mavenclass{

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub

 

  System.setProperty("webdriver.edge.driver", "C:\\Users\\M1073078\\msedgedriver.exe");
          
          WebDriver driver=new EdgeDriver();
          
          driver.get("https://www.eazydiner.com/");
         
          String title= driver.getTitle();
          System.out.println("the page title is: "+title);
    }
    
    
}