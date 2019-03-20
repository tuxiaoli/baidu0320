package hu;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class hello {
	WebDriver driver;
	@BeforeClass
	public void openfire() {
		System.setProperty("webdriver.chrome.driver","E:\\ChromeCore\\ChromeCoreLauncher.exe");
		driver=new ChromeDriver();
		String url="http://www.baidu.com";
		driver.get(url);
	}
	@Test
	public void login(){	
		
		driver.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		/*driver.findElement(By.linkText("新闻")).click();
		int aa=driver.findElements(By.tagName("a")).size();
		System.out.println(aa);*/
		
		//driver.findElement(By.linkText("国内")).click();
		//driver.findElement(By.partialLinkText("今年习近平4次踏出国门")).click();
		//driver.findElement(By.className("imgview")).click();
		
	/*	WebElement inputbox=driver.findElement(By.name("wd"));//通过ID定位输入框
		Thread.sleep(1000);
		inputbox.sendKeys("selenium");//输入框中输入selenium
		//找到百度一下的按钮
		WebElement buton=driver.findElement(By.id("su"));
		buton.click();//点击按钮*/}
		
}
