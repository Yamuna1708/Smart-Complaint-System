package model;



public class Complaint {
    private int id;
    private String category;
    private String description;
    private String status;

    public Complaint(int id, String category, String description, String status) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.status = status;
    }

    public int getId() { return id; }
    public String getCategory() { return category; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }

    public void setStatus(String status) {
        this.status = status;
    }
}

