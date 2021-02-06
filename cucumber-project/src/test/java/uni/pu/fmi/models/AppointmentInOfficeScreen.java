package uni.pu.fmi.models;

import java.text.ParseException;

import uni.pu.fmi.services.AppointmentInOfficeService;

public class AppointmentInOfficeScreen {

	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String date;
	private int procedure;
	private String message;
	
	public void navigateToMe() {
		System.out.println("Екрана за запазване на час от офис е отворен.");
		
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}

	public void setEmail(String email) {
		this.email = email;
		
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}

	public void setPhone(String phone) {
		this.phone = phone;
		
	}

	public void setDate(String date) {
		this.date = date;
		
	}

	public void setProcedure(int procedure) {
		this.procedure = procedure;
		
	}

	public void clickSaveButton() throws ParseException {
		message = AppointmentInOfficeService.appointment(firstName, lastName,
				email, phone, date, procedure);
		
	}

	public String getAppointmentMessage() {
		return message;
	}

}
