package homework.lesson3;

public class Admin {
    private String name = "Aram";
    private int id = 1;
    private String password = "zxc123";

    public Admin() {

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin [name=" + name + ", id=" + id + ", password=" + password + "]";
    }
}
