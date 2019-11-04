
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mattg
 */
public class MonthMain {
    public static void main(String[] args) {
        int monthNumber;
        String monthName;
        
        Month myMonth1 = new Month();
        Month myMonth2 = new Month(9);
        Month myMonth3 = new Month("June");
        
        myMonth1.setMonthNumber(13);
        System.out.println("monthNumber = 13. Result: " + myMonth1.getMonthNumber());
        myMonth1.setMonthNumber(5);
        System.out.println("monthNumber = 5. Result: " + myMonth1.getMonthNumber());
        
        System.out.println("myMonth2.getMonthName: " + myMonth2.getMonthName());
        
        System.out.println("myMonth3.getMonthNumber: " + myMonth3.getMonthNumber());
        
        System.out.println("myMonth1 == myMonth3? " + myMonth1.equals(myMonth3));
        System.out.println("myMonth1 > myMonth2? " + myMonth1.greaterThan(myMonth2));
        System.out.println("myMonth2 < myMonth3? " + myMonth2.lessThan(myMonth3));
        
               
        
        
    }    
}
