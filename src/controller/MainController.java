package controller;

import model.User;
import model.Complaint;
import service.UserService;
import service.ComplaintService;

import java.util.Scanner;

public class MainController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserService userService = new UserService();
        ComplaintService complaintService = new ComplaintService();

        System.out.println("=== LOGIN ===");
        System.out.print("Username: ");
        String uname = sc.nextLine();

        System.out.print("Password: ");
        String pass = sc.nextLine();

        User user = userService.login(uname, pass);

        if (user == null) {
            System.out.println("❌ Invalid login");
            return;
        }

        System.out.println("✅ Welcome " + user.getRole());

        if (user.getRole().equals("ADMIN")) {

            while (true) {
                System.out.println("\n--- ADMIN MENU ---");
                System.out.println("1. View All Complaints");
                System.out.println("2. Update Complaint Status");
                System.out.println("3. Delete Complaint");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");

                int ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        for (Complaint c : complaintService.getAllComplaints()) {
                            System.out.println(
                                    c.getId() + " | " +
                                            c.getCategory() + " | " +
                                            c.getDescription() + " | " +
                                            c.getStatus()
                            );
                        }
                        break;

                    case 2:
                        System.out.print("Enter Complaint ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("New Status: ");
                        String status = sc.nextLine();
                        complaintService.updateComplaintStatus(id, status);
                        System.out.println("✅ Updated");
                        break;

                    case 3:
                        System.out.print("Enter ID to delete: ");
                        complaintService.deleteComplaint(sc.nextInt());
                        System.out.println("🗑 Deleted");
                        break;

                    case 4:
                        System.exit(0);
                }
            }

        } else { // USER

            while (true) {
                System.out.println("\n--- USER MENU ---");
                System.out.println("1. Add Complaint");
                System.out.println("2. View Complaints");
                System.out.println("3. Exit");
                System.out.print("Enter choice: ");

                int ch = sc.nextInt();
                sc.nextLine();

                switch (ch) {
                    case 1:
                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Category: ");
                        String cat = sc.nextLine();
                        System.out.print("Description: ");
                        String desc = sc.nextLine();

                        complaintService.addComplaint(
                                new Complaint(id, cat, desc, "OPEN")
                        );
                        System.out.println("✅ Added");
                        break;

                    case 2:
                        for (Complaint c : complaintService.getAllComplaints()) {
                            System.out.println(c.getId() + " | " +c.getCategory() + " | " + c.getDescription());
                        }
                        break;

                    case 3:
                        System.exit(0);
                }
            }
        }
    }
}
