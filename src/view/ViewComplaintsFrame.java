package view;

import controller.ViewComplaintsController;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewComplaintsFrame extends JFrame {

    public JTable table;
    public DefaultTableModel model;

    public ViewComplaintsFrame() {

        setTitle("View Complaints");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        model = new DefaultTableModel(
                new String[]{"ID", "Category", "Description", "Status"}, 0
        );

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane, BorderLayout.CENTER);

        // Controller call
        new ViewComplaintsController(this);

        setVisible(true);
    }
}
