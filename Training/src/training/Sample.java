/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;
//<editor-fold defaultstate="collapsed" desc="Imports">

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import javax.imageio.ImageIO;
//</editor-fold >

/**
 *
 * @author dell
 */
public class Sample {
//<editor-fold defaultstate="collapsed" desc="unknown">
/*
     public Sample(int a, int b, boolean aa) {
     }

     public static void main(String[] args) {
     Sample d, e;
     /// d=new Sample();
     Sample sam = new Sample(1, 2, true);
     System.out.println("sam" + sam);

     }
     */

    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Right Angled Triangle ">
    /*
     public static void main(String args[]) {
     for (int i = 0; i <= 5; i++) {
     for (int j = 0; j <= i; j++) {
     System.out.print(" * ");
     }
     System.out.println(" ");
     }
     }
     */
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Right Angled Triangle">
    /*
     public static void main(String args[]) {
     Sample.capture();
     }
     public static void capture() {
     try {
     Robot robot = new Robot();
     Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
     BufferedImage img = robot.createScreenCapture(new Rectangle(size));
     File save_path = new File(
     "C:/Users/Pictures/screenshot.jpg");
     // The image will be stored in the above mentioned location
     ImageIO.write(img, "JPG", save_path);

     } catch (Exception e) {
     e.printStackTrace();
     }
     }
     */
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Harmonic-Series Value ">  
   /*
     public static void main(String args[]) throws Exception {
     BufferedReader keyboard = new BufferedReader(new InputStreamReader(
     System.in));
     System.out.println("Enter Number :");
     int num = Integer.parseInt(keyboard.readLine());
     double result = 0.0;
     while (num > 0) {
     result = result + (double) 1 / num;
     num--;
     }
     System.out.println("Output of Harmonic Series is " + result);
     }
     */
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Diamond Shape">  
    /*
     public static void main(String[] args) {
     StringBuffer diamond = new StringBuffer();
     for (int i = 0; i < 10; i++) {
     for (int j = i; j < 10; j++) {
     diamond.append(" ");
     }
     for (int k = 0; k < i; k++) {
     diamond.append("* ");
     }
     diamond.append("\n");
     }
     for (int i = 10; i > 0; i--) {
     for (int j = i; j < 10; j++) {
     diamond.append(" ");
     }
     for (int k = 0; k < i; k++) {
     diamond.append("* ");
     }
     diamond.append("\n");
     }
     System.out.println(diamond);
     }
     */
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Christmas Tree Pattern"> 
//    public class ChristmasTreePattern
//{
    /*
     public static void main(String... arg) {
     drawChristmasTree(6);
     }

     private static void drawChristmasTree(int n) {
     for (int i = 0; i < n; i++) {
     triangle(i + 1, n);
     }
     }

     private static void triangle(int n, int max) {
     for (int i = 0; i < n; i++) {
     for (int j = 0; j < max - i - 1; j++) {
     System.out.print(" ");
     }

     for (int j = 0; j < i * 2 + 1; j++) {
     System.out.print("X");
     }

     System.out.println("");
     }
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Prime Numbers From 1 to 100 "> 
//    public static void main(String[] args) {
//        for (int i = 1; i < 100; i++) {
//            boolean isPrime = true;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                System.out.print(i + " ");
//            }
//        }
//    }
    //</editor-fold>
}
