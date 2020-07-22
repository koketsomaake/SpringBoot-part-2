package Intefaces;

import Models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class FakeRepo implements FakeRepoInterface  {

    private static final ArrayList<User> database = new ArrayList<>();

    @Override
    public String insertUser(long id, String name, String surname) {
        database.add(new User(id, name, surname));
        return name +  "entered";
    }

    @Override
    public String findUserById(long id) {
        for (User ignored: database){
            return  "Hello " + User.getName("koketso");
        }
        return "Hello " + User.getName("ktsthedj");
    }

    @Override
    public String deleteUser(long id) {
        database.remove(new User(id, "tsh", ""));
        return User.getName("kts ") + "removed";
    }
}