/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mattg
 */
public class LandTract {
    
    private double area1;
    private double area2;
    
    public double getArea1(double length1, double width1) {
        area1 = length1 * width1;
        return area1;
    }
    
    public double getArea2(double length2, double width2) {
        area2 = length2 * width2;
        return area1;
    }
    
    @Override
    public String toString() {
        return "Area of tract 1: " + String.format("%,.2f", area1) + "\n" + 
               "Area of tract 2: " + String.format("%,.2f", area2); 
    }
    
    public boolean equals() {
        if (area1 == area2) {
            return true;
        } else {
            return false;
        }
    }
}
