package view;

import controller.AddComplaintController;

import javax.swing.*;
import java.awt.*;

public class AddComplaintFrame extends JFrame {

    public JTextField txtId;
    public JComboBox<String> cmbCategory;
    public JTextArea txtDescription;
    public JButton btnSubmit;

    public AddComplaintFrame() {

        setTitle("Add Complaint");
        setSize(400, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(7, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        txtId = new JTextField();

        cmbCategory = new JComboBox<>();
        cmbCategory.addItem("Electricity");
        cmbCategory.addItem("Water");
        cmbCategory.addItem("Internet");
        cmbCategory.addItem("Other");

        txtDescription = new JTextArea(3, 20);
        txtDescription.setLineWrap(true);
        txtDescription.setWrapStyleWord(true);

        btnSubmit = new JButton("Submit Complaint");

        panel.add(new JLabel("Complaint ID"));
        panel.add(txtId);
        panel.add(new JLabel("Category"));
        panel.add(cmbCategory);
        panel.add(new JLabel("Description"));
        panel.add(new JScrollPane(txtDescription));

        add(panel, BorderLayout.CENTER);
        add(btnSubmit, BorderLayout.SOUTH);

        // Controller connection
        new AddComplaintController(this);

        setVisible(true);
    }
}
