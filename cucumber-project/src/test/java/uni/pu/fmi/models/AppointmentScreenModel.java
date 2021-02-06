package uni.pu.fmi.models;

import java.text.ParseException;

import uni.pu.fmi.services.AppointmentService;

public class AppointmentScreenModel {

	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String date;
	private int procedure;
	private String message;
	private String confirmation;
	
	public void navigateToMe() {
		System.out.println("Екрана за запазване на час е отворен");
		
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
		message = AppointmentService.appointment(firstName, lastName,
				email, phone, date, procedure);
		
	}

	public String getAppointmentMessage() {
		return message;
	}

	public void setStatus(String confirmation) {
		this.confirmation = confirmation;
		
	}

	public String checkIfConfirmed() {
		return AppointmentService.checkIfConfirmed(confirmation);
		
	}

}
