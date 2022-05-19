/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

/**
 *
 * @author dell
 */
//public class behabtu{
//<editor-fold defaultstate="collapsed" desc="composition">
    /*
 private int day;
 private int month;
 private int year;

 public behabtu(int d, int m, int y) {//behabtu constructor with 3 varialble
 day = d;
 month = m;
 year = y;
 System.out.printf("the contractor for this is %s\n", this);//this is a reference this can say array
 }

 public String toString() {
 return String.format("%d/%d/%d", day, month, year);
 }
 */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Polymorphism">
public class behabtu extends book {
// can override method here
    public void reading() {
        System.out.println("behabtu reading make perfect");
    }
}
 //</editor-fold>
