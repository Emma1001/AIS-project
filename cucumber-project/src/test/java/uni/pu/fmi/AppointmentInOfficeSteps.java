package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.AppointmentInOfficeScreen;

public class AppointmentInOfficeSteps {

	private AppointmentInOfficeScreen appInOfficeScreen = new AppointmentInOfficeScreen();
			
	@Given("^Служителят отваря екран за запазване на час$")
	public void openScreenForAppointment() throws Throwable {
	    appInOfficeScreen.navigateToMe();
	}

	@When("^Въведе първо име \"([^\"]*)\"$")
	public void addFirstName(String firstName) throws Throwable {
		appInOfficeScreen.setFirstName(firstName);
	}

	@When("^Въведе второ име \"([^\"]*)\"$")
	public void addLastName(String lastName) throws Throwable {
		appInOfficeScreen.setLastName(lastName);
	}

	@When("^Въведе телефонен номер \"([^\"]*)\"$")
	public void addPhone(String phone) throws Throwable {
		appInOfficeScreen.setPhone(phone);
	}

	@When("^Въведе електронна поща \"([^\"]*)\"$")
	public void addEmail(String email) throws Throwable {
		appInOfficeScreen.setEmail(email);
	}

	@When("^Въведе желаната процедура (\\d+)$")
	public void addProcedure(int procedure) throws Throwable {
		appInOfficeScreen.setProcedure(procedure);
	}
	
	@When("^Въведе дата за час \"([^\"]*)\"$")
	public void addDate(String date) throws Throwable {
		appInOfficeScreen.setDate(date);
	}

	@When("^Натиска върху бутона за запазване$")
	public void clickSaveButton() throws Throwable {
		appInOfficeScreen.clickSaveButton();
	}
	
	@Then("^Вижда съобщение дали е успешно \"([^\"]*)\"$")
	public void checkMessage(String expectedMessage) throws Throwable {
	   assertEquals(expectedMessage, appInOfficeScreen.getAppointmentMessage());
	}
	
	@When("^Въведе желаната процедура $")
	public void въведе_желаната_процедура() throws Throwable {
	}
}
