package controller;

import model.Complaint;
import service.ComplaintService;
import view.AdminComplaintFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class AdminComplaintController {

    AdminComplaintFrame frame;
    ComplaintService service = new ComplaintService();

    public AdminComplaintController(AdminComplaintFrame frame) {
        this.frame = frame;
        loadComplaints();
        addActions();
    }

    private void loadComplaints() {
        DefaultTableModel model = frame.model;
        model.setRowCount(0);

        List<Complaint> list = service.getAllComplaints();

        for (Complaint c : list) {
            model.addRow(new Object[]{
                    c.getId(),
                    c.getCategory(),
                    c.getDescription(),
                    c.getStatus()
            });
        }
    }

    private void addActions() {

        frame.btnUpdate.addActionListener(e -> {
            int row = frame.table.getSelectedRow();

            if (row == -1) {
                JOptionPane.showMessageDialog(frame, "Select a row first");
                return;
            }

            int id = (int) frame.model.getValueAt(row, 0);
            String newStatus = JOptionPane.showInputDialog(
                    frame,
                    "Enter new status (OPEN/CLOSED)"
            );

            if (newStatus != null && !newStatus.isEmpty()) {
                service.updateComplaintStatus(id, newStatus);
                loadComplaints();
                JOptionPane.showMessageDialog(frame, "✅ Status Updated");
            }
        });

        frame.btnDelete.addActionListener(e -> {
            int row = frame.table.getSelectedRow();

            if (row == -1) {
                JOptionPane.showMessageDialog(frame, "Select a row first");
                return;
            }

            int id = (int) frame.model.getValueAt(row, 0);

            int confirm = JOptionPane.showConfirmDialog(
                    frame,
                    "Are you sure to delete?",
                    "Confirm",
                    JOptionPane.YES_NO_OPTION
            );

            if (confirm == JOptionPane.YES_OPTION) {
                service.deleteComplaint(id);
                loadComplaints();
                JOptionPane.showMessageDialog(frame, "🗑 Deleted");
            }
        });
    }
}
