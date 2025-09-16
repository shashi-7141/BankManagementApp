package Bankk.src;

public class DAO {
    private int accountId;
    private String name;
    private String email;
    private String phone;
    private double balance;

    // Constructor without ID (for new customers)
    public DAO(String name, String email, String phone, double balance) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.balance = balance;
    }

    // Constructor with ID (for existing customers)
    public DAO(int accountId, String name, String email, String phone, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.balance = balance;
    }

    // Getters and Setters
    public int getAccountId() { return accountId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public double getBalance() { return balance; }
}


