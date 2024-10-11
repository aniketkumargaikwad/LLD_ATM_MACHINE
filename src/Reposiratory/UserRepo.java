package Reposiratory;

import Classes.User;
import Enums.Status;
import java.util.*;

public class UserRepo {
    private String password = "abc@123";
    private List<User> users = new ArrayList<User>(Arrays.asList(
            new User(1, "Raj", 1000, "Raj@1"),
            new User(2, "Sham", 1000, "Sham@2"),
            new User(3, "Ram", 1000, "Ram@3"),
            new User(4, "Suraj", 1000, "Suraj@4"),
            new User(5, "Tejas", 1000, "Tejas@5"),
            new User(6, "Ravi", 1000, "Ravi@6"),
            new User(7, "Kedar", 1000, "Kedar@7"),
            new User(7, "Viju", 1000, "Viju@8"),
            new User(7, "Rana", 1000, "Rana@9"),
            new User(7, "Rinku", 1000, "Rinku@10")
    ));

    public User autheticateUser(int id, String password){
        for(User user : users){
            if(user.getId() == id && Objects.equals(user.getPassword(), password)){
                return user;
            }
        }
        return null;
    }

    public User autheticateUser(int id){
        for(User user : users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public Status addUser(User newUser){
        this.users.add(newUser);
        return Status.sucess;
    }


}
