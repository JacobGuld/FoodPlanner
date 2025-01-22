package GUI;

import java.util.Arrays;

public class LoginInfo {
    public String username;
    public String password;

    public LoginInfo(String username, char[]password){
        this.username = username;
        this.password = new String(password);
    }
}
