/**
 * Stores a customer's contact, membership, and wallet information and can
 * display the customer's details.
 */
public class Customer {

    private int customerId;
    private String customerName;
    private String email;
    private String phone;
    private String address;
    private String membershipLevel;
    private double walletBalance;

    /** Creates a customer with default field values. */
    public Customer() {
    }

    /**
     * Creates a customer and initializes all customer details.
     */
    public Customer(int customerId, String customerName,
                    String email, String phone,
                    String address, String membershipLevel,
                    double walletBalance) {

        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.membershipLevel = membershipLevel;
        this.walletBalance = walletBalance;
    }

    /** Returns this customer's identifier. */
    public int getCustomerId() {
        return customerId;
    }

    /** Updates this customer's identifier. */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    /** Returns this customer's name. */
    public String getCustomerName() {
        return customerName;
    }

    /** Updates this customer's name. */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /** Prints the customer's contact, membership, and wallet details. */
    public void displayCustomer() {
        System.out.println("Customer: " + customerName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Membership Level: " + membershipLevel);
        System.out.println("Wallet Balance: RM" + walletBalance);
    }
}