/**
 * Stores order details, calculates an order bill, and can display the order
 * summary. make by kareem saleh
 */
public class Order {

    private int orderId;
    private String orderDate;
    private int quantity;
    private double totalAmount;
    private String paymentMethod;
    private String orderStatus;
    private String shippingAddress;

    /** Creates an order with default field values. */
    public Order() {
    }

    /** Creates an order and initializes all order details. */
    public Order(int orderId, String orderDate,
                int quantity, double totalAmount,
                String paymentMethod,
                String orderStatus,
                String shippingAddress) {

        this.orderId = orderId;
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
        this.orderStatus = orderStatus;
        this.shippingAddress = shippingAddress;
    }

    /** Returns this order's identifier. */
    public int getOrderId() {
        return orderId;
    }

    /** Updates this order's identifier. */
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    /** Returns the date this order was placed. */
    public String getOrderDate() {
        return orderDate;
    }

    /** Updates the date this order was placed. */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /** Returns the number of items in this order. */
    public int getQuantity() {
        return quantity;
    }

    /** Updates the number of items in this order. */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /** Returns the total amount recorded for this order. */
    public double getTotalAmount() {
        return totalAmount;
    }

    /** Updates the total amount recorded for this order. */
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    /** Returns the payment method recorded for this order. */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /** Updates the payment method recorded for this order. */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /** Returns the current status of this order. */
    public String getOrderStatus() {
        return orderStatus;
    }

    /** Updates the current status of this order. */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /** Returns the shipping address for this order. */
    public String getShippingAddress() {
        return shippingAddress;
    }

    /** Updates the shipping address for this order. */
    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * Calculates the cost of an order from the unit price and item quantity.
     *
     * @param price price of one item
     * @param quantity number of items being purchased
     * @return price multiplied by quantity
     */
    public double calculateBill(double price, int quantity) {
        return price * quantity;
    }

    /** Prints all stored order details. */
    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: RM" + totalAmount);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Shipping Address: " + shippingAddress);
    }
}