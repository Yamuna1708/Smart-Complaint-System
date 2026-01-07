package service;

import dao.ComplaintDAO;
import model.Complaint;

import java.util.List;

public class ComplaintService {

    ComplaintDAO dao = new ComplaintDAO();

    public void addComplaint(Complaint c) {
        dao.addComplaint(c);
    }

    public List<Complaint> getAllComplaints() {
        return dao.getAllComplaints();
    }

    public void updateComplaintStatus(int id, String status) {
        dao.updateStatus(id, status);
    }

    public void deleteComplaint(int id) {
        dao.deleteComplaint(id);
    }
}
