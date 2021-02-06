package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.AppointmentScreenModel;

public class AppointmentSteps {
	
	AppointmentScreenModel appointmentScreen = new AppointmentScreenModel();

	@Given("^Потребителят отваря страница за запазване на час$")
	public void openAppointmentScreen() throws Throwable {
	    appointmentScreen.navigateToMe();
	}

	@When("^Въвежда име \"([^\"]*)\"$")
	public void addFirstName(String firstName) throws Throwable {
		appointmentScreen.setFirstName(firstName);
	}

	@When("^Въвежда фамилия \"([^\"]*)\"$")
	public void addLastName(String lastName) throws Throwable {
		appointmentScreen.setLastName(lastName);
	}

	@When("^Въвежда електронна поща \"([^\"]*)\"$")
	public void addEmail(String email) throws Throwable {
		appointmentScreen.setEmail(email);
	}

	@When("^Въвежда телефонен номер \"([^\"]*)\"$")
	public void addPhone(String phone) throws Throwable {
		appointmentScreen.setPhone(phone);
	}

	@When("^Въвежда дата и час за запазване на час \"([^\"]*)\"$")
	public void addDateForAppointment(String date) throws Throwable {
		appointmentScreen.setDate(date);
	}

	@When("^Въвежда желаната процедура \"([^\"]*)\"$")
	public void addProcedure(int procedure) throws Throwable {
		appointmentScreen.setProcedure(procedure);
	}

	@When("^Натиска върху бутона Запази$")
	public void clickSaveButton() throws Throwable {
		appointmentScreen.clickSaveButton();
	}

	@When("^Вижда съобщение \"([^\"]*)\"$")
	public void checkAppointmentMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, appointmentScreen.getAppointmentMessage());
	}
	
	@When("^Потвърждава часът чрез пощата \"([^\"]*)\"$")
	public void confirmAppointment(String confirmation) throws Throwable {
	    appointmentScreen.setStatus(confirmation);
	}
	
	@Then("^Вижда съобщение за потвърден час \"([^\"]*)\"$")
	public void checkConfirmationMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, appointmentScreen.checkIfConfirmed());
	}

}
