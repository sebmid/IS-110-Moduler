
/**
 * Write a description of class Bar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bar
{
    // instance variables - replace the example below with your own
    private int age;

    /**
     * Constructor for objects of class Bar
     */
    public Bar(int userAge)
    {
        // initialise instance variables
        age = userAge;
    }

    public int getAge()
    {
        return age;
    }
    
    public void over18()
    {
        if(age >= 18) {
            System.out.println("You are 18 or over");
        }
        else {
            System.out.println("You are not over 18");
        }
    }
}
