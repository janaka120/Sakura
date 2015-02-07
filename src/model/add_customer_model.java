/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author janaka
 */


public class add_customer_model{
    private String custID;
    private String custName;
    private String custAddress;
    private String custContect;

    public add_customer_model() {
    }

    public add_customer_model(String custID, String custName, String custAddress, String custContect) {
        this.custID = custID;
        this.custName = custName;
        this.custAddress = custAddress;
        this.custContect = custContect;
    }
    
    
    //constractor overload 

    /**
     * @return the custID
     */
    public String getCustID() {
        return custID;
    }

    /**
     * @param custID the custID to set
     */
    public void setCustID(String custID) {
        this.custID = custID;
    }

    /**
     * @return the custName
     */
    public String getCustName() {
        return custName;
    }

    /**
     * @param custName the custName to set
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * @return the custAddress
     */
    public String getCustAddress() {
        return custAddress;
    }

    /**
     * @param custAddress the custAddress to set
     */
    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    /**
     * @return the custContect
     */
    public String getCustContect() {
        return custContect;
    }

    /**
     * @param custContect the custContect to set
     */
    public void setCustContect(String custContect) {
        this.custContect = custContect;
    }
   
   
}
