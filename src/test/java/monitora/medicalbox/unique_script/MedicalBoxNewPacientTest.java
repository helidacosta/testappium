package monitora.medicalbox.unique_script;

import static org.junit.Assert.assertEquals;


import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import monitora.medicalbox.support.Utils;

import io.appium.java_client.AppiumDriver;
import monitora.medicalbox.po.CalendarPageObject;
import monitora.medicalbox.po.LoginPageObject;
import monitora.medicalbox.po.MainScreenPageObject;
import monitora.medicalbox.po.NewCalendarPageObject;
import monitora.medicalbox.po.NewPacientPageObject;
import monitora.medicalbox.po.PacientPageObject;

public class MedicalBoxNewPacientTest {
	
	private AppiumDriver<?> driver;
	private Wait wait;
	
	@Before
	public void setUp() throws MalformedURLException {
		driver = Utils.returnDriver(Utils.readProperty("run.platform"));
		
		wait = new WebDriverWait(driver,5);
		
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
	public void testPacients() {
	    MainScreenPageObject mainscreen = new MainScreenPageObject(driver);
	    assertEquals("Patients", mainscreen.gettxtPacients());
		mainscreen.clickBtnPacients();
		
		PacientPageObject pacients = new PacientPageObject(driver);
		assertEquals("Patients", pacients.gettxtPacients());
		pacients.clickBtnNewPacient();
		
		NewPacientPageObject newpacient = new NewPacientPageObject(driver);
		assertEquals("General data", newpacient.gettxtGeneralCard());	
		
		//General Data
		newpacient.clickGeneralData();
		newpacient.clickGeneralData();
		newpacient.fillNamePacient("Helida Costa");
		newpacient.fillBirthPacient("22/06/1982");
		newpacient.clickslcGenrePacient();
		newpacient.fillRgPacient("1988987");
		newpacient.fillCpfPacient("30298635810");
		newpacient.fillProfessionPacient("Analista de Testes");
		newpacient.fillIndicationPacient("Maria Costa");
		
		//Contact
		newpacient.clickContact();
		newpacient.filltxtTelephone("16 33657887");
		newpacient.filltxtCellphone("16 998778977");
		newpacient.filltxtTEmail("helida@test.com");
		newpacient.filltxtSpeakwith("Helida Costa");
		
		//Adress
		newpacient.clickAddress();
		newpacient.filltxtCEP("13563673");
		new WebDriverWait(driver, 2);
		newpacient.filltxtNumber("777");
		newpacient.filltxtComplement("casa 433");
				
		newpacient.clickBtnSalvePacient();
		assertEquals("Helida Costa", pacients.gettxtNomePacient());
		
	}
}
