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

public class CalendarPageObject {

	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/add_event")
	@FindBy(id = "BtnAddEvent")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement BtnAddEvent;
	
	
	public CalendarPageObject(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(By.id("br.com.monitoratec.medicalbox.app:id/add_event")));
	}
	
	public void clickBtnAddEvent() {
		BtnAddEvent.click();
	}

}
