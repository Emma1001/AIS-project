package uni.pu.fmi.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.time.DateUtils;

import uni.pu.fmii.Appointment;
import uni.pu.fmii.Client;

public class AppointmentService {

	static Client client1 = new Client();
	
	public static String appointment(String firstName, String lastName, String email, String phone, String date, int idProcedure) throws ParseException {

		/*List<Client> clients = getClients();
		
		for(Client c: clients) {
			for(Appointment app: c.getAppointments()) {
				if(app.getDate().equals(date) && app.getIdProcedure() == idProcedure){
					client1 = c;
				}
			}
		}*/
		
		
		String message = checkIfAvailable(date);
		return message;
		
		/*boolean doesClientExist = clients.stream().anyMatch(client ->
									client.getFirstName().equals(client1.getFirstName())
									&& client.getLastName().equals(client1.getLastName())
									&& client.getEmail().equals(client1.getEmail())
									&& client.getPhone().equals(client1.getPhone()));
		
		return doesClientExist?"OK":"";*/
	}
	
	public static List<Client> getClients() throws ParseException{
		Client client = new Client();
		client.setFirstName("Еми");
		client.setLastName("Н");
		client.setEmail("emi@emi.com");
		client.setPhone("1234");
		
		Appointment appointment = new Appointment();
		appointment.setDate("2021-02-12 13:30:00");
		appointment.setIdClient(1);
		appointment.setIdProcedure(1);
		
		client.addAppointment(appointment);
		
		ArrayList<Client> clients = new ArrayList<Client>();
		clients.add(client);
		
		return clients;
	}
	
	public static List<Appointment> getAppointments(){
		ArrayList<Appointment> appointments = new ArrayList<Appointment>();
		
		Appointment app1 = new Appointment(1, 1, "12.02.2021 13:30:00");
		Appointment app2 = new Appointment(1, 2, "12.02.2021 14:30:00");
		
		appointments.add(app1);
		appointments.add(app2);
		
		return appointments;
	}
	
	public static String checkIfAvailable(String dateWanted) throws ParseException {
		
		List<Appointment> appointments = getAppointments();
		
		String[] splittedDateWanted = dateWanted.split(" ");
		
		LocalTime target = LocalTime.parse(splittedDateWanted[1]);
		
		Boolean targetInZone = ( 
		    target.isAfter( LocalTime.parse("10:00:00")) 
		    && target.isBefore( LocalTime.parse("18:30:00")));
		
		if(!targetInZone)
			return "Извън работно време";
		
		for(Appointment app: appointments) {
			String[] splittedDate = app.getDate().split(" ");
			if(splittedDate[0].equals(splittedDateWanted[0])) {
				
				Boolean dateNotAvailable = ( 
					    target.isAfter(LocalTime.parse(splittedDate[1])) 
					    && target.isBefore(LocalTime.parse(addOneHour(app.getDate()))));
				
				if(dateNotAvailable) {
					return "Часът не е свободен";
				}
			}
		}
		
		return "OK";
	}
	
	public static String addOneHour(String date) throws ParseException {
		SimpleDateFormat formatter =new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");  
	    Date date1=formatter.parse(date);  
	    
	    Date newDate = DateUtils.addHours(date1, 1);
	    
	    String strDate = formatter.format(newDate);
	    
	    String[] splittedDate = strDate.split(" ");
	    
	    return splittedDate[1];
	}

	public static String checkIfConfirmed(String confirmation) {
		if("Не".equals(confirmation)) {
			return "Непотвърден час";
		}
		return "Потвърден час";
	}

}
