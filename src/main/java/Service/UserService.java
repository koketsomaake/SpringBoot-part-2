package Service;

public interface UserService {

    //Adding a person as a new User on the database
    void addUser(long id, String name, String surname);


    //removing a person as a User on the database
    void removeUser(long id);

    //searching for a person on the database
    String getUser(long id) throws InterruptedException;

    String User(long id);
}