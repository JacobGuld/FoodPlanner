package GUI;

import BackEnd.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class MainFrame extends JFrame implements ActionListener {
    private Controller controller;
    private LogInFrame logInPane;
    public MainFrame(){
        controller = new Controller();
        logInPane = new LogInFrame(this);
        this.setSize(500, 200);
        this.setLayout(new BorderLayout(10, 10));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(logInPane);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "Login" -> {
                LoginInfo login = logInPane.getLogin();
                if (controller.handleLogin(login)){
                    System.out.println("User: " + login.username + " password: " + login.password);
                };
            }

        }
    }
}
