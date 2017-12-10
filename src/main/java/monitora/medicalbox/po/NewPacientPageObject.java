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

public class NewPacientPageObject {
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/txt_general_data_card")
	@FindBy(id = "txtGeneralCard")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement txtGeneralCard;
	
	//General Data
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='General data']")
	@FindBy(id = "LbGeneralData")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement LbGeneralData;
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/edit_text_full_name_patient")
	@FindBy(id = "txtNamePacient")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement txtNamePacient;
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/edit_text_birth_date_patients")
	@FindBy(id = "txtBirthPacient")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement txtBirthPacient;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Select']")
	@FindBy(id = "slcGenrePacient")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement slcGenrePacient;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Female']")
	@FindBy(id = "FemalePacient")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement FemalePacient;
	
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/edit_text_rg_patients")
	@FindBy(id = "txtRgPacient")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement txtRgPacient;
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/edit_text_cpf_patients")
	@FindBy(id = "txtCpfPacient")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement txtCpfPacient;
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/edit_text_profession_patients")
	@FindBy(id = "txtProfessionPacient")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement txtProfessionPacient;
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/edit_text_indication_patients")
	@FindBy(id = "txtIndicationPacient")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement txtIndicationPacient;
	
	//Contacts
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Contacts']")
	@FindBy(id = "LbContacts")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement LbContacts;
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/patient_text_telephone")
	@FindBy(id = "txtTelephone")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement txtTelephone;
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/patient_text_cellphone")
	@FindBy(id = "txtCellphone")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement txtCellphone;
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/patient_text_email")
	@FindBy(id = "txtEmail")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement txtEmail;
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/patient_text_speak_with")
	@FindBy(id = "txtSpeakwith")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement txtSpeakwith;
	
	//Adress
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Address']")
	@FindBy(id = "LbAddress")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement LbAddress;
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/edit_text_cep")
	@FindBy(id = "txtCEP")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement txtCEP;
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/edit_text_number")
	@FindBy(id = "txtNumber")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement txtNumber;
	
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/edit_text_complement")
	@FindBy(id = "txtComplement")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement txtComplement;
	
	
	//Botão Salvar
	@AndroidFindBy(id = "br.com.monitoratec.medicalbox.app:id/action_save")
	@FindBy(id = "btnSalvePacient")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement btnSalvePacient;
	

	public NewPacientPageObject(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(By.id("br.com.monitoratec.medicalbox.app:id/txt_general_data_card")));
	}
	
	public String gettxtGeneralCard() {
		return txtGeneralCard.getText();
	}
	
	//General Data
	public void clickGeneralData() {
		LbGeneralData.click();
	}
	
	public void fillNamePacient(String nome) {
		txtNamePacient.sendKeys(nome);
	}
	
	public void fillBirthPacient(String birth) {
		txtBirthPacient.sendKeys(birth);
	}
	
	public void clickslcGenrePacient() {
		slcGenrePacient.click();
		FemalePacient.click();
		
	}
	
	public void fillRgPacient(String rg) {
		txtRgPacient.sendKeys(rg);
	}
	
	public void fillCpfPacient(String cpf) {
		txtCpfPacient.sendKeys(cpf);
	}
	
	public void fillProfessionPacient(String profession) {
		txtProfessionPacient.sendKeys(profession);
	}
	
	public void fillIndicationPacient(String indication) {
		txtIndicationPacient.sendKeys(indication);
	}
	
	//Contact
	public void clickContact() {
		LbContacts.click();
	}
	
	public void filltxtTelephone(String phone) {
		txtTelephone.sendKeys(phone);
	}
	
	public void filltxtCellphone(String cellphone) {
		txtCellphone.sendKeys(cellphone);
	}
	
	public void filltxtTEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void filltxtSpeakwith(String speak) {
		txtSpeakwith.sendKeys(speak);
	}
	
	//Address
		public void clickAddress() {
			LbAddress.click();
		}
		
		public void filltxtCEP(String cep) {
			txtCEP.sendKeys(cep);
		}
		
		public void filltxtNumber(String number) {
			txtNumber.sendKeys(number);
		}
		
		public void filltxtComplement(String complement) {
			txtComplement.sendKeys(complement);
		}
		
	
	
	//Salve Button
	public void clickBtnSalvePacient() {
		btnSalvePacient.click();
	}
}
