package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class RegisterInvalidPOM {
	
private WebDriver driver; 
	
	public RegisterInvalidPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='http://retail.upskills.in/account/account']")
	private WebElement account; 
	
	@FindBy(id="input-firstname")
	private WebElement firstname;
	
	@FindBy(id="input-lastname")
	private WebElement lastname;
	
	@FindBy(id="input-email")
	private WebElement email;
	
	@FindBy(id="input-telephone")
	private WebElement telephone;
	
	@FindBy(id="input-address-1")
	private WebElement address;
	
	@FindBy(id="input-city")
	private WebElement city;
	
	@FindBy(id="input-postcode")
	private WebElement postal;
	
	@FindBy(id="input-zone")
	private WebElement zone;
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(id="input-confirm")
	private WebElement confirm_password;
	
	@FindBy(name="agree")
	private WebElement radiocheck;
	
	public void Register() throws InterruptedException
	{
	 this.account.click();
	 Thread.sleep(3000);
	 driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
	 Thread.sleep(3000);
		
	}
	
	public String PersonalDetails(String firstname,String lastname, String email, String telephone)
	{
		String email_Actual;
		this.firstname.clear();
		this.firstname.sendKeys(firstname);
		this.lastname.clear();
		this.lastname.sendKeys(lastname);
		this.email.sendKeys(email);
		this.telephone.sendKeys(telephone);
		email_Actual = this.firstname.getText();
		return email_Actual;
		
	}
	
	public void Address(String address, String city, String postal, String zone)
	{
		this.address.sendKeys(address);
		this.city.sendKeys(city);
		this.postal.sendKeys(postal);
		Select se2 = new Select(this.zone);
		se2.selectByValue(zone);
	}
	
	public void SetPassword(String password, String confirm)
	{
		this.password.sendKeys(password);
		this.confirm_password.sendKeys(confirm);
		
	}
	
	public void confirm() throws InterruptedException
	{
		this.radiocheck.click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		 Thread.sleep(3000);
		 /*Actions act = new Actions(driver);
		 act.clickAndHold(email).moveByOffset(0, 50).release();
		 Action action = act.build();
		 action.perform();*/
	}

}
