package Controllers;

import Models.User;
import java.util.ArrayList;

public class LoginController {

    ArrayList<User> userDB;
    public LoginController() {
        userDB = new ArrayList<>();
        loadLoginInfo();
    }
    final void loadLoginInfo() {
        userDB.add(new User("kasun", "123", "rider"));
        userDB.add(new User("dasun", "456", "banker"));
        userDB.add(new User("joy", "789", "bikerider"));
    }
    public User checkUser(String user)
    {
        for(User u:userDB)
        {
           if(u.getUserName().equals(user))
           {
              return u;               
           }
        }        
        return null;        
    }    
}
