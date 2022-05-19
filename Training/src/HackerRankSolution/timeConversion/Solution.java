/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRankSolution.timeConversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author GLORY
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); //07:05:45PM
        DateFormat inFormat = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat outFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        try {
            date = inFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (date != null) {
            String myDate = outFormat.format(date);
            System.out.println(myDate);
        }
    }
}
