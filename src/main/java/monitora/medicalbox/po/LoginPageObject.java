package monitora.medicalbox.po;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.WithTimeout;

public class LoginPageObject {
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/email_container")
	@FindBy(id = "emailLogin")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement emailLogin;
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/password_container")
	@FindBy(id = "passwordLogin")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement passwordLogin;
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/button_enter")
	@FindBy(id = "btnLogin")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement btnLogin;
	
	@AndroidFindBy(id = "android:id/button1")
	@FindBy(id = "btnOk")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement btnOk;
	
	public LoginPageObject(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void fillEmailLogin (String email) {
		emailLogin.sendKeys(email);
	}
	
	public void fillPasswordLogin (String password) {
		passwordLogin.sendKeys(password);
	}
	
	public void clickBtnLogin() {
		btnLogin.click();
	}
	
	public void clickBtnOk() {
		btnOk.click();
	}
}
