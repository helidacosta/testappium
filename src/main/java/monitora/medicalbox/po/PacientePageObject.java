package monitora.medicalbox.po;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.WithTimeout;


public class PacientePageObject 
{
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/button")
	@FindBy(id = "btnPacientesf")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement btnPacientesf;
	
	public PacientePageObject(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void clickBtnPacientefs() {
		btnPacientesf.click();
	}
}
