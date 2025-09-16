package Bankk.src;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
    private final String URL = "jdbc:mysql://localhost:3306/bankdb";
    private final String USER = "root";     // your MySQL username
    private final String PASS = "password"; // your MySQL password

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    // ADD Customer
    public void addCustomer(DAO customer) {
        String sql = "INSERT INTO customers(name, email, phone, balance) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, customer.getName());
            ps.setString(2, customer.getEmail());
            ps.setString(3, customer.getPhone());
            ps.setDouble(4, customer.getBalance());
            ps.executeUpdate();
            System.out.println("✅ Customer Added Successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ All Customers
    public List<DAO> getAllCustomers() {
        List<DAO> list = new ArrayList<>();
        String sql = "SELECT * FROM customers";
        try (Connection conn = getConnection(); Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                DAO customer = new DAO(
                        rs.getInt("account_id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getDouble("balance")
                );
                list.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // UPDATE Balance
    public void updateBalance(int accountId, double newBalance) {
        String sql = "UPDATE customers SET balance = ? WHERE account_id = ?";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDouble(1, newBalance);
            ps.setInt(2, accountId);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("💰 Balance Updated!");
            } else {
                System.out.println("⚠️ Account not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE Customer
    public void deleteCustomer(int accountId) {
        String sql = "DELETE FROM customers WHERE account_id = ?";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, accountId);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("🗑 Customer Deleted!");
            } else {
                System.out.println("⚠️ Account not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

