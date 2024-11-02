package Solution;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Movie_Tickets
{
    public static void main(String[] args)
    {
        // Create Scanner for user input
        try (Scanner scanner = new Scanner(System.in))
        {
            // Prompt and capture user input for customer name
            System.out.print("Enter the customer name: ");
            String customerName = scanner.nextLine();

            // Prompt and capture user input for movie title
            System.out.print("Enter the movie: ");
            String movieTitle = scanner.nextLine();

            int customerAge = 0;
            double price = 0.0;

            try
            {
                // Prompt and capture user input for customer age
                System.out.print("Enter the customer age: ");
                customerAge = scanner.nextInt();
                
                // Prompt and capture user input for movie price
                System.out.print("Enter the movie cost: ");
                price = scanner.nextDouble();
            }
            catch (InputMismatchException e)
            {
                // Handle incorrect input for integer and double fields
                System.out.println("Invalid input. Please enter numeric values for age and price.");
                return; // Exit the program due to invalid input
            }

            // Instantiate TicketSales with the captured input
            TicketSales ticket = new TicketSales(customerName, movieTitle, customerAge, price);

            // Print the ticket details, including discount if applicable
            ticket.print_tickets();
        }
        catch (Exception e)
        {
            // Handle any unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
