
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mattg
 */
public class LT_Main {
    public static void main(String[] args) {
        
        double length1;
        double width1;
        double area1;
        double length2;
        double width2;
        double area2;
        boolean result;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the length of the first tract. ");
            length1 = scan.nextDouble();
        System.out.println("Please enter the width of the first tract. ");
            width1 = scan.nextDouble();
        System.out.println("Please enter the length of the second tract. ");
            length2 = scan.nextDouble();
        System.out.println("Please enter the width of the second tract. ");
            width2 = scan.nextDouble();
            
        LandTract lt = new LandTract();
        area1 = lt.getArea1(length1, width1);
        area2 = lt.getArea2(length2, width2);
        System.out.println(lt.toString());
        result = lt.equals();
            System.out.println("Are the tracts equal? " + result);
    }
}
