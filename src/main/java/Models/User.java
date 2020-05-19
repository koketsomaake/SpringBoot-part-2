package Models;

public class User {
// attributes for the user
    private long Id;
    private String name;
    private String surname;

    // constructor
    public User(long id, String name, String surname) {
        Id = id;
        this.name = name;
        this.surname = surname;
    }

    // Default constructor
    public User(){

    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



}
