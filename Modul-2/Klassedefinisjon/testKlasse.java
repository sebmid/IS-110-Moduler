
/**
 * Write a description of class testKlasse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testKlasse
{
    private int x;
    
    public testKlasse(int y) 
    {
        x = y;
    }
    
    public void setX(int number)
    {
        x = number;
    }
    
    public int getX()
    {
        return x;
    }   
     
    public void higherOrLower18()
    {
        if(x >= 18) {
            System.out.println("number is ten or over");
        }
        else {
            System.out.println("number is under ten");
        }
    }
}
