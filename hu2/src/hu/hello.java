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
		
		/*driver.findElement(By.linkText("����")).click();
		int aa=driver.findElements(By.tagName("a")).size();
		System.out.println(aa);*/
		
		//driver.findElement(By.linkText("����")).click();
		//driver.findElement(By.partialLinkText("����ϰ��ƽ4��̤������")).click();
		//driver.findElement(By.className("imgview")).click();
		
	/*	WebElement inputbox=driver.findElement(By.name("wd"));//ͨ��ID��λ�����
		Thread.sleep(1000);
		inputbox.sendKeys("selenium");//�����������selenium
		//�ҵ��ٶ�һ�µİ�ť
		WebElement buton=driver.findElement(By.id("su"));
		buton.click();//�����ť*/}
		
}
