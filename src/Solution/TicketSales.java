package Solution;

import java.text.DecimalFormat;

// TicketSales class extends the abstract Tickets class and implements the print_tickets method
public class TicketSales extends Tickets
{
    // Constructor to initialize attributes by calling the super constructor
    public TicketSales(String customerName, String movieTitle, int customerAge, double price)
    {
        super(customerName, movieTitle, customerAge, price);
    }

    // Method to print ticket information, applying discount for customers 65 and older
    @Override
    public void print_tickets()
    {
        double discount = 0.0;                    // Initialize discount
        double finalCost;                          // Variable to store the final ticket price after discount
        DecimalFormat df = new DecimalFormat("#,###.00"); // Format for output with thousands separator and two decimals

        // Apply discount if customer is 65 or older
        if (customerAge >= 65)
        {
            discount = price * 0.10;              // 10% discount
        }
        finalCost = price - discount;             // Calculate final cost after discount

        // Print the ticket information with formatted values
        System.out.println("CUSTOMER: " + customerName);
        System.out.println("MOVIE: " + movieTitle);
        System.out.println("COST: R " + df.format(price));
        System.out.println("DISCOUNT: R " + df.format(discount));
        System.out.println("TOAL: R " + df.format(finalCost));
    }
}
