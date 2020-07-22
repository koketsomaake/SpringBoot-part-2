package Models;

public class User {

    private long Id;
    private String name;
    private String surname;

    public User(long id, String name, String surname) {
        Id = id;
        this.name = name;
        this.surname = surname;
    }

    public User(){

    }

    public static String getName(String name) {
        return name;
    }

    public static String getSurname(String surname) {
        return surname;
    }



    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;

    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



}
