
/**
 * Write a description of class PizzaOvn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PizzaOvn
{
    // instance variables - replace the example below with your own
    private Pizza bigPizza;
    private Boolean cooked;

    /**
     * Constructor for objects of class PizzaOvn
     */
    public PizzaOvn()
    {
        bigPizza = new Pizza("Pepperoni");
        cooked = false;
    }

    
    public void assemble()
    {
        bigPizza.assemblePizza();
    }
    
    public String getPizza()
    {
        return bigPizza.pizza;
    }
    
    public void assembleandcook()
    {
        assemble();
        cooked = true;
        System.out.println("The" + bigPizza.pizza + " is cooked");
    }
}
