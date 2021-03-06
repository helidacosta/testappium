package monitora.medicalbox.po;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.WithTimeout;

public class MainScreenPageObject {
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Patients']")
	@FindBy(id = "txtPatients")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement txtPacients;
	
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index='1']")
	@FindBy(id = "btnPatients")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement btnPacients;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Calendar']")
	@FindBy(id = "btnCalendar")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement btnCalendar;
		

	
	public MainScreenPageObject(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(By.id("br.com.monitoratec.medicalbox.app:id/label_attendings_of_today")));
	}
	
	public void clickBtnCalendar() {
		btnCalendar.click();
	}
	
	public void clickBtnPacients() {
		btnPacients.click();
	}
	
	public String gettxtPacients() {
		return txtPacients.getText();
	}
	
}
