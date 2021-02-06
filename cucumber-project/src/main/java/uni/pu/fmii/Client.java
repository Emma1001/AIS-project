package uni.pu.fmii;


import java.util.*;

/**
 * 
 */
public class Client {

    /**
     * Default constructor
     */
    public Client() {
    }

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Set<Appointment> appointments = new HashSet<Appointment>();
    /**
     * 
     */
    public Set<Appointment> appointment;


    /**
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName 
     * @return
     */
    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }

    /**
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName 
     * @return
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email 
     * @return
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone 
     * @return
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return
     */
    public Set<Appointment> getAppointments() {
        return appointments;
    }

    /**
     * @param appointment
     */
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

}