package controller;

import model.User;
import service.UserService;
import view.AdminDashboard;
import view.LoginFrame;
import view.UserDashboard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {

    LoginFrame frame;
    UserService service = new UserService();

    public LoginController(LoginFrame frame) {
        this.frame = frame;
        frame.btnLogin.addActionListener(new LoginHandler());
    }

    class LoginHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String username = frame.txtUser.getText();
            String password = new String(frame.txtPass.getPassword());

            User user = service.login(username, password);

            if (user == null) {
                JOptionPane.showMessageDialog(frame,
                        "Invalid Login",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                frame.dispose();

                if (user.getRole().equals("ADMIN")) {
                    new AdminDashboard();
                } else {
                    new UserDashboard();
                }
            }
        }
    }
}

