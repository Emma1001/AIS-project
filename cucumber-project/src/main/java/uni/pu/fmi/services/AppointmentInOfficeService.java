package uni.pu.fmi.services;

public class AppointmentInOfficeService {

	public static String appointment(String firstName, String lastName, String email, String phone, String date,
			int procedure) {
		
		if(lastName.isEmpty()) {
			return "Въведете фамилия на клиента";
		} 
		
		if(phone.isEmpty()) {
			return "Въведете телефон на клиента";
		}
		
		if(email.isEmpty()) {
			return "Въведете електронна поща на клиента";
		}
		
		if(date.isEmpty()) {
			return "Въведете дата";
		} else {
			String[] splittedDate = date.split(" ");
			if(splittedDate.length != 2) {
				return "Въведете желан час";
			}
		}
		
		if(procedure == 0) {
			return "Въведете процедура";
		}
		
		return "Успешно";
	}
	
	
	
}
