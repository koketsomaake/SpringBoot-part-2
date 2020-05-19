package Intefaces;

public interface FakeRepoInterface {

    //method used to insert a person's information
    void insertUser(long id,String name,String surname);

    //method used to find a person's information by ID
    String findUserById(long id);

    //method used to delete a person's information
    void deleteUser(long id);




}