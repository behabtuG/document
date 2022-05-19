/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRankSolution.timeConversion;

/**
 *
 * @author GLORY
 */
// Java program to convert 12 hour
// format to 24 hour format
public class print24 {

    static void print24(String str) {
        // Get hours
        int h1 = (int) str.charAt(1) - '0';
        int h2 = (int) str.charAt(0) - '0';
        int hh = (h2 * 10 + h1 % 10);

        // If time is in "AM"
        if (str.charAt(8) == 'A') {
            if (hh == 12) {
                System.out.print("00");
                for (int i = 2; i <= 7; i++) {
                    System.out.print(str.charAt(i));
                }
            } else {
                for (int i = 0; i <= 7; i++) {
                    System.out.print(str.charAt(i));
                }
            }
        } // If time is in "PM"
        else {
            if (hh == 12) {
                System.out.print("12");
                for (int i = 2; i <= 7; i++) {
                    System.out.print(str.charAt(i));
                }
            } else {
                hh = hh + 12;
                System.out.print(hh);
                for (int i = 2; i <= 7; i++) {
                    System.out.print(str.charAt(i));
                }
            }
        }
    }

// Driver code
    public static void main(String[] args) {
        String str = "07:05:45PM";
        print24(str);
    }
}

// This code is contributed by Anant Agarwal.

