package Testrunner;

import org.junit.Test;
import org.openqa.selenium.By;

import Batch6TestNG.Base;

public class Tc_1 extends Base {

	
	@Test
	private void tc1() {
		driver.get("https://adactinhotelapp.com/BookHotel.php");
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("BharathSingh");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Rajaputra");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Telangana");
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567891923467");
		driver.findElement(By.xpath("//select[@id='cc_type']")).sendKeys("VISA");
		driver.findElement(By.xpath("//select[@id='cc_exp_month']")).sendKeys("January");
		driver.findElement(By.xpath("//select[@id='cc_exp_year']")).sendKeys("2022");
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("2345");
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
	}
	@Test
	private void tc2() {
		//select hotel
		driver.get("https://adactinhotelapp.com/SelectHotel.php");
		
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		driver.findElement(By.id("continue")).click();
		
		
	}
	@Test
	private void tc3() {
		//Book A Hotel
		//validation booking option
		driver.get("https://adactinhotelapp.com/BookHotel.php");
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Sudhananda");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Gaddala");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Andhra Pradesh");
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567891923467");
		driver.findElement(By.xpath("//select[@id='cc_type']")).sendKeys("VISA");
		driver.findElement(By.xpath("//select[@id='cc_exp_month']")).sendKeys("January");
		driver.findElement(By.xpath("//select[@id='cc_exp_year']")).sendKeys("2022");
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("2345");
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
	}
    @Test
    private void tc4() {
    	//
    	driver.get("https://adactinhotelapp.com/BookingConfirm.php");
    	System.out.println("The Order No :0IZI39381H");
    }
}