package monitora.medicalbox.unique_script;

import static org.junit.Assert.assertEquals;


import java.net.MalformedURLException;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import monitora.medicalbox.support.Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.functions.ExpectedCondition;
import monitora.medicalbox.basic.Login;
import monitora.medicalbox.po.LoginPageObject;
import monitora.medicalbox.po.MainScreenPageObject;

import static java.util.concurrent.TimeUnit.SECONDS;



public class MedicalBoxPaciente {
	
		private AppiumDriver<?> driver;
		 private Wait wait;
	
	@Before
	public void setUp() throws MalformedURLException {
		driver = Utils.returnDriver(Utils.readProperty("run.platform"));
		
		wait = new FluentWait(driver)
	                .withTimeout(30, SECONDS)
	                .pollingEvery(5, SECONDS)
	                .ignoring(NoSuchElementException.class);
		
			LoginPageObject login = new LoginPageObject(driver);
			login.fillEmailLogin("teste_automatico@medicalbox.com.br");
			login.fillPasswordLogin("1234");
			login.clickBtnLogin();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void testPacientes() {
	    MainScreenPageObject mainscreen = new MainScreenPageObject(driver);
	    
	    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className(mainscreen.gettxtPacientes())));
	    
	    //ExpectedCondition expectedCondition = (ExpectedCondition) ExpectedConditions.presenceOfAllElementsLocatedBy(By.id(mainscreen.gettxtPacientes()));
        //fluentWaitByExpectedCondition(expectedCondition);
        
        assertEquals("Patients", mainscreen.gettxtPacientes());
	    System.out.println(mainscreen.gettxtPacientes());	
	    
        
		mainscreen.clickBtnPacientes();
 
	}
	
	 public void fluentWaitByExpectedCondition(ExpectedCondition waitCondition) {
         wait.until(waitCondition);
     }
}
