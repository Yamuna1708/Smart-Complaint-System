package view;

import javax.swing.*;

public class AdminDashboard extends JFrame {

    public AdminDashboard() {

        setTitle("Admin Dashboard");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton btnManage = new JButton("Manage Complaints");

        // 👉 Open Admin Complaint JTable screen
        btnManage.addActionListener(e -> new AdminComplaintFrame());

        JPanel panel = new JPanel();
        panel.add(btnManage);

        add(panel);

        setVisible(true);
    }
}
