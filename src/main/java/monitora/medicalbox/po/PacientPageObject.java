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


public class PacientPageObject 
{
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/fab")
	@FindBy(id = "btnNewPacient")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement btnNewPacient;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Patients']")
	@FindBy(id = "txtPacients")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement txtPacients;
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/text_patient")
	@FindBy(id = "txtNomePacient")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement txtNomePacient;
	
	public PacientPageObject(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Patients']")));
	}
	
	public void clickBtnNewPacient() {
		btnNewPacient.click();
	}
	
	public String gettxtPacients() {
		return txtPacients.getText();
	}
	
	public String gettxtNomePacient() {
		return txtNomePacient.getText();
	}
}
