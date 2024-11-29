public class Customer extends Person {
    private String phoneNumber;

    public Customer(String id, String name, String address, String phoneNumber) {
        super(id, name, address);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void displayInfo() {
       
    }
}
