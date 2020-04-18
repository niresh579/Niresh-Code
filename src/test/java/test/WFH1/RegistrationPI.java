package test.WFH1;

import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Base.BaseTest;


public class RegistrationPI extends BaseTest{
	public static WebDriver driver;
	String driverExecutablePath = "E:\\Protractor\\WFH1\\driver\\chromedriver.exe"; 

	 ExtentReports report;
     ExtentTest logger;
       @BeforeMethod
       public void setUp1() throws MalformedURLException {
           System.setProperty("webdriver.chrome.driver", driverExecutablePath);
           Map<String, String> mobileEmulation = new HashMap<String, String>();		
           mobileEmulation.put("deviceName", "Pixel 2");

           ChromeOptions chromeOptions = new ChromeOptions();
           chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
           chromeOptions.addArguments("--disable-notifications");
           driver = new ChromeDriver(chromeOptions);
          
           
//           ExtentReports report;
//           ExtentTest logger;
//           private String reportDirectory = "reports";
//           private String reportFormat = "xml";
//           private String testName = "Untitled";
//           protected AndroidDriver<AndroidElement> driver = null;
//
//           DesiredCapabilities dc = new DesiredCapabilities();
//           
//           @BeforeTest
//           public void setUp() throws MalformedURLException {
//           	   dc.setCapability("reportDirectory", reportDirectory);
//                  dc.setCapability("reportFormat", reportFormat);
//                  dc.setCapability("testName", testName);
//                  dc.setCapability(MobileCapabilityType.UDID, "ZDHUTW49BMOZAU8T");
//                  dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
//                  dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
//                  driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
//                  driver.setLogLevel(Level.INFO);

           
           
       }
	
	@Test
	public void test() throws Throwable {
		RegistrationPOM rp=new RegistrationPOM(driver);
		Thread.sleep(4000);
		driver.get("https://m.communitymatrimony.com/");
		Thread.sleep(4000);	
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		WebElement createaccount=driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
//		String a23=createaccount.getText();
//		System.out.println(a23);
//		
//
//		WebElement log=driver.findElement(By.xpath("//span[@id='login-btn']"));
//		String login=log.getText();
//		System.out.println(login);
//		
//		WebElement suita=driver.findElement(By.xpath("//h3[contains(text(),'Find Your Suitable Match!')]"));
//		String suitamatch=suita.getText();
//		System.out.println(suitamatch);
//		
//		
//		String community=driver.findElement(By.xpath("//label[contains(text(),'Select your community to start off')]")).getText();
//		assertEquals("Select your community to start off",community, "Passed");
//		
//		Thread.sleep(4000);
//		BaseTest.click(rp.getContinuebutton());
//		WebElement community1=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[1]/label"));
//		String a=community1.getText();
//		System.out.println(a);
//			
		
		Thread.sleep(4000);
		BaseTest.click(rp.getCommunity());
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		Thread.sleep(4000);
		 BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 0)+"')]")));
		
		
		 /*	String profile=driver.findElement(By.xpath("//span[contains(text(),'Select who is creating profile')]")).getText();
		assertEquals("Select who is creating profile",profile, "Passed");
		
		String gender=driver.findElement(By.xpath("//span[contains(text(),'Gender of the bride / groom')]")).getText();
		assertEquals("Gender of the bride / groom",gender, "Passed");
		
		String name=driver.findElement(By.xpath("//label[contains(text(),'Enter the name of bride / groom')]")).getText();
		assertEquals("Enter the name of bride / groom",name, "Passed");
		
		String dob=driver.findElement(By.xpath("//label[contains(text(),'Date of birth of the bride / groom')]")).getText();
		assertEquals("Date of birth of the bride / groom",dob, "Passed");
		
		String gmail=driver.findElement(By.xpath("//label[contains(text(),'This will be used to send all communication')]")).getText();
		assertEquals("This will be used to send all communication",gmail, "Passed");
		
		String pass2=driver.findElement(By.xpath("//label[contains(text(),'Enter a password to keep your account secure')]")).getText();
		assertEquals("Enter a password to keep your account secure",pass2, "Passed");
		
		String mob=driver.findElement(By.xpath("//label[contains(text(),'Interested matches will contact you in this number')]")).getText();
		assertEquals("Interested matches will contact you in this number",mob, "Passed");
		
		String mothers=driver.findElement(By.xpath("//label[contains(text(),'Select mother tongue to find the one who speaks your language')]")).getText();
		assertEquals("Select mother tongue to find the one who speaks your language",mothers, "Passed");
		
//		try {
//			String sub=driver.findElement(By.xpath("//label[contains(text(),'Select subcaste to find compatible matches')]")).getText();
//			assertEquals("Select subcaste to find compatible matches",sub, "Passed");
//			
//		} catch (Exception e) {
//			
//		}
		
		try {
			String denom=driver.findElement(By.xpath("//label[contains(text(),'Select denomination to find compatabile matches')]")).getText();
			assertEquals("Select denomination to find compatabile matches",denom, "Passed");
			
		} catch (Exception e) {
			
		}
		
		try {
			String div=driver.findElement(By.xpath("//label[contains(text(),'Select division to find compatible matches')]")).getText();
			assertEquals("Select division to find compatible matches",div, "Passed");
			
		} catch (Exception e) {
			
		}
		
		try {
			String sect=driver.findElement(By.xpath("//label[contains(text(),'Select division to find compatible matches')]")).getText();
			assertEquals("Select division to find compatible matches",sect, "Passed");
			
		} catch (Exception e) {
			
		}
		
//		try {
//			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select caste / division to find compatible matches')]")).getText();
//			assertEquals("Select caste / division to find compatible matches",casdiv, "Passed");
//			
//		} catch (Exception e) {
//			
//		}
		
		*/
//		Thread.sleep(4000);
//		BaseTest.click(rp.getContinuebutton());
//		WebElement profile1=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[2]/div[1]/legend/label/span"));
//		String b=profile1.getText();
//		System.out.println(b);
//	
//		Thread.sleep(4000);
//		
		 
		Thread.sleep(4000);
		BaseTest.click(rp.getProfilecreatedfor());
		
//
//		Thread.sleep(4000);
//		BaseTest.click(rp.getContinuebutton());
		
//		WebElement gender1=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[3]/div[1]/legend/label/span"));
//		String d=gender1.getText();
//		System.out.println(d);	
//		Thread.sleep(4000);
		
		
		Thread.sleep(4000);
		BaseTest.click(rp.getGender());
		
//		try {
//			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Enter the name of groom')]")).getText();
//			assertEquals("Enter the name of groom",casdiv, "Passed");
//			
//		} catch (Exception e) {
//			
//		}
//		
//
//		try {
//			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Enter the name of bride')]")).getText();
//			assertEquals("Enter the name of bride",casdiv, "Passed");
//			
//		} catch (Exception e) {
//			
//		}
//		
//		try {
//			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Date of birth of the groom')]")).getText();
//			assertEquals("Date of birth of the groom",casdiv, "Passed");
//			
//		} catch (Exception e) {
//			
//		}
//		
//		try {
//			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Date of birth of the bride')]")).getText();
//			assertEquals("Date of birth of the bride",casdiv, "Passed");
//			
//		} catch (Exception e) {
//			
//		}
//		
//		
//		
//		Thread.sleep(4000);
//		BaseTest.click(rp.getContinuebutton());
//		WebElement name1=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[4]/label"));
//		String c=name1.getText();
//		System.out.println(c);
//		
		
		
		
		Thread.sleep(4000);
		WebElement e1=driver.findElement(By.xpath("//*[@id='USERNAME1']"));
		Actions a1=new Actions(driver);
		Thread.sleep(4000);
		a1.sendKeys(e1,"@#$%^*(^$%").build().perform();
	   
//		Thread.sleep(4000);
//		BaseTest.click(rp.getContinuebutton());
         
//		Thread.sleep(4000);
//		WebElement e11=driver.findElement(By.xpath("//*[@id='USERNAME1']"));
//		Actions a11=new Actions(driver);
//		Thread.sleep(4000);
//		a11.sendKeys(e11,"12345678").build().perform();
	   

//		Thread.sleep(4000);
//		BaseTest.click(rp.getContinuebutton());
		
		Thread.sleep(4000);
		WebElement e111=driver.findElement(By.xpath("//*[@id='USERNAME1']"));
		Actions a111=new Actions(driver);
		Thread.sleep(4000);
		a111.sendKeys(e111,"Lalli").build().perform();
	   
		
		Thread.sleep(4000);
		BaseTest.click(rp.getDob());
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/span[1]")).click();
//		
//		Thread.sleep(4000);
//		BaseTest.click(rp.getContinuebutton());
//		
//		WebElement mal=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[6]/label"));
//		String g=mal.getText();
//		System.out.println(g);		
//		Thread.sleep(4000);
		
		
		
//		WebElement validmail=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
//		validmail.sendKeys("gihgjgog");
//		BaseTest.click(rp.getContinuebutton2());
//		WebElement mail23=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[6]/label"));
//		String m2=mail23.getText();
//		System.out.println(m2);	
//	
		
		
		Thread.sleep(4000);
		Actions acc1 = new Actions(driver);
		WebElement mail1=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
		acc1.doubleClick(mail1).perform();
		Thread.sleep(4000);
		WebElement mail=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
		mail.sendKeys("st"+ (Math.floor(Math.random() * 1478) + "@gmail.com"));
		
		
//		Thread.sleep(4000);
//		BaseTest.click(rp.getContinuebutton());
		
		
//	
//		WebElement password=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[7]/label"));
//		String g1=password.getText();
//		System.out.println(g1);		
//		Thread.sleep(4000);
	
		
		
		Thread.sleep(4000);
		WebElement pass=driver.findElement(By.xpath("//*[@id='PASSWORD']"));
		pass.sendKeys("cbst");
		
//		Thread.sleep(4000);
//		BaseTest.click(rp.getContinuebutton());
//		
//		WebElement passwordlen=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[7]/label"));
//		String h=passwordlen.getText();
//	    System.out.println(h);		
//		Thread.sleep(4000);
		
		
		
//		Thread.sleep(4000);
//		WebElement pass1=driver.findElement(By.xpath("//*[@id='PASSWORD']"));
//		pass1.clear();
//		pass1.sendKeys("123456789446");
//		
//		Thread.sleep(4000);
//		BaseTest.click(rp.getContinuebutton());
//		
//		WebElement passwordlen1=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[7]/label"));
//		String h1=passwordlen1.getText();
//	    System.out.println(h1);		
		
		
//		Thread.sleep(4000);
//		WebElement pass11=driver.findElement(By.xpath("//*[@id='PASSWORD']"));
//		pass11.clear();
//		pass11.sendKeys("1234567894467858456555");
//		
//		Thread.sleep(4000);
//		BaseTest.click(rp.getContinuebutton());
		
//		WebElement passwordlen11=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[7]/label"));
//		String h11=passwordlen11.getText();
//	    System.out.println(h11);		
//		Thread.sleep(4000);
//		BaseTest.getScreenshot(driver, "password character popup");
//		
		
		Thread.sleep(4000);
		WebElement pass111=driver.findElement(By.xpath("//*[@id='PASSWORD']"));
		pass111.clear();
		pass111.sendKeys("cbstest");
		
//		Thread.sleep(4000);
//		BaseTest.click(rp.getContinuebutton());
//		WebElement mobileno=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[6]/div[2]"));
//		String i=mobileno.getText();
//		System.out.println(i);		
//		Thread.sleep(4000);
//		BaseTest.getScreenshot(driver, "mobile number popup");
//		
		Thread.sleep(4000);	
		BaseTest.click(rp.getIsdcode());
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		Thread.sleep(4000);
		 BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 1)+"')]")));
		
			
			Thread.sleep(4000);
			WebElement mobile=driver.findElement(By.xpath("//*[@id='CONTACTNO']"));
			mobile.sendKeys("8015766715");
			Thread.sleep(4000);

//			BaseTest.click(rp.getContinuebutton());
//			WebElement mothertongue=driver.findElement(By.xpath("//*[@id='mothertongue_display']/fieldset/label"));
//			String m=mothertongue.getText();
//			System.out.println(m);	
		
			Thread.sleep(8000);
		   	JavascriptExecutor js411 = (JavascriptExecutor)driver;
		   	  WebElement edi234= driver.findElement(By.xpath("//*[@id='MOTHERTONGUE']"));
			  	  js411.executeScript("arguments[0].scrollIntoView(true);",edi234);
			Thread.sleep(6000);
			try {
				 BaseTest.click(rp.getMothertongue());
					driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			} catch (Exception e) {
				// TODO: handle exception
			}
		  
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 4)+"')]")));
			
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
			 Thread.sleep(8000);
			   	JavascriptExecutor js2 = (JavascriptExecutor)driver;
			   	  WebElement edi2= driver.findElement(By.xpath("//*[@id='continuebutton']"));
				  	  js2.executeScript("arguments[0].scrollIntoView(true);",edi2);
				  	BaseTest.click(rp.getContinuebutton());
			
//			WebElement religion=driver.findElement(By.xpath("//*[@id='religion_display']/fieldset/label"));
//			String k=religion.getText();
//			System.out.println(k);	
//			
			
			Thread.sleep(4000);
			BaseTest.click(rp.getReligion());
		
		
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 2)+"')]")));
	
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
			
			  Thread.sleep(8000);
			   	JavascriptExecutor js9 = (JavascriptExecutor)driver;
			   	  WebElement edi29= driver.findElement(By.xpath("//*[@id='continuebutton']"));
				  	  js9.executeScript("arguments[0].scrollIntoView(true);",edi29);
			 
//			BaseTest.click(rp.getContinuebutton());
//			WebElement subcaste=driver.findElement(By.xpath("//*[@id='subcaste_display']/fieldset/label"));
//			String l=subcaste.getText();
//			System.out.println(l);	
//			
		
			
			Thread.sleep(4000);
			try {
				BaseTest.click(rp.getSubcaste());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 3)+"')]")));
			} catch (Exception e) {
				//System.out.println("no element1");
			}
			Thread.sleep(4000);
			try {
				driver.findElement(By.xpath("(//*[@id='SUBCASTE'])[1]")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 3)+"')]")));
			} catch (Exception e) {
				//System.out.println("no element 2");
			}
			
			  Thread.sleep(8000);
			   	JavascriptExecutor js1 = (JavascriptExecutor)driver;
			   	  WebElement edi1= driver.findElement(By.xpath("//*[@id='continuebutton']"));
				  	  js1.executeScript("arguments[0].scrollIntoView(true);",edi1);
			 
			
			 
			BaseTest.click(rp.getContinuebutton());
			
			
			/////////page2////////////
			
//			WebElement createaccount1=driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
//			String a231=createaccount1.getText();
//			System.out.println(a231);
//			
//			
//			WebElement page2=driver.findElement(By.xpath("//div[@class='fl-rgt12 step-info']"));
//			String page=page2.getText();
//			System.out.println(page);
//			
//			try {
//				String marit=driver.findElement(By.xpath("//span[contains(text(),'Marital status of the bride')]")).getText();
//				assertEquals("Marital status of the bride",marit, "Passed");
//				
//			} catch (Exception e) {
//					
//			}
//			
//			try {
//				String marit=driver.findElement(By.xpath("//span[contains(text(),'Marital status of the groom')]")).getText();
//				assertEquals("Marital status of the groom",marit, "Passed");
//				
//			} catch (Exception e) {
//			
//			}
//			
//			try {
//				String count=driver.findElement(By.xpath("//label[contains(text(),'Country of residence of the bride')]")).getText();
//				assertEquals("Country of residence of the bride",count, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
//			try {
//				String count=driver.findElement(By.xpath("//label[contains(text(),'Country of residence of the groom')]")).getText();
//				assertEquals("Country of residence of the bride",count, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
//			
//			try {
//				String count=driver.findElement(By.xpath("(//label[contains(text(),'Residing state of the bride')])[2]")).getText();
//				assertEquals("Residing state of the bride",count, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
//			try {
//				String count=driver.findElement(By.xpath("(//label[contains(text(),'Residing state of the groom')])[2]")).getText();
//				assertEquals("Residing state of the groom",count, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
//			
//			try {
//				String count=driver.findElement(By.xpath("(//label[contains(text(),'Residing city of the bride')])[2]")).getText();
//				assertEquals("Residing city of the bride",count, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
//			try {
//				String count=driver.findElement(By.xpath("(//label[contains(text(),'Residing city of the groom')])[2]")).getText();
//				assertEquals("Residing city of the groom",count, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
			
//			try {
//				String count=driver.findElement(By.xpath("//label[contains(text(),'Citizenship of the bride')]")).getText();
//				assertEquals("Citizenship of the bride",count, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
//			try {
//				String count=driver.findElement(By.xpath("//label[contains(text(),'Citizenship of the groom')]")).getText();
//				assertEquals("Citizenship of the groom",count, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
//			
//			try {
//				String count=driver.findElement(By.xpath("//label[contains(text(),'Resident of the bride')]")).getText();
//				assertEquals("Resident of the bride",count, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
//			try {
//				String count=driver.findElement(By.xpath("//label[contains(text(),'Resident of the groom')]")).getText();
//				assertEquals("Resident of the groom",count, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
			
					
		//	BaseTest.click(rp.getContinuebutton2());
//			WebElement marital=driver.findElement(By.xpath("//div[@class='matritalerror error_display']"));
//			String n=marital.getText();
//			System.out.println(n);	
		
			
			Thread.sleep(4000);
			BaseTest.click(rp.getMaritalstatusdivorced());
			
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
			//BaseTest.click(rp.getContinuebutton2());
			
//			WebElement maritalnoofchild=driver.findElement(By.xpath("//*[@id='no_child_section']/fieldset/label"));
//			String m1=maritalnoofchild.getText();
//			System.out.println(m1);		
//		
			Thread.sleep(4000);
			BaseTest.click(rp.getNoofchild());
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[3]")).click();
			
			
			
			
//			
//			BaseTest.click(rp.getContinuebutton2());
//			WebElement childlivingwith=driver.findElement(By.xpath("//*[@id='child_living_section']/fieldset/label"));
//			String m11=childlivingwith.getText();
//			System.out.println(m11);	
			
//			Thread.sleep(4000);
//			BaseTest.click(rp.getChildlivingwith());
//			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[1]")).click();
			
			
			
			
//		
//			BaseTest.click(rp.getContinuebutton2());
//			WebElement countr=driver.findElement(By.xpath("//*[@id='CBSRegistration2']/fieldset[3]/label"));
//			String o1=countr.getText();
//			System.out.println(o1);	
//		
			Thread.sleep(4000);
		
			try {
				driver.findElement(By.xpath("//*[@id='COUNTRYLIVING']")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 5)+"')]")));
				
			} catch (Exception e) {
				//System.out.println("no element");
			}
			
//			Thread.sleep(6000);
//			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[1]")).click();
			
//			Thread.sleep(6000);
//			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
//			        Thread.sleep(4000);
//				  	BaseTest.click(rp.getContinuebutton2());	
//				  	
//				  	Thread.sleep(4000);
//					WebElement residing=driver.findElement(By.xpath("//*[@id='StateSelectDisplay']/fieldset/label"));
//					String o=residing.getText();
//					System.out.println(o);	
					
					
			
			
		try {		
			Thread.sleep(4000);

			BaseTest.click(rp.getResidingstate());
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 6)+"')]")));
		} catch (Exception e) {
			//System.out.println("no exception");
		}
		
			
			try {
				Thread.sleep(4000);
				WebElement ref=driver.findElement(By.xpath("//*[@id='RESIDINGSTATETXT']"));
				ref.sendKeys(BaseTest.getExcelData("Sheet3", 1, 6));
			} catch (Exception e) {
				//System.out.println("no exceptions");
			}
			
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[1]")).click();
		
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
			
//			
//			 Thread.sleep(8000);
//			   	JavascriptExecutor js4 = (JavascriptExecutor)driver;
//			   	  WebElement edi4= driver.findElement(By.xpath("//*[@id='home-footer']/div[1]"));
//				  	  js4.executeScript("arguments[0].scrollIntoView(true);",edi4);
//			BaseTest.click(rp.getContinuebutton2());
//			WebElement residingcity=driver.findElement(By.xpath("//*[@id='CitySelectBox']/fieldset/label"));
//			String p=residingcity.getText();
//			System.out.println(p);	
			

			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getResidingcity());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 7)+"')]")));
				
			} catch (Exception e) {
				//System.out.println("no exception");
			}
			
			try {	
				Thread.sleep(4000);
				WebElement ref1=driver.findElement(By.xpath("//*[@id='RESIDINGCITYTEXT']"));
				ref1.sendKeys(BaseTest.getExcelData("Sheet3", 1, 7));
				
			} catch (Exception e) {
			//	System.out.println("no exception");
			}
			
			//citizenship
			
			try {
				Thread.sleep(4000);

				BaseTest.click(rp.getCitizenship());
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 8)+"')]")));
			} catch (Exception e) {
				///System.out.println("no exception");
			}
			//residing status
			try {
				 Thread.sleep(8000);
				   	JavascriptExecutor js41 = (JavascriptExecutor)driver;
				   	  WebElement edi41= driver.findElement(By.xpath("//*[@id='home-footer']/div[1]"));
					  	  js41.executeScript("arguments[0].scrollIntoView(true);",edi41);
				BaseTest.click(rp.getContinuebutton2());
//				WebElement residingcity1=driver.findElement(By.xpath("//*[@id='Resident_status']/fieldset/div[2]"));
//				String p1=residingcity1.getText();
//				System.out.println(p1);	
//				
			} catch (Exception e) {
				//System.out.println("no residing status");
			}
			
			try {
				Thread.sleep(4000);

				BaseTest.click(rp.getResidingstatus());
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 9)+"')]")));
			} catch (Exception e) {
				//System.out.println("no exception");
			}
			
			 Thread.sleep(8000);
			   	JavascriptExecutor js5 = (JavascriptExecutor)driver;
			   	  WebElement edi5= driver.findElement(By.xpath("//*[@id='home-footer']/div[1]"));
				  	  js5.executeScript("arguments[0].scrollIntoView(true);",edi5);
		
			
			////////////page3///////////
				  	  
//		    Thread.sleep(4000);
//			driver.findElement(By.xpath("/html/body/div[4]/div[3]/span[2]")).click();	  	  
//				  	  
				  	  
//			Thread.sleep(8000);
//		   	JavascriptExecutor js6 = (JavascriptExecutor)driver;
//		   	  WebElement edi6= driver.findElement(By.xpath("//*[@id='continuebutton']"));
//			  	  js6.executeScript("arguments[0].scrollIntoView(true);",edi6);
//			  	  Thread.sleep(4000);
//		BaseTest.click(rp.getContinuebutton3());	
//		
//		 Thread.sleep(4000);
//			driver.findElement(By.xpath("/html/body/div[4]/div[3]/span[2]")).click();	  	  
//			
//			WebElement createaccount11=driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
//			String a2311=createaccount11.getText();
//			System.out.println(a2311);
//			
//			
//			WebElement step3=driver.findElement(By.xpath("//div[@class='fl-rgt12 step-info']"));
//			String b123=step3.getText();
//			System.out.println(b123);
			
			
//			try {
//				String hieg=driver.findElement(By.xpath("//label[contains(text(),'Height of the bride')]")).getText();
//				assertEquals("Height of the bride",hieg, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
//			
			
				
			//div[@class='fl-rgt12 step-info']
			
			
//
//			try {
//				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Height of the groom')]")).getText();
//				assertEquals("Height of the groom",casdiv, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
//			
//			try {
//				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Highest educational degree of the bride')]")).getText();
//				assertEquals("Highest educational degree of the bride",casdiv, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
//			
//			try {
//				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Highest educational degree of the groom')]")).getText();
//				assertEquals("Highest educational degree of the groom",casdiv, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
//			try {
//				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Work industry of the bride')]")).getText();
//				assertEquals("Work industry of the bride",casdiv, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
//			
//			try {
//				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Work industry of the groom')]")).getText();
//				assertEquals("Work industry of the groom",casdiv, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
//			
//			
//			WebElement height=driver.findElement(By.xpath("//*[@id='CBSRegistration3']/fieldset[1]/label"));
//			String q=height.getText();
//			System.out.println(q);	
//		
					Thread.sleep(4000);
			BaseTest.click(rp.getHeight());
			Thread.sleep(5000);
	        List<WebElement> heigt = driver.findElements(By.xpath("//div[@class='dww dwrc']//ul//li"));
	        int z = heigt.size();
	        //System.out.println(a);

	        for (int x = 0; x <=22; x++) {

	        //    heigt.get(i).sendKeys("4 ft 2 in / 127 cm");
    Actions mn= new Actions(driver);
	mn.moveToElement(heigt.get(x)).click().build().perform();
	                Thread.sleep(1000);
	           /*    actions.click();
	        //      actions.sendKeys(" ");
	                actions.build().perform();*/

	        } 
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div[4]/div[3]/span[1]")).click();
			
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
			
//			Thread.sleep(4000);
//			JavascriptExecutor js12 = (JavascriptExecutor)driver;
//		   	  WebElement edi12= driver.findElement(By.xpath("//*[@id='continuebutton']"));
//			  	  js12.executeScript("arguments[0].scrollIntoView(true);",edi12);	
//			  	  Thread.sleep(4000);
//			BaseTest.click(rp.getContinuebutton3());
//			WebElement education=driver.findElement(By.xpath("//*[@id='CBSRegistration3']/fieldset[2]/label"));
//			String s=education.getText();
//			System.out.println(s);	
		
			Thread.sleep(4000);
			BaseTest.click(rp.getEducation());
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 10)+"')]")));
			
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
//			
//			Thread.sleep(4000);
//			JavascriptExecutor js13 = (JavascriptExecutor)driver;
//		   	  WebElement edi13= driver.findElement(By.xpath("//*[@id='continuebutton']"));
//			  	  js13.executeScript("arguments[0].scrollIntoView(true);",edi13);
//			BaseTest.click(rp.getContinuebutton3());
//			WebElement employedin=driver.findElement(By.xpath("//*[@id='CBSRegistration3']/fieldset[3]/label"));
//			String t=employedin.getText();
//			System.out.println(t);	
			
			Thread.sleep(4000);
				
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getEmployedin());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 11)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no exception");
			}
			
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
//			try {
//				String hieg=driver.findElement(By.xpath("//label[contains(text(),'Occupation of the bride')]")).getText();
//				assertEquals("Occupation of the bride",hieg, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
//			
//
//			try {
//				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Occupation of the groom')]")).getText();
//				assertEquals("Occupation of the groom",casdiv, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
//			
//			try {
//				String hieg=driver.findElement(By.xpath("//label[contains(text(),'Income of the bride')]")).getText();
//				assertEquals("Income of the bride",hieg, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
//			
//
//			try {
//				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Income of the groom')]")).getText();
//				assertEquals("Income of the groom",casdiv, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
//Thread.sleep(4000);
//			BaseTest.click(rp.getContinuebutton3());
//			WebElement occupation=driver.findElement(By.xpath("//*[@id='fieldOccupation']/label"));
//			String u=occupation.getText();
//			System.out.println(u);	
//		
			
				Thread.sleep(4000);
				BaseTest.click(rp.getOccupation());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 12)+"')]")));
				
//			} catch (Exception e) {
//				System.out.println("no exception");
//			}
			
			
//			WebElement rs=driver.findElement(By.xpath("//*[@id='fieldCurrencyType']/div[2]"));
//			String w=rs.getText();
//			System.out.println(w);	
//			BaseTest.getScreenshot(driver, "rs popup");
//			
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
//			Thread.sleep(4000);
//			JavascriptExecutor js22 = (JavascriptExecutor)driver;
//		   	  WebElement edi22= driver.findElement(By.xpath("//*[@id='continuebutton']"));
//		   	js22.executeScript("arguments[0].scrollIntoView(true);",edi22);
//			BaseTest.click(rp.getContinuebutton3());
//			
			
			try {
//				Thread.sleep(4000);
//				BaseTest.click(rp.getRs());
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 13)+"')]")));
				
				
//				
//				Thread.sleep(4000);
//				WebElement ref=driver.findElement(By.xpath("//*[@id='fieldCurrencyType']/label"));
//				String abc=ref.getText();
//				System.out.println(abc);
	
				
				
				Thread.sleep(4000);
				BaseTest.click(rp.getIncome());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 14)+"')]")));
					

			} catch (Exception e) {
				//System.out.println("no exception");
			}
			
			Thread.sleep(4000);
//			JavascriptExecutor js221 = (JavascriptExecutor)driver;
//		   	  WebElement edi221= driver.findElement(By.xpath("//*[@id='continuebutton']"));
//		   	js221.executeScript("arguments[0].scrollIntoView(true);",edi221);
//			BaseTest.click(rp.getContinuebutton3());
//			WebElement physicalstatus=driver.findElement(By.xpath("//*[@id='CBSRegistration3']/fieldset[7]/div[1]/legend/label/span"));
//			String y2=physicalstatus.getText();
//			System.out.println(y2);	
		
			
		Thread.sleep(4000);
		BaseTest.click(rp.getPhysicalstatus());
			
			
			
			
//			try {
//			
//				Thread.sleep(4000);
//				BaseTest.click(rp.getRs());
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 15)+"')]")));
//				
//			} catch (Exception e) {
//				System.out.println("no exceptions");
//			}
//			try {
//
//				Thread.sleep(4000);
//				WebElement ref1=driver.findElement(By.xpath("//input[@placeholder='Enter Salary']"));
//				Thread.sleep(4000);
//				ref1.sendKeys("54545");
//				
//			
//			} catch (Exception e) {
//				System.out.println("no exception");
//			}
			
//			Thread.sleep(4000);
//			JavascriptExecutor js20 = (JavascriptExecutor)driver;
//		   	  WebElement edi20= driver.findElement(By.xpath("//*[@id='continuebutton']"));
//		   	js20.executeScript("arguments[0].scrollIntoView(true);",edi20);
//			BaseTest.click(rp.getContinuebutton3());
				
//			Thread.sleep(4000);
//			WebElement ref=driver.findElement(By.xpath("//*[@id='INCOMETEXTVALUES']"));
//			String abc=ref.getText();
//			System.out.println(abc);
//			BaseTest.getScreenshot(driver, "Rs permonth popup");
//			Thread.sleep(4000);
//			JavascriptExecutor js201 = (JavascriptExecutor)driver;
//		   	  WebElement edi201= driver.findElement(By.xpath("//*[@id='continuebutton']"));
//		   	js201.executeScript("arguments[0].scrollIntoView(true);",edi201);
//			BaseTest.click(rp.getContinuebutton3());
//			WebElement familystatus=driver.findElement(By.xpath("//*[@id='CBSRegistration3']/fieldset[8]/div[1]/legend/label/span"));
//			String x=familystatus.getText();
//			System.out.println(x);	
			
			Thread.sleep(4000);
			BaseTest.click(rp.getFamilystatus());
			
//			Thread.sleep(4000);
//			JavascriptExecutor js21 = (JavascriptExecutor)driver;
//		   	  WebElement edi21= driver.findElement(By.xpath("//*[@id='continuebutton']"));
//		   	js21.executeScript("arguments[0].scrollIntoView(true);",edi21);
//			BaseTest.click(rp.getContinuebutton3());
//			
//			WebElement familytype=driver.findElement(By.xpath("//*[@id='CBSRegistration3']/fieldset[9]/div[1]/legend/label/span"));
//			String y=familytype.getText();
//			System.out.println(y);	
			
			Thread.sleep(4000);
			BaseTest.click(rp.getFamilytype());
			
		
			
			
//			Thread.sleep(4000);
//			JavascriptExecutor js23 = (JavascriptExecutor)driver;
//		   	  WebElement edi23= driver.findElement(By.xpath("//*[@id='continuebutton']"));
//		   	js23.executeScript("arguments[0].scrollIntoView(true);",edi23);
//		   	
		   	///muslim matri
		   	
		   	try {
				Thread.sleep(4000);
				BaseTest.click(rp.getEthinicity());
				
				Thread.sleep(4000);
				Actions acc921 = new Actions(driver);
				WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
				acc921.doubleClick(ma41).perform();

				Thread.sleep(6000);
				
				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 16)+"')]")));
				
			} catch (Exception e2) {
				//System.out.println("no ethinicity");
			}

			try {
				Thread.sleep(4000);
			    BaseTest.click(rp.getReligiousvalue());
				
				Thread.sleep(4000);
				Actions acc921 = new Actions(driver);
				WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
				acc921.doubleClick(ma41).perform();
				
				Thread.sleep(6000);
				
				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 17)+"')]")));
				
			} catch (Exception e2) {
				//System.out.println("no religiousvalue");
			}
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getDressofmodestry());
			} catch (Exception e2) {
				//System.out.println("no dress of modestry");
			}
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getReadquran());
			} catch (Exception e2) {
				//System.out.println("no Read quran");
			}
			
//			try {
//				Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='GOTHRAM']")).click();
//			Thread.sleep(4000);
//			Actions acc921 = new Actions(driver);
//			WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//			acc921.doubleClick(ma41).perform();
//			
//			Thread.sleep(6000);
//			
//			  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 12)+"')]")));
//			
//				
//			} catch (Exception e2) {
//				System.out.println("no gothram");
//			}
			//////muslim matri/////////
		   	
//		   	try {
//		   
//		   		Thread.sleep(4000);
//				JavascriptExecutor js231 = (JavascriptExecutor)driver;
//			   	  WebElement edi231= driver.findElement(By.id("ABOUTME"));
//			   	js231.executeScript("arguments[0].scrollIntoView(true);",edi231);
//			   	
////		   		Thread.sleep(4000);
////			   	WebElement aboutme=driver.findElement(By.id("ABOUTME"));
////				String y21 = aboutme.getText();
////			System.out.println(y21);
////				
////				System.out.println(y21);
//			} catch (Exception e) {
//				//System.out.println("no element1");
//			}
//		   		
//			try {
//				Thread.sleep(4000);
//				JavascriptExecutor js231 = (JavascriptExecutor)driver;
//			   	  WebElement edi231= driver.findElement(By.xpath("//*[@id='fieldabtme']/div[2]"));
//			   	js231.executeScript("arguments[0].scrollIntoView(true);",edi231);
//			   	
//		   		Thread.sleep(4000);
//			   	WebElement aboutme=driver.findElement(By.xpath("//*[@id='fieldabtme']/div[2]"));
//				//String y21=aboutme.getText();
//				//System.out.println(y21);
//			} catch (Exception e) {
//				//System.out.println("no element2");
//			}
//			
//		 	try {
//		 		Thread.sleep(4000);
//				JavascriptExecutor js231 = (JavascriptExecutor)driver;
//			   	  WebElement edi231= driver.findElement(By.xpath("//*[@id='fieldabtme']"));
//			   	js231.executeScript("arguments[0].scrollIntoView(true);",edi231);
//			   	
////		   		Thread.sleep(4000);
////			   	WebElement aboutme=driver.findElement(By.xpath("//*[@id='fieldabtme']"));
////				String y21=aboutme.getText();
////				System.out.println(y21);
//			} catch (Exception e) {
//				//System.out.println("no element3");
//			}
			
			Thread.sleep(4000);
			BaseTest.click(rp.getContinuebutton3());
			
			Thread.sleep(15000);
			
			
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

         
		//pi informations
          
          Thread.sleep(4000);
          WebElement marital2=driver.findElement(By.xpath("//*[@id='editpi-pwa']/div[3]/div[2]/ul/li[1]/div[2]"));
          String partner=marital2.getText();
          System.out.println("marital status :"+partner);

          try {
                  Thread.sleep(4000);
                  WebElement havechild=driver.findElement(By.xpath("//*[@id='editpi-pwa']/div[3]/div[2]/ul/li[2]/div[2]"));
                  String child=havechild.getText();
                  System.out.println("have children :"+child);

        } catch (Exception e2) {
                System.out.println("no child");
        }

          Thread.sleep(4000);
          WebElement age=driver.findElement(By.xpath("//*[@id='editpi-pwa']/div[3]/div[2]/ul/li[3]/div[2]"));
          String ppa=age.getText();
          System.out.println("Age in pi:"+ppa);
          String[] split=ppa.split(" - 35 Yrs");

          String[] split1=ppa.split(" - ");

          String[] split2=split1[1].split(" Yrs");

          String ppage=(split[0]+"-"+split2[0]);
          System.out.println("final pi age:"+ppage);

          Thread.sleep(4000);
          WebElement height1=driver.findElement(By.xpath("//*[@id='editpi-pwa']/div[3]/div[2]/ul/li[4]/div[2]"));
          String ppheight=height1.getText();
          System.out.println("Height in pi :"+ppheight);

          Thread.sleep(4000);
          WebElement mother=driver.findElement(By.xpath("//*[@id='editpi-pwa']/div[3]/div[2]/ul/li[5]/div[2]/span"));
          String tongue=mother.getText();
          System.out.println("mother tongue in pi :"+tongue);



                  Thread.sleep(4000);
                  WebElement caste5=driver.findElement(By.xpath("//*[@id='editpi-pwa']/div[4]/div[2]/ul/li[1]/div[2]"));
                  String subcaste1=caste5.getText();
                  System.out.println("subcaste in pi :"+subcaste1);





          Thread.sleep(4000);
          WebElement dosham=driver.findElement(By.xpath("//*[@id='editpi-pwa']/div[4]/div[2]/ul/li[2]/div[2]"));
          String doshampp=dosham.getText();
          System.out.println("Gotharam in pi :"+doshampp);

          Thread.sleep(4000);
          WebElement star5=driver.findElement(By.xpath("//*[@id='editpi-pwa']/div[4]/div[2]/ul/li[3]/div[2]"));
          String starpp=star5.getText();
          System.out.println("Dosham in pi :"+starpp);


          Thread.sleep(4000);
          WebElement edu=driver.findElement(By.xpath("//*[@id='editpi-pwa']/div[5]/div[2]/ul/li[1]/div[2]"));
          String edupp=edu.getText();
          System.out.println("education in pi :"+edupp);


          Thread.sleep(4000);
          WebElement occ=driver.findElement(By.xpath("//*[@id='editpi-pwa']/div[5]/div[2]/ul/li[2]/div[2]"));
          String occpp=occ.getText();
          System.out.println("occupation in pi :"+occpp);


          Thread.sleep(4000);
          WebElement income=driver.findElement(By.xpath("//*[@id='editpi-pwa']/div[5]/div[2]/ul/li[3]/div[2]"));
          String incomepp=income.getText();
          System.out.println("income in pi :"+incomepp);


          Thread.sleep(4000);
          WebElement country=driver.findElement(By.xpath("(//div[contains(text(),'Country')]//following::div[1])[2]"));
          String countryp=country.getText();
//          System.out.println("country in pp :"+countryp);
//          String[] coun1=countryp.split(",");
  //
//          String countrypp=(coun1[0]+coun1[1]+coun1[2]+coun1[3]);
          System.out.println("finalcountry in pi:"+countryp);



//          Thread.sleep(4000);
//          WebElement state1=driver.findElement(By.xpath("(//div[contains(text(),'State')]//following::div[1])[3]"));
//          String statepp=state1.getText();
//          System.out.println("state in pp :"+statepp);
  //
  //
  //
//          Thread.sleep(4000);
//          WebElement city1=driver.findElement(By.xpath("(//div[contains(text(),'City')]//following::div[1])"));
//          String cityp=city1.getText();
//          System.out.println("city in pp :"+cityp);
//          String[] coun2=cityp.split(",");
  //
//          String citypp=(coun2[0]+coun2[1]);
//          System.out.println("final city in pp:"+citypp);



          Thread.sleep(4000);
          WebElement citizenship1=driver.findElement(By.xpath("(//div[contains(text(),'Citizenship')]//following::div[1])[2]"));
          String citizenship1pp=citizenship1.getText();
          System.out.println("citizenship in pi :"+citizenship1pp);
  
          
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
	
	
	
	
	
	
	
	
}           