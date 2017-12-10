package monitora.medicalbox.unique_script;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import monitora.medicalbox.po.CalendarPageObject;
import monitora.medicalbox.po.LoginPageObject;
import monitora.medicalbox.po.MainScreenPageObject;
import monitora.medicalbox.po.NewCalendarPageObject;
import monitora.medicalbox.support.Utils;

public class MedicalBoxAgendTest {

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
		//driver.quit();
	}
	
	@Test
	public void testScheduling() {
	    MainScreenPageObject mainscreen = new MainScreenPageObject(driver);
		mainscreen.clickBtnCalendar();
		
		CalendarPageObject calendar = new CalendarPageObject(driver);
		calendar.clickBtnAddEvent();
		
		NewCalendarPageObject newcalendar = new NewCalendarPageObject(driver);
		newcalendar.filltxtName("Helida Costa");
		new WebDriverWait(driver, 3);
		//newcalendar.clickslcScheduleType();
		newcalendar.filltxtDate("16/12/2017");
		newcalendar.filltxtTime("19:00");
		newcalendar.filltxtDuration("00:30:00");
				
		newcalendar.clickbtnSaveScheduling();
		//assertEquals("Helida Costa", pacients.gettxtNomePacient());
		
	}

}
