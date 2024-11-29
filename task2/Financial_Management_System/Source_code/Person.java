public abstract class Person {
    private String id;
    private String name;
    private String address;

    public Person(String id, String name, String address) {
  
    }
    
    public void setId(String id) {

    }

    public void setName(String name) {
 
    }

    public void setAddress(String address) {
        
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public abstract void displayInfo();
}
