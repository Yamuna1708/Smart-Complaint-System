package view;

import controller.AdminComplaintController;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class AdminComplaintFrame extends JFrame {

    public JTable table;
    public DefaultTableModel model;
    public JButton btnUpdate, btnDelete;

    public AdminComplaintFrame() {

        setTitle("Admin - Manage Complaints");
        setSize(700, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        model = new DefaultTableModel(
                new String[]{"ID", "Category", "Description", "Status"}, 0
        );

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        btnUpdate = new JButton("Update Status");
        btnDelete = new JButton("Delete Complaint");

        JPanel btnPanel = new JPanel();
        btnPanel.add(btnUpdate);
        btnPanel.add(btnDelete);

        add(scrollPane, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);

        new AdminComplaintController(this);

        setVisible(true);
    }
}
