package selenium_basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Final_project {

	public static void main(String[] args)throws InterruptedException{
		// TODO Auto-generated method stud
		//1.launch the browser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\athila\\Desktop\\Selenium_jar\\chromedriver.exe");
				WebDriver w=new ChromeDriver();
				w.get("http://demo.guru99.com/test/newtours/index.php");
				w.manage().window().maximize();
				Thread.sleep(2000);
				
			    //Login page
				w.findElement(By.name("userName")).sendKeys("test");
				w.findElement(By.name("password")).sendKeys("test");
				w.findElement(By.name("submit")).click();
				System.out.println("Login successfully");
				w.navigate().back();
				
				System.out.println("Logout successfullly done");
				Thread.sleep(5000);
				
				//SIGN-UP
				w.findElement(By.linkText("SIGN-ON")).click();
				w.findElement(By.name("userName")).sendKeys("athiladevi1121@gmail.com");
				w.findElement(By.name("password")).sendKeys("Athila11@");
				w.findElement(By.name("submit")).click();
				Thread.sleep(2000);
				
				//SIGN-OFF
				w.findElement(By.linkText("SIGN-OFF")).click();
				Thread.sleep(3000);
				
				//Register page
				
				w.findElement(By.linkText("REGISTER")).click();
				w.findElement(By.name("firstName")).sendKeys("Athila");
				w.findElement(By.name("lastName")).sendKeys("Devi");
				w.findElement(By.name("phone")).sendKeys("8124015612");
				w.findElement(By.id("userName")).sendKeys("athiladevi1121@gmail.com");
				w.findElement(By.name("address1")).sendKeys("T.H.N.U.Colony,South Street");
				w.findElement(By.name("city")).sendKeys("Thevaram");
				w.findElement(By.name("state")).sendKeys("Tamil Nadu");
				w.findElement(By.name("postalCode")).sendKeys("625530");
				Select s=new Select(w.findElement(By.name("country")));
				s.selectByValue("INDIA");
				
				w.findElement(By.id("email")).sendKeys("athiladevi1121@gmail.com");
				w.findElement(By.name("password")).sendKeys("Athila11@");
				w.findElement(By.name("confirmPassword")).sendKeys("Athila11@");
				w.findElement(By.name("submit")).click();
				Thread.sleep(5000);
				w.navigate().back();
				
				//Support
				w.findElement(By.linkText("SUPPORT")).click();
				Thread.sleep(3000);
				System.out.println("Support");
				Thread.sleep(3000);
				
				//Contact
				w.findElement(By.linkText("CONTACT")).click();
				Thread.sleep(3000);
				System.out.println("Contact");
				Thread.sleep(3000);
				
				//Home link
				w.findElement(By.linkText("Home")).click();
				Thread.sleep(3000);
				w.findElement(By.name("userName")).sendKeys("test");
				w.findElement(By.name("password")).sendKeys("test");
				w.findElement(By.name("submit")).click();
				System.out.println("Home");
				Thread.sleep(3000);
				w.navigate().back();
				
				//Flights link
				w.findElement(By.linkText("Flights")).click();
				Thread.sleep(3000);
				w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]"));
				System.out.println("Radio button");
				Select s0=new Select(w.findElement(By.name("passCount")));
				s0.selectByIndex(0);
				Select s1=new Select(w.findElement(By.name("fromPort")));
				s1.selectByIndex(2);
				Select s2=new Select(w.findElement(By.name("fromMonth")));
				s2.selectByIndex(5);
				Select s3=new Select(w.findElement(By.name("fromDay")));
				s3.selectByIndex(14);
				Select s4=new Select(w.findElement(By.name("toPort")));
				s4.selectByIndex(5);
				Select s5=new Select(w.findElement(By.name("toMonth")));
				s5.selectByIndex(6);
				Select s6=new Select(w.findElement(By.name("toDay")));
				s6.selectByIndex(19);
				w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select"));
				Select s7=new Select(w.findElement(By.name("airline")));
				s7.selectByIndex(2);
				w.findElement(By.name("findFlights")).click();
				w.navigate().back();
				System.out.println("Flights");
				Thread.sleep(3000);
				w.navigate().back();
				
				//Hotels
				w.findElement(By.linkText("Hotels")).click();
				Thread.sleep(3000);
				w.navigate().back();
				System.out.println("Hotels");
				Thread.sleep(3000);
				
				//Car Rentals
				w.findElement(By.linkText("Car Rentals")).click();
				Thread.sleep(3000);
				w.navigate().back();
				System.out.println("Car Rentals");
				Thread.sleep(3000);
				
				//Cruises
				w.findElement(By.linkText("Cruises")).click();
				Thread.sleep(3000);
				w.navigate().back();
				System.out.println("Cruises");
				Thread.sleep(3000);
				
				//Destinations
				w.findElement(By.linkText("Destinations")).click();
				Thread.sleep(3000);
				w.navigate().back();
				System.out.println("Destionations");
				Thread.sleep(3000);
				
				//Vacations
				w.findElement(By.linkText("Vacations")).click();
				Thread.sleep(3000);
				w.navigate().back();
				System.out.println("Vacations");
				Thread.sleep(3000);
				
				//Selenium
				w.findElement(By.partialLinkText("Seleni")).click();
				Thread.sleep(3000);
				//flash movie demo
				w.findElement(By.linkText("Flash Movie Demo")).click();
				//w.findElement(By.name("Play")).click();
				//w.findElement(By.name("zoomin")).click();
				Thread.sleep(3000);
				w.navigate().back();
				w.navigate().back();
				
				//Selenium radio and checkbox
				w.findElement(By.partialLinkText("Seleni")).click();
				Thread.sleep(3000);
				
				//radio&check demo
				w.findElement(By.linkText("Radio & Checkbox Demo")).click();
				Thread.sleep(3000);
				w.findElement(By.xpath("//*[@id=\"vfb-7-2\"]")).click();
				Thread.sleep(3000);
				w.findElement(By.xpath("//*[@id=\"vfb-6-0\"]")).click();
				w.navigate().back();
				
				//Selenium
				w.findElement(By.partialLinkText("Seleni")).click();
				Thread.sleep(3000);
				//Table Demo
				w.findElement(By.linkText("Table Demo")).click();
				Thread.sleep(3000);
				w.navigate().back();
				
				//Selenium
				w.findElement(By.partialLinkText("Seleni")).click();
				Thread.sleep(3000);
				//Accessing link
				w.findElement(By.linkText("Accessing Link")).click();
				w.findElement(By.linkText("click here")).click();
				Thread.sleep(3000);
				w.navigate().back();
				w.navigate().back();
				
				//Selenium
				w.findElement(By.partialLinkText("Seleni")).click();
				Thread.sleep(3000);
				//Ajax Demo
				w.findElement(By.linkText("Ajax Demo")).click();
				Thread.sleep(3000);
				w.findElement(By.name("name")).click();
				w.findElement(By.id("buttoncheck")).click();
				Thread.sleep(3000);
				w.navigate().back();
				
				//selenium
				w.findElement(By.partialLinkText("Seleni")).click();
				Thread.sleep(3000);
				//Inside & Outside Block Level tag
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[6]/a")).click();
				w.findElement(By.xpath("/html/body/p/a")).click();
				Thread.sleep(3000);
				w.navigate().back();
				w.navigate().back();
				
				//Selenium
				w.findElement(By.partialLinkText("Seleni")).click();
				Thread.sleep(2000);
				//Delete customer form
				w.findElement(By.linkText("Delete Customer Form")).click();
				w.findElement(By.name("cusid")).sendKeys("123");
				w.findElement(By.name("submit")).click();
				//Thread.sleep(2000);
			    Thread.sleep(6000);
				Alert A1=w.switchTo().alert();
				System.out.println(A1.getText());
				A1.accept();
				//w.navigate().back();
				//w.navigate().back();
				//a2.dismiss
				Thread.sleep(6000);
				Alert A2=w.switchTo().alert();
				System.out.println(A2.getText());
				A2.accept();
				Thread.sleep(3000);
				w.navigate().back();
				Thread.sleep(5000);
				w.navigate().back();
				Thread.sleep(3000);
				
				//Selenium
				w.findElement(By.partialLinkText("Seleni")).click();
				Thread.sleep(3000);
				//Yahoo
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[8]/a")).click();
				Thread.sleep(3000);
				//w.findElement(By.xpath("//*[@id=\"messenger-download\"]"))click();
				w.navigate().back();
				w.navigate().back();
				
				//Selenium
				w.findElement(By.partialLinkText("Seleni")).click();
				Thread.sleep(3000);
				//tooltip
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[9]/a")).click();
				Thread.sleep(3000);
				//w.findElement(By.xpath("//*[@id=\"download_now\"]")).click();
				w.navigate().back();
				
				//Selenium
				w.findElement(By.partialLinkText("Seleni")).click();
				Thread.sleep(3000);
				//File Upload
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[10]/a")).click();
				w.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\athila\\Desktop\\Athiladevi Murugan.pdf");
				Thread.sleep(3000);
				w.findElement(By.name("send")).click();
				Thread.sleep(3000);
				w.navigate().back();
				w.navigate().back();
				
				//Selenium
				w.findElement(By.partialLinkText("Seleni")).click();
				Thread.sleep(3000);
				//login
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[11]/a")).click();
				Thread.sleep(2000);
				w.findElement(By.name("email")).sendKeys("athiladevi1121@gmail.com");
				w.findElement(By.name("passwd")).sendKeys("8124015612");
				w.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
				w.navigate().back();
				w.navigate().back();
				
				//Selenium
				w.findElement(By.partialLinkText("Seleni")).click();
				Thread.sleep(3000);
				//Social Icon
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[12]/a")).click();
				w.navigate().back();
				w.navigate().back();
				
				//Selenium
				w.findElement(By.partialLinkText("Seleni")).click();
				Thread.sleep(3000);
				//Selenium Auto IT
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[13]/a")).click();
				w.navigate().back();
				w.navigate().back();
				
				//Selenium
				w.findElement(By.partialLinkText("Seleni")).click();
				Thread.sleep(3000);
				//Selenium IDE Test
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[14]/a")).click();
				Thread.sleep(5000);
				w.findElement(By.name("email")).sendKeys("athiladevi1121@gmail.com");
				w.findElement(By.name("pass")).sendKeys("Athila11@");
				w.findElement(By.id("u_0_b")).click();
				Thread.sleep(6000);
				w.navigate().back();
				w.navigate().back();

				//Selenium
				w.findElement(By.partialLinkText("Seleni")).click();
				Thread.sleep(3000);
				//Guru99 Demo Page
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[15]/a")).click();
				Thread.sleep(3000);
				w.navigate().back();
				w.navigate().back();

				//Selenium
				w.findElement(By.partialLinkText("Seleni")).click();
				Thread.sleep(3000);
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[16]/a")).click();
				w.manage().window().maximize();
				WebElement Element=w.findElement(By.linkText("VBScript"));
				JavascriptExecutor js=(JavascriptExecutor) w;
				js.executeScript("arguments[0].scrollIntoView();",Element);
				Thread.sleep(5000);
				w.navigate().back();
				w.navigate().back();
				
				
				//Selenium
				w.findElement(By.partialLinkText("Seleni")).click();
				Thread.sleep(3000);
				//File Upload using Sikuli Demo
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[17]/a")).click();
				w.findElement(By.xpath("//*[@id=\"photoimg\"]")).sendKeys("C:\\Users\\athila\\Desktop\\Athiladevi Murugan.pdf");
				Thread.sleep(3000);
				w.navigate().back();
				w.navigate().back();
				
				//Selenium
				w.findElement(By.partialLinkText("Seleni")).click();
				Thread.sleep(3000);
				//Cookie Handling Demo
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[18]/a")).click();
				w.findElement(By.name("username")).sendKeys("athiladevi1121@gmail.com");
				w.findElement(By.name("password")).sendKeys("Athila11@");
				w.findElement(By.name("submit")).click();
				Thread.sleep(3000);
				w.navigate().back();
				w.navigate().back();
				w.navigate().back();
				
				//Selenium
				w.findElement(By.partialLinkText("Seleni")).click();
				Thread.sleep(3000);
				//Drag and Drop Actions
				Actions a = new Actions(w);
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[19]/a")).click();
				
				WebElement bank = w.findElement(By.partialLinkText("BANK"));
				WebElement drop1 = w.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));
				a.dragAndDrop(bank, drop1).build().perform();
				
				WebElement amt = w.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
				WebElement drop2 = w.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ol[1]/li[1]"));
				a.dragAndDrop(amt, drop2).build().perform();
		        WebElement sales = w.findElement(By.partialLinkText("SALES"));
		        WebElement drop3 = w.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));
				a.dragAndDrop(sales, drop3).build().perform();
				
				WebElement amt2 = w.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
				WebElement drop4 = w.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ol[1]/li[1]"));
				a.dragAndDrop(amt2, drop4).build().perform();
				Thread.sleep(6000);
				w.navigate().back();
				w.navigate().back();
				
				//Selenium
				w.findElement(By.partialLinkText("Seleni")).click();
				Thread.sleep(3000);
				//Selenium Datepicker Demo
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[20]/a")).click();
				Thread.sleep(3000);
				w.findElement(By.name("bdaytime")).click();
				Thread.sleep(3000);
				w.navigate().back();
				w.navigate().back();
				Thread.sleep(6000);
				w.navigate().back();
			
				//Insurance project
				w.findElement(By.partialLinkText("Insurance Project")).click();
				Thread.sleep(6000);
				w.findElement(By.name("email")).sendKeys("athiladevii1121@gmail.com");
				w.findElement(By.name("password")).sendKeys("Athila11@");
				w.findElement(By.name("submit")).click();
				Thread.sleep(6000);
				w.navigate().back();
				w.navigate().back();
				
				//Agile project
				w.findElement(By.partialLinkText("Agile Project")).click();
				Thread.sleep(3000);
				w.findElement(By.name("uid")).sendKeys("1303");
				w.findElement(By.name("password")).sendKeys("Guru99");
				Thread.sleep(6000);
				w.findElement(By.name("btnLogin")).click();
				w.navigate().back();
				w.navigate().back();
				
				//Bank project
				w.findElement(By.partialLinkText("Bank Project")).click();
				Thread.sleep(3000);
				w.findElement(By.name("uid")).sendKeys("123");
				w.findElement(By.name("password")).sendKeys("Athila11@");
				Thread.sleep(3000);
				w.findElement(By.name("btnReset")).click();
				Thread.sleep(3000);
				w.navigate().back();
				w.navigate().back();
				
				//Security project
				w.findElement(By.xpath("Security Project")).click();
				Thread.sleep(3000);
				w.findElement(By.name("uid")).sendKeys("123");
				w.findElement(By.name("password")).sendKeys("Athila11@");
				Thread.sleep(3000);
				w.findElement(By.name("btnReset")).click();
				
				//Telecom project
				w.findElement(By.partialLinkText("Telecom Project")).click();
				Thread.sleep(3000);
				w.navigate().back();
				
				//Payment Gateway Project
				w.findElement(By.partialLinkText("Payment Gateway Project")).click();
				Thread.sleep(3000);
				w.navigate().back();
				
				//Newtours
				w.findElement(By.partialLinkText("New Tours")).click();
				Thread.sleep(5000);
				
				//SEO
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
				Thread.sleep(6000);
				
				w.findElement(By.linkText("Page-1")).click();
				Thread.sleep(6000);
				w.navigate().back();
				
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
				Thread.sleep(6000);
				w.findElement(By.linkText("Page-2")).click();
				Thread.sleep(6000);
				w.navigate().back();
				
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
				Thread.sleep(6000);
				w.findElement(By.linkText("Page-3")).click();
				Thread.sleep(6000);
				w.navigate().back();
				
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
				Thread.sleep(6000);
				w.findElement(By.linkText("Page-4")).click();
				Thread.sleep(3000);
				w.navigate().back();
				
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
				Thread.sleep(6000);
				w.findElement(By.linkText("Page-5")).click();
				Thread.sleep(3000);
				w.navigate().back();
				
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
				Thread.sleep(6000);
				w.findElement(By.linkText("Page-6")).click();
				Thread.sleep(3000);
				w.navigate().back();
				
				
	}
}
