import java.util.Objects;
import java.util.ArrayList;


/**
 * Write a description of class Solution here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Solution
{
    // instance variables - replace the example below with your own
    private int x;
    private ArrayList<Double> temperatures;
    /**
     * Constructor for objects of class Solution
     */
    public Solution()
    {
        // initialise instance variables
        x = 0;
        
        ArrayList<Double> temperatures = new ArrayList<Double>();
        
        temperatures.add(33.5);
        temperatures.add(35.5);
        temperatures.add(40.5);
        temperatures.add(31.5);
        temperatures.add(45.5);
        temperatures.add(46.5);
        
        fever(temperatures);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void equal()
    {
        //Q24
        // (a)
        String obj1 = "Oliver";
        String obj2 = "Oliver";
        String obj3 = "John";
        //(b) 
        System.out.println(obj1.equals(obj2));
        //c
        System.out.println(obj1.equals(obj3));
    
    }
    //Q25
    private void fever(ArrayList<Double> temperatures){
        int count = 0;
        double max = 0;
        System.out.println("Nb of fever cases reported: " +count);
        System.out.println("Hight fever cases; " +max);
        }
    }

