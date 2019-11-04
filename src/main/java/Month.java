/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mattg
 */
public class Month {
    private int monthNumber;
    
    public Month() {
        this.monthNumber = 1;
    }
    
    public Month(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 12) {
            this.monthNumber = monthNumber;
        } else { 
            monthNumber = 1;
        }    
    }
    
    public Month (String monthName) {
        switch (monthName) {
            case "January": monthNumber = 1;
                    break;
            case "February": monthNumber = 2;
                    break;
            case "March": monthNumber = 3;
                    break;        
            case "April": monthNumber = 4;
                    break;
            case "May": monthNumber = 5;
                    break;        
            case "June": monthNumber = 6;
                    break;       
            case "July": monthNumber = 7;
                    break;        
            case "August": monthNumber = 8;
                    break;        
            case "September": monthNumber = 9;
                    break;        
            case "October": monthNumber = 10;
                    break;        
            case "November": monthNumber = 11;
                    break;        
            case "December": monthNumber = 12;
                    break; 
            default: monthNumber = 1;
                    break;
        }
    }
    
    public void setMonthNumber(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 12) {
            this.monthNumber = monthNumber;
        } else { 
            monthNumber = 1;
        }    
    }
    
    public int getMonthNumber() {
        return monthNumber; 
    }
    
    public String getMonthName() {
        switch (monthNumber) {
            case 1:  return "January";
            case 2:  return "February";
            case 3:  return "March";
            case 4:  return "April";
            case 5:  return "May";
            case 6:  return "June";
            case 7:  return "July";
            case 8:  return "August";
            case 9:  return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Not a month";
        }
    }
    
    @Override
    public String toString() {
        switch (monthNumber) {
            case 1:  return "January";
            case 2:  return "February";
            case 3:  return "March";
            case 4:  return "April";
            case 5:  return "May";
            case 6:  return "June";
            case 7:  return "July";
            case 8:  return "August";
            case 9:  return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Not a month";
        }
    }
    
    public boolean equals (Month myMonth) {
        if (this.monthNumber == myMonth.getMonthNumber()) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean greaterThan (Month myMonth) {
        if (this.monthNumber > myMonth.getMonthNumber()) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean lessThan (Month myMonth) {
        if (this.monthNumber < myMonth.getMonthNumber()) {
            return true;
        } else {
            return false;
        }
    }
}
