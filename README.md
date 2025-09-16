# BankManagementApp
This is a Bank Management System built using Java, JDBC, and MySQL. It is a console-based application that lets users manage bank customers.  With this project, you can:  Add new customers with details like name, email, phone, and balance  View all customers in the database  Update a customer’s balance  Delete a customer using their account ID  


🚀 How to Run

#Clone this repository:

git clone https://github.com/<your-username>/BankManagementJDBC.git
cd BankManagementJDBC


#Import the project into IntelliJ IDEA / VS Code / Eclipse.

#Add the MySQL Connector JAR file (mysql-connector-j-8.3.0.jar) inside the lib/ folder.

#Update your MySQL username & password in CustomerDAO.java:

private final String USER = "root";     
private final String PASS = "your_password";


#Compile and Run:

javac -cp ".;lib/mysql-connector-j-8.3.0.jar" src/Bankk/*.java
java -cp ".;lib/mysql-connector-j-8.3.0.jar;src" Bankk.BankManagement

#📸 Example Run
--- Bank Management ---
1. Add Customer
2. View All Customers
3. Update Balance
4. Delete Customer
5. Exit
Enter choice: 1
Enter name: Aniket Nikam
Enter email: Aniket445@gmail.com
Enter phone: 9876543210
Enter balance: 5000
✅ Customer Added Successfully!

#🤝 Contribution
Feel free to fork this repo, raise issues, or contribute with PRs to improve the project.
