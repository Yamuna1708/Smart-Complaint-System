# Smart Complaint System (Java Desktop Application)

## 📌 Project Description
The **Smart Complaint System** is a Java-based desktop application designed to manage user complaints efficiently.  
It allows users to register complaints and administrators to view, update, and manage complaints through a user-friendly GUI.

This project demonstrates **Core Java, Advanced Java (JDBC), Swing GUI, Collections, and MVC architecture**.

---

## 🛠 Technologies Used
- **Java (Core + Advanced)**
- **Swing & AWT** – GUI
- **JDBC** – Database connectivity
- **MySQL** – Database (via XAMPP)
- **Collections Framework**
- **MVC Architecture**
- **Git & GitHub**

---

## 🧱 Project Architecture (MVC)

SmartComplaintSystem
│
├── controller
│ └── MainController.java
│
├── model
│ └── Complaint.java
│
├── service
│ └── ComplaintService.java
│
├── dao
│ └── ComplaintDAO.java
│
├── view
│ ├── UserDashboard.java
│ ├── AdminDashboard.java
│ ├── AddComplaintForm.java
│ └── ViewComplaintsTable.java
│
└── util
└── DBConnection.java



---

## ✨ Features
### 👤 User
- Add new complaints
- View submitted complaints

### 🛠 Admin
- View all complaints
- Update complaint status
- Delete complaints

---

## 🗄 Database Details
- **Database Name:** `complaint_db`
- **Table:** `complaints` 

### Table Structure:
```sql
CREATE TABLE complaints (
    id INT PRIMARY KEY,
    category VARCHAR(100),
    description TEXT,
    status VARCHAR(20)
);


▶ How to Run the Project
1️⃣ Prerequisites

JDK installed

XAMPP (MySQL running)

Git installed

2️⃣ Clone Repository
git clone https://github.com/Yamuna1708/Smart-Complaint-System.git

3️⃣ Open Project

Open in IntelliJ / NetBeans / VS Code

Configure JDK

4️⃣ Run

Start MySQL using XAMPP

Run MainController.java


👩‍💻 Author

Yamuna C.B
MCA Graduate (2025)
GitHub: Yamuna1708




📜 License

This project is for educational purposes.
