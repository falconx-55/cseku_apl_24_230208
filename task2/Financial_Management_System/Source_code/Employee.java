public class Employee extends Person {
    private String employeeId;
    private String role;

    public Employee(String id, String name, String address, String employeeId, String role) {
        super(id, name, address);
        this.employeeId = employeeId;
        this.role = role;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getRole() {
        return role;
    }

    @Override
    public void displayInfo() {
       
    }
}
