package view;
import view.ViewComplaintsFrame;


import javax.swing.*;

public class UserDashboard extends JFrame {

    public UserDashboard() {

        setTitle("User Dashboard");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton btnAdd = new JButton("Add Complaint");
        JButton btnView = new JButton("View Complaints");

        btnAdd.addActionListener(e -> new AddComplaintFrame());
        btnView.addActionListener(e -> new ViewComplaintsFrame());


        JPanel panel = new JPanel();
        panel.add(btnAdd);
        panel.add(btnView);

        add(panel);

        setVisible(true);
    }
}
