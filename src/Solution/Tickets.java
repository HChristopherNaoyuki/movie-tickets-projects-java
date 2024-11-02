package Solution;

// Abstract class Tickets implementing the iTickets interface
public abstract class Tickets implements iTickets
{
    protected String customerName;    // Customer's name
    protected String movieTitle;      // Title of the movie
    protected int customerAge;        // Customer's age
    protected double price;           // Price of the movie ticket

    // Constructor to initialize customer details
    public Tickets(String customerName, String movieTitle, int customerAge, double price)
    {
        this.customerName = customerName;
        this.movieTitle = movieTitle;
        this.customerAge = customerAge;
        this.price = price;
    }

    // Getter for customerName
    public String getCustomerName() 
    { 
        return customerName; 
    }

    // Getter for movieTitle
    public String getMovieTitle() 
    { 
        return movieTitle; 
    }

    // Getter for customerAge
    public int getCustomerAge() 
    { 
        return customerAge; 
    }

    // Getter for price
    public double getPrice() 
    { 
        return price; 
    }
}
