package view;

import controller.LoginController;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    public JTextField txtUser;
    public JPasswordField txtPass;
    public JButton btnLogin;

    public LoginFrame() {

        setTitle("Smart Complaint System - Login");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        txtUser = new JTextField();
        txtPass = new JPasswordField();
        btnLogin = new JButton("Login");

        panel.add(new JLabel("Username"));
        panel.add(txtUser);
        panel.add(new JLabel("Password"));
        panel.add(txtPass);

        add(panel, BorderLayout.CENTER);
        add(btnLogin, BorderLayout.SOUTH);

        // Controller
        new LoginController(this);

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}
