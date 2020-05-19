package Intefaces;
import Models.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

//this an annotation for repository class
@Repository
public class FakeRepo implements FakeRepoInterface  {


    private static List<User> database = new ArrayList<>();

    //Methods from the FakeRepoInterface Interface
    @Override
    public void insertUser(long id, String name, String surname) {
        database.add(new User(id, name, surname));
        System.out.println(name + "Hello");

    }


    @Override
    public String findUserById(long id) {
        database.get((int) id);

        return null;
    }

    @Override
    public void deleteUser(long id) {
        database.remove(id);
    }


}