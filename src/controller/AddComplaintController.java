package controller;

import model.Complaint;
import service.ComplaintService;
import view.AddComplaintFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddComplaintController {

    AddComplaintFrame frame;
    ComplaintService service = new ComplaintService();

    public AddComplaintController(AddComplaintFrame frame) {
        this.frame = frame;
        frame.btnSubmit.addActionListener(new SubmitHandler());
    }

    class SubmitHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                int id = Integer.parseInt(frame.txtId.getText());
                String category = frame.cmbCategory.getSelectedItem().toString();
                String desc = frame.txtDescription.getText();

                if (desc.isEmpty()) {
                    JOptionPane.showMessageDialog(frame,
                            "Description cannot be empty");
                    return;
                }

                Complaint c = new Complaint(id, category, desc, "OPEN");
                service.addComplaint(c);

                JOptionPane.showMessageDialog(frame,
                        "✅ Complaint Added Successfully");

                frame.dispose();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame,
                        "❌ ID must be a number");
            }
        }
    }
}
