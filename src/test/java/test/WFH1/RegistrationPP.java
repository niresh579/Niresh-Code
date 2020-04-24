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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Base.BaseTest;


public class RegistrationPP extends BaseTest{
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
		driver.get("https://mstage.communitymatrimony.com/");
		Thread.sleep(4000);	
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		
		Thread.sleep(4000);
		BaseTest.click(rp.getCommunity());
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		Thread.sleep(4000);
		 BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 0)+"')]")));
		
//			Thread.sleep(4000);
//			WebElement denom=driver.findElement(By.xpath("//*[@id='COMMUNITY']"));
//
//				 Select dropdown = new Select(denom);

//				    //Get all options
//				    List<WebElement> dd = dropdown.getOptions();
//
//				    //Get the length
//				    System.out.println(dd.size());
//			
//				    for (int j = 0; j < dd.size(); j++) {
//				        System.out.println(dd.get(j).getText());
//
//				    }
	
		Thread.sleep(4000);
		BaseTest.click(rp.getProfilecreatedfor());
		

		
		Thread.sleep(4000);
		BaseTest.click(rp.getGender());
		
		
		
		
		Thread.sleep(4000);
		WebElement e1=driver.findElement(By.xpath("//*[@id='USERNAME1']"));
		Actions a1=new Actions(driver);
		Thread.sleep(4000);
		a1.sendKeys(e1,"@#$%^*(^$%").build().perform();
	   

		
		Thread.sleep(4000);
		WebElement e111=driver.findElement(By.xpath("//*[@id='USERNAME1']"));
		Actions a111=new Actions(driver);
		Thread.sleep(4000);
		a111.sendKeys(e111,"Lalli").build().perform();
	   
		
		Thread.sleep(4000);
		BaseTest.click(rp.getDob());
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/span[1]")).click();

		

		
		
		Thread.sleep(4000);
		Actions acc1 = new Actions(driver);
		WebElement mail1=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
		acc1.doubleClick(mail1).perform();
		Thread.sleep(4000);
		WebElement mail=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
		mail.sendKeys("st"+ (Math.floor(Math.random() * 1478) + "@gmail.com"));
		
		

	
		
		
		Thread.sleep(4000);
		WebElement pass=driver.findElement(By.xpath("//*[@id='PASSWORD']"));
		pass.sendKeys("cbst");

		
		Thread.sleep(4000);
		WebElement pass111=driver.findElement(By.xpath("//*[@id='PASSWORD']"));
		pass111.clear();
		pass111.sendKeys("cbstest");
		

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
		  
			Thread.sleep(4000);
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 4)+"')]")));
			
			
			

			
//			Thread.sleep(4000);
//			BaseTest.click(rp.getReligion());
//		
//		
// 		Thread.sleep(4000);
// 		 driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			Thread.sleep(4000);	  	
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 2)+"')]")));
	
//			Thread.sleep(6000);
//			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
//			
			
//			  Thread.sleep(8000);
//			   	JavascriptExecutor js9 = (JavascriptExecutor)driver;
//			   	  WebElement edi29= driver.findElement(By.xpath("//*[@id='continuebutton']"));
//				  	  js9.executeScript("arguments[0].scrollIntoView(true);",edi29);
//			 

		
			
				Thread.sleep(4000);
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 3)+"')]")));
			
//				Thread.sleep(4000);
//			WebElement denom=driver.findElement(By.xpath("//*[@id='DENOMINATION']"));
//
//				 Select dropdown = new Select(denom);
//
//				    //Get all options
//				    List<WebElement> dd = dropdown.getOptions();
//
//				    //Get the length
//				    System.out.println(dd.size());
			
			 Thread.sleep(4000);
			BaseTest.click(rp.getContinuebutton());
			
			
			/////////page2////////////
			

		
			//marital status
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='reg_martial_block']/div[2]/div/div[1]/label")).click();
			
			

			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getNoofchild());
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id='list_view_detail']/li[3]")).click();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
			
//			
//			BaseTest.click(rp.getContinuebutton2());
//			WebElement childlivingwith=driver.findElement(By.xpath("//*[@id='child_living_section']/fieldset/label"));
//			String m11=childlivingwith.getText();
//			System.out.println(m11);	
			
//			Thread.sleep(4000);
//			BaseTest.click(rp.getChildlivingwith());
//			
			
				
					

			Thread.sleep(4000);
		    BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 5)+"')]")));
		
					
			//STATE
			
	      Thread.sleep(4000);
		   BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 6)+"')]")));
		
		
			
			//city
                 Thread.sleep(4000);
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 7)+"')]")));
				
			
			
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
		
			
		
//		
					Thread.sleep(4000);
			//BaseTest.click(rp.getHeight());
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
			
		
			

		
			Thread.sleep(4000);
			//BaseTest.click(rp.getEducation());
			//driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 10)+"')]")));
			

			//employed in
			Thread.sleep(4000);	
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 11)+"')]")));

			//occupation
			    Thread.sleep(4000); 
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 12)+"')]")));
				



				
				//income
				Thread.sleep(4000);
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 14)+"')]")));
					

			
	
		
			
		Thread.sleep(4000);
		BaseTest.click(rp.getPhysicalstatus());
			
			
			
			

			
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
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[1]")).click();
		
			
			

		   	///muslim matri
		   	
//		   	try {
//				Thread.sleep(4000);
//				BaseTest.click(rp.getEthinicity());
//				
//				Thread.sleep(4000);
//				Actions acc921 = new Actions(driver);
//				WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//				acc921.doubleClick(ma41).perform();
//
//				Thread.sleep(6000);
//				
//				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 16)+"')]")));
//				
//			} catch (Exception e2) {
//				//System.out.println("no ethinicity");
//			}
//
//			try {
//				Thread.sleep(4000);
//			    BaseTest.click(rp.getReligiousvalue());
//				
//				Thread.sleep(4000);
//				Actions acc921 = new Actions(driver);
//				WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//				acc921.doubleClick(ma41).perform();
//				
//				Thread.sleep(6000);
//				
//				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 17)+"')]")));
//				
//			} catch (Exception e2) {
//				//System.out.println("no religiousvalue");
//			}
//			
//			try {
//				Thread.sleep(4000);
//				BaseTest.click(rp.getDressofmodestry());
//			} catch (Exception e2) {
//				//System.out.println("no dress of modestry");
//			}
//			
//			try {
//				Thread.sleep(4000);
//				BaseTest.click(rp.getReadquran());
//			} catch (Exception e2) {
//				//System.out.println("no Read quran");
//			}
//			
////			try {
////				Thread.sleep(4000);
////			driver.findElement(By.xpath("//*[@id='GOTHRAM']")).click();
////			Thread.sleep(4000);
////			Actions acc921 = new Actions(driver);
////			WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
////			acc921.doubleClick(ma41).perform();
////			
////			Thread.sleep(6000);
////			
////			  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 12)+"')]")));
////			
////				
////			} catch (Exception e2) {
////				System.out.println("no gothram");
////			}
//			//////muslim matri/////////
//		   	
////		   	try {
////		   
////		   		Thread.sleep(4000);
////				JavascriptExecutor js231 = (JavascriptExecutor)driver;
////			   	  WebElement edi231= driver.findElement(By.id("ABOUTME"));
////			   	js231.executeScript("arguments[0].scrollIntoView(true);",edi231);
////			   	
//////		   		Thread.sleep(4000);
//////			   	WebElement aboutme=driver.findElement(By.id("ABOUTME"));
//////				String y21 = aboutme.getText();
//////			System.out.println(y21);
//////				
//////				System.out.println(y21);
////			} catch (Exception e) {
////				//System.out.println("no element1");
////			}
////		   		
////			try {
////				Thread.sleep(4000);
////				JavascriptExecutor js231 = (JavascriptExecutor)driver;
////			   	  WebElement edi231= driver.findElement(By.xpath("//*[@id='fieldabtme']/div[2]"));
////			   	js231.executeScript("arguments[0].scrollIntoView(true);",edi231);
////			   	
////		   		Thread.sleep(4000);
////			   	WebElement aboutme=driver.findElement(By.xpath("//*[@id='fieldabtme']/div[2]"));
////				//String y21=aboutme.getText();
////				//System.out.println(y21);
////			} catch (Exception e) {
////				//System.out.println("no element2");
////			}
////			
////		 	try {
////		 		Thread.sleep(4000);
////				JavascriptExecutor js231 = (JavascriptExecutor)driver;
////			   	  WebElement edi231= driver.findElement(By.xpath("//*[@id='fieldabtme']"));
////			   	js231.executeScript("arguments[0].scrollIntoView(true);",edi231);
////			   	
//////		   		Thread.sleep(4000);
//////			   	WebElement aboutme=driver.findElement(By.xpath("//*[@id='fieldabtme']"));
//////				String y21=aboutme.getText();
//////				System.out.println(y21);
////			} catch (Exception e) {
////				//System.out.println("no element3");
////			}
//			
			Thread.sleep(4000);
			BaseTest.click(rp.getContinuebutton3());
			
			Thread.sleep(15000);
			
			
			Thread.sleep(4000);
			driver.get("https://mobilestage.christianmatrimony.com/#/dashboard");
			
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

         
		//pp informations
          

  		
 		 Thread.sleep(4000);
 		  WebElement marital2=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[1]/div[2]"));
 		  String partner=marital2.getText();
 		  System.out.println("Marital Status = "+partner);
 		  
// 		  try {
// 			  Thread.sleep(4000);
// 			  WebElement havechild=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[2]/div[2]"));
// 			  String child=havechild.getText();
// 			  System.out.println("Have children :"+child);
// 			  
// 		} catch (Exception e2) {
// 			System.out.println("no child");
// 		}
 		  
 		  Thread.sleep(4000);
 		  WebElement age=driver.findElement(By.xpath("(//div[contains(text(),'Age')]//following::div[1])[2]"));
 		  String ppa=age.getText();
 		  System.out.println("Age = "+ppa);
 		  String[] split=ppa.split(" - ");
 		// System.out.println("startage:"+split[0]);
 		 int ppstartage=Integer.parseInt(split[0]);
 	  String[] split1=ppa.split(" - ");
 		  String[] split2=split1[1].split(" Yrs");
 		  //System.out.println("endage:"+split2[0]);
 		  int ppendage=Integer.parseInt(split2[0]);
 		  String ppage=(split[0]+"-"+split2[0]);
 		  //System.out.println("final pp age:"+ppage);
 		  
 		  Thread.sleep(4000);
 		  WebElement height=driver.findElement(By.xpath("(//div[contains(text(),'Height')]//following::div[1])[2]"));
 		  String ppheight=height.getText();
 		  System.out.println("Height = "+ppheight);
 		  
 		  Thread.sleep(4000);
 		  WebElement mother=driver.findElement(By.xpath("(//div[contains(text(),'Mother Tongue')]//following::div[1])[2]"));
 		  String tongue=mother.getText();
 		  System.out.println("Mother Tongue = "+tongue);

 		  Thread.sleep(4000);
 		  WebElement physical=driver.findElement(By.xpath("//div[contains(text(),'Physical Status')]//following::div[1]"));
 		  String physicalstatus=physical.getText();
 		  System.out.println("PhysicalStatus = "+physicalstatus);

 		  Thread.sleep(4000);
 		  WebElement eating=driver.findElement(By.xpath("//div[contains(text(),'Eating Habits')]//following::div[1]"));
 		  String eatinghabits=eating.getText();
 		  System.out.println("EatingHabits = "+eatinghabits);

 		  Thread.sleep(4000);
 		  WebElement drinking=driver.findElement(By.xpath("//div[contains(text(),'Drinking Habits')]//following::div[1]"));
 		  String drinkinghabits=drinking.getText();
 		  System.out.println("DrinkingHabits = "+drinkinghabits);

 		  Thread.sleep(4000);
 		  WebElement smoking=driver.findElement(By.xpath("//div[contains(text(),'Smoking Habits')]//following::div[1]"));
 		  String smokinghabits=smoking.getText();
 		  System.out.println("SmokingHabits = "+smokinghabits);

 		  
 		  try {
 			  Thread.sleep(4000);
 			  WebElement rel=driver.findElement(By.xpath("(//div[contains(text(),'Denomination')]//following::div[1])[2]"));
 			  String denomination=rel.getText();
 			  System.out.println("Denomination = "+denomination);

 		} catch (Exception e2) {
 			
 		}
 		  
 		  
 		  try {
 			  Thread.sleep(4000);
 			  WebElement rel=driver.findElement(By.xpath("(//div[contains(text(),'Division')]//following::div[1])[2]"));
 			  String division=rel.getText();
 			  System.out.println("Division = "+division);

 		} catch (Exception e2) {
 			
 		}
 		  
 		  
 		  try {
 			  Thread.sleep(4000);
 			  WebElement rel=driver.findElement(By.xpath("(//div[contains(text(),'Religion')]//following::div[1])[2]"));
 			  String religion=rel.getText();
 			  System.out.println("Religion = "+religion);

 		} catch (Exception e2) {
 			
 		}
 		  
 		  
 		  
// 		  try {
// 			  Thread.sleep(4000);
// 			  WebElement rel=driver.findElement(By.xpath("(//div[contains(text(),'Sect')]//following::div[1])[1]"));
// 			  String religion=rel.getText();
// 			  System.out.println("Religion :"+religion);
 //
// 		} catch (Exception e2) {
// 			
// 		}
 		  
 		  
 		  
 		  
 		 
 		  try {
 			  Thread.sleep(4000);
 			  WebElement sub=driver.findElement(By.xpath("//div[contains(text(),'Subcaste')]//following::div[1]"));
 			  String subcaste=sub.getText();
 			  
 			  System.out.println("Subcaste = "+subcaste);

 		} catch (Exception e2) {
 			
 		}
 		  
 		  try {
 			  Thread.sleep(4000);
 			  WebElement dosh=driver.findElement(By.xpath("(//div[contains(text(),'Dosham')]//following::div[1])[2]"));
 			  String dosham=dosh.getText();
 			  System.out.println("Dosham = "+dosham);
 		} catch (Exception e2) {
 			
 		}
 		  
// try {
// 	Thread.sleep(4000);
// 	  WebElement sta=driver.findElement(By.xpath("(//div[contains(text(),'Star')]//following::div[1])[2]"));
// 	  star=sta.getText();
// 	  System.out.println("Star ="+ star);
// } catch (Exception e2) {
// 	System.out.println("star value not edited.....");
// }
 		  

 try {
 	Thread.sleep(4000);
 	driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[5]/div[2]/ul/li[1]/div[2]/span/span[2]")).click();
 } catch (Exception e2) {
 	///System.out.println("no more fields");
 }

 		  Thread.sleep(4000);
 		  WebElement edu=driver.findElement(By.xpath("(//div[contains(text(),'Education')]//following::div[1])[2]"));
 		  String edu1=edu.getText();
 		  System.out.println("Education = "+edu1);

 		    
 		  Thread.sleep(4000);
 		  WebElement occ=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[5]/div[2]/ul/li[2]/div[2]"));
 		  String occpp=occ.getText();
 		  System.out.println("Occupation = "+occpp);
 		  
 		  
 		  Thread.sleep(4000);
 		  WebElement income=driver.findElement(By.xpath("(//div[contains(text(),'Annual Income')]//following::div[1])[2]"));
 		  String incomepp=income.getText();
 		  System.out.println("Income = "+incomepp);
 		  
 		  try {
 				String[] split11 = incomepp.split(" to");
 				//System.out.println("split1:"+split11[0]);
 				String[] split12 = split11[0].split(" Lakh");
 				String[] split13=split12[0].split("Rs.");
 				//System.out.println("income in pp:" + split13[1]);
 				int finalincomepp = Integer.parseInt(split13[1]);
 				//System.out.println("final income in pp :" + finalincomepp);

 			} catch (Exception en) {
 				System.out.println("Annual income is not specified....");
 			}
 		  
 		  
 		  
 		  WebElement country=driver.findElement(By.xpath("(//div[contains(text(),'Country')]//following::div[1])[2]"));
 		  String country1=country.getText();
 		  System.out.println("Country = "+country1);
 		  
 		  WebElement citizen=driver.findElement(By.xpath("(//div[contains(text(),'Citizenship')]//following::div[1])[2]"));
 		  String citizenship=citizen.getText();
 		  System.out.println("Citizenship = "+citizenship);
 		  
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
	
	
	
	
	
	
	
	
}           