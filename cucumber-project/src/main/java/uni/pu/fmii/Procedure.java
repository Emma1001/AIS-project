package uni.pu.fmii;


import java.util.*;

/**
 * 
 */
public class Procedure {

    /**
     * Default constructor
     */
    public Procedure() {
    }

    private String name;
    private String details;
    public Set<Appointment> appointment;


    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
       this.name = name;
    }

    /**
     * @return
     */
    public String getDetails() {
        return details;
    }

    /**
     * @param details 
     * @return
     */
    public void setDetails(String details) {
       this.details = details;
    }

}