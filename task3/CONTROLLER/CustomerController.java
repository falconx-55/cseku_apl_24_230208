package CONTROLLER;

import MODEL.Customer;
import VIEW.CustomerView;

public class CustomerController {
    private Customer customer;
    private CustomerView customerView;

    // Constructor
    public CustomerController(Customer customer, CustomerView customerView) {
        this.customer = customer;
        this.customerView = customerView;
    }

    // Display customer details
    public void showCustomerDetails() {
        customerView.displayCustomerInfo(customer);
    }


    public void updateCustomerAddress(String newAddress) {
        
    }

    public void updateCustomerPhoneNumber(String newPhoneNumber) {
      
    }
}
