
package test.WFH1;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Base.BaseTest;

public class StrictFilter extends BaseTest {
	 public static WebDriver driver;
     String driverExecutablePath = "E:\\Protractor\\WFH1\\driver\\chromedriver.exe";

      ExtentReports report;
  ExtentTest logger;
    @BeforeMethod
    public void setUp1() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver",
driverExecutablePath);
        Map<String, String> mobileEmulation = new HashMap<String,
String>();
        mobileEmulation.put("deviceName", "Pixel 2");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation",
mobileEmulation);
        chromeOptions.addArguments("--disable-notifications");
        driver = new ChromeDriver(chromeOptions);



    }

    @Test
    public void testUntitled() throws Throwable {

    	StrictFilterPOM rp= new StrictFilterPOM(driver);
            Thread.sleep(5000);
                 driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
                 driver.manage().window().maximize();
                 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


                 //login
                 WebElement e=driver.findElement(By.xpath("//*[@id='idEmail']"));
                     Actions a=new Actions(driver);
                     Thread.sleep(4000);
                     a.sendKeys(e,"IYR242926").build().perform();

                 Thread.sleep(4000);

                 WebElement d=driver.findElement(By.xpath("//*[@id='password1']"));
                 Thread.sleep(4000);
                     Actions b=new Actions(driver);
                     Thread.sleep(4000);
                     b.sendKeys(d,"cbstest").build().perform();

               Thread.sleep(4000);
             BaseTest.click(rp.getLogin());

             try {
                     Thread.sleep(8000);
                     driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();


             } catch (Exception e2) {
                     //System.out.println("no element 1");
             }

             try {
                     Thread.sleep(8000);
                     driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a")).click();


             } catch (Exception e2) {
                     //System.out.println("no element 2");
             }

             try {
                     Thread.sleep(8000);
                     driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a/span")).click();


             } catch (Exception e2) {
                     //System.out.println("no element 3");
             }

             Thread.sleep(4000);
             BaseTest.click(rp.getEditpp());
                    
             Thread.sleep(4000);
             BaseTest.click(rp.getStrictfilter());
             
             try {
            	 Thread.sleep(4000);
                 driver.findElement(By.xpath("(//a[@style='left: 0%;'])[1]")).click();
                 
			} catch (Exception e2) {
				Thread.sleep(4000);
                driver.findElement(By.xpath("(//a[@style='left: 100%;'])[1]")).click();
			}
            
             try {
            	 Thread.sleep(4000);
                 driver.findElement(By.xpath("(//a[@style='left: 0%;'])[2]")).click();
                 
			} catch (Exception e2) {
				Thread.sleep(4000);
                driver.findElement(By.xpath("(//a[@style='left: 100%;'])[2]")).click();
			}
             try {
            	 Thread.sleep(4000);
                 driver.findElement(By.xpath("(//a[@style='left: 0%;'])[3]")).click();
                 
			} catch (Exception e2) {
				Thread.sleep(4000);
                driver.findElement(By.xpath("(//a[@style='left: 100%;'])[3]")).click();
			}
             
             try {
            	 Thread.sleep(4000);
                 driver.findElement(By.xpath("(//a[@style='left: 0%;'])[4]")).click();
                 
			} catch (Exception e2) {
				Thread.sleep(4000);
                driver.findElement(By.xpath("(//a[@style='left: 100%;'])[4]")).click();
			}
             
             try {
            	 Thread.sleep(4000);
                 driver.findElement(By.xpath("(//a[@style='left: 0%;'])[5]")).click();
                 
			} catch (Exception e2) {
				Thread.sleep(4000);
                driver.findElement(By.xpath("(//a[@style='left: 100%;'])[5]")).click();
			}
             
             try {
            	 Thread.sleep(4000);
                 driver.findElement(By.xpath("(//a[@style='left: 0%;'])[6]")).click();
                 
			} catch (Exception e2) {
				Thread.sleep(4000);
                driver.findElement(By.xpath("(//a[@style='left: 100%;'])[6]")).click();
			}
             
             try {
            	 Thread.sleep(4000);
                 driver.findElement(By.xpath("(//a[@style='left: 0%;'])[7]")).click();
                 
			} catch (Exception e2) {
				Thread.sleep(4000);
                driver.findElement(By.xpath("(//a[@style='left: 100%;'])[7]")).click();
			}
             
             try {
            	 Thread.sleep(4000);
                 driver.findElement(By.xpath("(//a[@style='left: 0%;'])[8]")).click();
                 
			} catch (Exception e2) {
				Thread.sleep(4000);
                driver.findElement(By.xpath("(//a[@style='left: 100%;'])[8]")).click();
			}
             
             try {
            	 Thread.sleep(4000);
                 driver.findElement(By.xpath("(//a[@style='left: 0%;'])[9]")).click();
                 
			} catch (Exception e2) {
				Thread.sleep(4000);
                driver.findElement(By.xpath("(//a[@style='left: 100%;'])[9]")).click();
			}
             
             try {
            	 Thread.sleep(4000);
                 driver.findElement(By.xpath("(//a[@style='left: 0%;'])[10]")).click();
                 
			} catch (Exception e2) {
				Thread.sleep(4000);
                driver.findElement(By.xpath("(//a[@style='left: 100%;'])[10]")).click();
			}
             
             try {
            	 Thread.sleep(4000);
                 driver.findElement(By.xpath("(//a[@style='left: 0%;'])[11]")).click();
                 
			} catch (Exception e2) {
				Thread.sleep(4000);
                driver.findElement(By.xpath("(//a[@style='left: 100%;'])[11]")).click();
			}
             
             try {
            	 Thread.sleep(4000);
                 driver.findElement(By.xpath("(//a[@style='left: 0%;'])[12]")).click();
                 
			} catch (Exception e2) {
				Thread.sleep(4000);
                driver.findElement(By.xpath("(//a[@style='left: 100%;'])[12]")).click();
			}
             
             try {
            	 Thread.sleep(4000);
                 driver.findElement(By.xpath("(//a[@style='left: 0%;'])[13]")).click();
                 
			} catch (Exception e2) {
				Thread.sleep(4000);
                driver.findElement(By.xpath("(//a[@style='left: 100%;'])[13]")).click();
			}
             
             
             try {
            	 Thread.sleep(4000);
                 driver.findElement(By.xpath("(//a[@style='left: 0%;'])[14]")).click();
                 
			} catch (Exception e2) {
				Thread.sleep(4000);
                driver.findElement(By.xpath("(//a[@style='left: 100%;'])[14]")).click();
			}
             
             try {
            	 Thread.sleep(4000);
                 driver.findElement(By.xpath("(//a[@style='left: 0%;'])[15]")).click();
                 
			} catch (Exception e2) {
				Thread.sleep(4000);
                driver.findElement(By.xpath("(//a[@style='left: 100%;'])[15]")).click();
			}
             
             try {
            	 Thread.sleep(4000);
                 driver.findElement(By.xpath("(//a[@style='left: 0%;'])[16]")).click();
                 
			} catch (Exception e2) {
				Thread.sleep(4000);
                driver.findElement(By.xpath("(//a[@style='left: 100%;'])[16]")).click();
			}
             
             try {
            	 Thread.sleep(4000);
                 driver.findElement(By.xpath("(//a[@style='left: 0%;'])[17]")).click();
                 
			} catch (Exception e2) {
				Thread.sleep(4000);
                driver.findElement(By.xpath("(//a[@style='left: 100%;'])[17]")).click();
			}
             
             try {
            	 Thread.sleep(4000);
                 driver.findElement(By.xpath("(//a[@style='left: 0%;'])[18]")).click();
                 
			} catch (Exception e2) {
				Thread.sleep(4000);
                driver.findElement(By.xpath("(//a[@style='left: 100%;'])[18]")).click();
			}
             
             
             
             
             
             
             
             
             
             
             
             
}
}