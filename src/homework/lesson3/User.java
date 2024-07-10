package homework.lesson3;

public class User {
    private String name;
    private int id;
    private String contactNumber;

    public User() {

    }

    public User( int id, String name, String contactNumber) {
        this.name = name;
        this.id = id;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "\n" + "User's Name: " + name +"\n" + "ID: " + id + "\n" + "Contact Number: " + contactNumber ;
    }
}
