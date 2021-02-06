package uni.pu.fmii;


import java.util.*;

/**
 * 
 */
public class Appointment {

    /**
     * Default constructor
     */
    public Appointment() {
    }

    public Appointment(String date, int idProcedure) {
		this.date = date;
		this.idProcedure = idProcedure;
	}

	public Appointment(int idClient, int idProcedure, String date) {
		this.date = date;
		this.idProcedure = idProcedure;
		this.idClient = idClient;
	}

	private int idClient;
    private int idProcedure;
    private String date;
    private String status;
    public Client client;
    public Procedure procedure;

    /**
     * @return
     */
    public int getIdClient() {
        return idClient;
    }

    /**
     * @param idClient 
     * @return
     */
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    /**
     * @return
     */
    public int getIdProcedure() {
        return idProcedure;
    }

    /**
     * @param idProcedure 
     * @return
     */
    public void setIdProcedure(int idProcedure) {
      this.idProcedure = idProcedure;
    }

    /**
     * @return
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date 
     * @return
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status 
     * @return
     */
    public void setStatus(String status) {
       this.status = status;
    }

}