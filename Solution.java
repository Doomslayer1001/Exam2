import java.util.Objects;
import java.util.ArrayList;
import java.util.Collections;

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
    public void fever(ArrayList<Double> temperatures){
        int count = 0;
        double max = 0;
        
        for (Double temp : temperatures){
            if (temp > 37.5){
                count++;
            }
            if(temp > max){
                max = temp;
            }
        }
        //Q26 - using Collection.max
        
        System.out.println("Hight fever cases(Collections.max): " + Collections.max(temperatures));
        
        //Q27 - USING Collection.sort
        Collections.sort(temperatures);
        System.out.println("Hight fever cases;(Collections.sort) " + temperatures.getLast());
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
        if (obj1.equals(obj2)){
            System.out.println("String are the same");
        }
        else{
            System.out.println("not the same");
        }
    }
    //Q25
    
    }

