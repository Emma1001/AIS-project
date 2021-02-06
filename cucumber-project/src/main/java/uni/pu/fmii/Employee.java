package uni.pu.fmii;


import java.util.*;

/**
 * 
 */
public class Employee {

    /**
     * Default constructor
     */
    public Employee() {
    }

    private String firstName;
    private String lastName;


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
     * @param appointment
     */
    public void addAppointment(Appointment appointment) {
        // TODO implement here
    }

    /**
     * @param client
     */
    public void addClient(Client client) {
        // TODO implement here
    }

    /**
     * @param procedure
     */
    public void addProcedure(Procedure procedure) {
        // TODO implement here
    }

}