package GUI;

import BackEnd.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class LogInFrame extends JPanel {

    private JTextField _usernameField;
    private JPasswordField _passwordField;
    private final MainFrame _main;
    public LogInFrame(MainFrame main){
        _main = main;

        this.setSize(400,500);
        this.setLayout(new GridLayout(4,4,10,10));
        _usernameField = new JTextField();
        _passwordField = new JPasswordField();
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password");
        JButton LoginButton = new JButton("Login");
        LoginButton.addActionListener(main);

        this.add(usernameLabel);
        this.add(_usernameField);
        this.add(passwordLabel);
        this.add(_passwordField);
        this.add(LoginButton);

    }


    public LoginInfo getLogin(){
        return new LoginInfo(_usernameField.getText(), _passwordField.getPassword());
    }


}
