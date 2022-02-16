package org.example;

public class userService {
    boolean changePassword(String username, String passwd){
        userDB user =  new userDB();
        if (passwd.length() >= 8){
            return user.changePassword(username,passwd);
        }
        return false;
    }
}
