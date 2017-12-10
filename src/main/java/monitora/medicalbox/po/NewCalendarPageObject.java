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

public class NewCalendarPageObject {

	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/spinnerType")
	@FindBy(id = "slcScheduleType")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement slcScheduleType;
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/textViewName")
	@FindBy(id = "txtName")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement txtName;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Consulta']")
	@FindBy(id = "slcSchTypeConsulta")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement slcSchTypeConsulta;
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/textViewDate")
	@FindBy(id = "txtDate")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement txtDate;
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/textViewInit")
	@FindBy(id = "txtTime")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement txtTime;
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/textViewDuration")
	@FindBy(id = "txtDuration")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement txtDuration;
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/action_save")
	@FindBy(id = "btnSaveScheduling")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement btnSaveScheduling;
	
	public NewCalendarPageObject(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(By.id("br.com.monitoratec.medicalbox.app:id/labelPatient")));
	}
	
	public void filltxtName(String name) {
		txtName.sendKeys(name);
	}
	
	public void clickslcScheduleType() {
		slcScheduleType.click();
		slcSchTypeConsulta.click();
	}
	
		public void filltxtDate(String date) {
		txtDate.sendKeys(date);
	}
	
	public void filltxtTime(String time) {
		txtTime.sendKeys(time);
	}
	
	public void filltxtDuration(String duration) {
		txtDuration.sendKeys(duration);
	}
	
	
	public void clickbtnSaveScheduling() {
		btnSaveScheduling.click();
	}
	
}
