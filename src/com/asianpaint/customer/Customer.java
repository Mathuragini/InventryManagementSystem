package com.asianpaint.customer;
/**
 *
 * @author Mathuragini
 */
public class Customer {
    
    //Declare varaiables for customer class
    private int customerId;
    private String customerName;
    private int tpNumber;
    private String address;
    private String email;
      
    //Create parametrized constructor for customer class
    public Customer(int customerId, String customerName, String address, int tpNumber, String email) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.tpNumber = tpNumber;
        this.address = address;
        this.email = email;
    }
    //Generate getters for the customer class varaiables
    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getTpNumber() {
        return tpNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
    
    
}
