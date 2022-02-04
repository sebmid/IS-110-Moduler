
/**
 * Write a description of class Pizza here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pizza
{
    // instance variables - replace the example below with your own
    private String topping;
    public String pizza;

    /**
     * Constructor for objects of class Pizza
     */
    public Pizza(String topping)
    {
        // initialise instance variables
        this.topping = topping;
    }

    public void assemblePizza()
    {
        pizza = topping + " pizza";
    }
    
    public String getPizza()
    {
        return pizza;
    }
}
