import java.util.Scanner;

/**
 * Runs a console-based shopping example, from product selection through payment
 * and order summary. made by kareem saleh
 */
public class OnlineShoppingSystem {

    /**
     * Creates the sample customer, product, and order, then handles the
     * shopping interaction with the user.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Set up the sample product and customer used in this shopping session.
        Product product =
                new Product(101,
                        "Laptop",
                        "Electronics",
                        3500,
                        20,
                        "Dell",
                        4.8);

        Customer customer =
                new Customer(1,
                        "Kareem",
                        "kareem@gmail.com",
                        "0123456789",
                        "Selangor",
                        "Gold",
                        5000);

        Order order =
                new Order();

        // Show the customer and product details before asking for a purchase.
        customer.displayCustomer();
        product.displayProduct();

        // Restrict the requested quantity to the product's available stock.
        int quantity = readIntInRange(
                sc, "Enter Quantity (1-" + product.getStockQuantity() + "): ",
                1, product.getStockQuantity());

        // Calculate and display the cost of the selected items.
        double total =
                order.calculateBill(product.getPrice(), quantity);

        System.out.println("Total Bill = RM" + total);

        // Apply free shipping when the purchase total exceeds RM 2,000.
        if(total > 2000) {
            System.out.println("You get free shipping!");
        } else {
            System.out.println("Shipping fee applies.");
        }

        System.out.println("\nPayment Methods");
        System.out.println("1. Cash");
        System.out.println("2. Credit Card");

        // Accept only one of the two listed payment choices.
        int choice = readIntInRange(sc, "Choose payment method (1-2): ", 1, 2);
        // Convert the numeric choice into a readable payment method name.
        String paymentMethod = choice == 1 ? "Cash" : "Credit Card";
        System.out.println(paymentMethod + " Selected");

        // Summarize the product, quantity, total, and chosen payment method.
        System.out.println("\nOrder Summary");
        System.out.println("Product: " + product.getProductName());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: RM" + total);
        System.out.println("Payment Method: " + paymentMethod);

        // Print one numbered line for every item in the order.
        for(int i = 1; i <= quantity; i++) {
            System.out.println("Item " + i);
        }

        // Release the input resource after the shopping interaction is complete.
        sc.close();
    }

    /**
     * Reads an integer from the user and repeats the prompt until it falls
     * within the inclusive minimum-to-maximum range.
     *
     * @param scanner input source used to read the user's response
     * @param prompt message shown before each input attempt
     * @param minimum smallest accepted integer
     * @param maximum largest accepted integer
     * @return the valid integer entered by the user
     * @throws IllegalStateException if the input source has no more lines
     */
    private static int readIntInRange(
            Scanner scanner, String prompt, int minimum, int maximum) {
        // Keep requesting input until a valid in-range integer is entered.
        while (true) {
            System.out.print(prompt);
            // Stop with an explicit error if the user input has ended.
            if (!scanner.hasNextLine()) {
                throw new IllegalStateException("No input was provided.");
            }

            String input = scanner.nextLine().trim();
            int value;
            // Convert the text to an integer and handle non-numeric input.
            try {
                value = Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a whole number.");
                // Skip range checking and ask for another input line.
                continue;
            }

            // Return the value only when it is inside the inclusive range.
            if (value >= minimum && value <= maximum) {
                return value;
            }

            // Explain the allowed range before the loop prompts again.
            System.out.println("Please enter a number from "
                    + minimum + " to " + maximum + ".");
        }
    }
}