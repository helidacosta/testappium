package monitora.medicalbox.po;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.WithTimeout;

public class MainScreenPageObject {
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/dashboard_sliding_menu")
	@FindBy(id = "btnSelect")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement btnSelect;
	
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index='1']")
	@FindBy(id = "btnPatients")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement btnPacientes;
		
	@AndroidFindBy(xpath = "//android.widget.TextView[@Text='Patients' and @index='1']")
	@FindBy(id = "txtPatients")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement txtPacientes;
	
	public MainScreenPageObject(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void clickBtnSelect() {
		btnSelect.click();
	}
	
	public void clickBtnPacientes() {
		btnPacientes.click();
	}
	
	public String gettxtPacientes() {
		return txtPacientes.getText();
	}
	
}
