package ca.sait.services;

import ca.servlets.models.User;

/**
 * Service provider for account
 * @author Qiang Xu
 */
public class AccountService {
    public AccountService(){
        
    }
    
    /**
     * Login a user
     * @param username Username
     * @param password Password
     * @return User instance if login credentials are correct, or null.
     */
    public User login(String username, String password){
        //if(username == null)
            //return null;
        
        if("abe".equals(username) && "password".equals(password)){
            User user = new User(username, password);
            return user;
        } else if ("barb".equals(username) && "password".equals(password)){
            User user = new User(username, password);
            return user;
        } else {
            return null;
        }
    }
}
