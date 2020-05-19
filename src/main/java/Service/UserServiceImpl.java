package Service;

import Intefaces.FakeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

//this an annotation for repository class
@Service
public abstract class UserServiceImpl implements UserService {

    // FakeRepoInterface
    @Autowired
    private FakeRepoInterface fakeRepoInterface;

    // constructor parameter
    public UserServiceImpl(@Qualifier("fakeInterfaces")FakeRepoInterface fakeRepoInterface) {
        this.fakeRepoInterface = fakeRepoInterface;
    }

    //methods from the UserService Interface
    @Override
    public void addUser(long id, String name, String surname) {
        fakeRepoInterface.insertUser(id,name,surname);
    }

    @Override
    public void removeUser(long id) {
        fakeRepoInterface.deleteUser(id);

    }
    @Override
    @Cacheable("name")

    public String getUser(long id) {
        try
        {
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return fakeRepoInterface.findUserById(id);
    }

}