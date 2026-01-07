package controller;

import model.Complaint;
import service.ComplaintService;
import view.ViewComplaintsFrame;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ViewComplaintsController {

    ViewComplaintsFrame frame;
    ComplaintService service = new ComplaintService();

    public ViewComplaintsController(ViewComplaintsFrame frame) {
        this.frame = frame;
        loadComplaints();
    }

    private void loadComplaints() {

        DefaultTableModel model = frame.model;
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
}
