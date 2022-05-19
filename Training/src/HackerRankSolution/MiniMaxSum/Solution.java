package HackerRankSolution.MiniMaxSum;

import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author GLORY
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] m = new long[5];
        for (int i = 0; i < 4; i++) {
            m[i] = in.nextLong();
        }
        Arrays.sort(m);
        long x = 0;
        long y = 0;
        for (int i = 0; i < 4; i++) {
            x += m[i];
        }
        for (int i = 1; i < 5; i++) {
            y += m[i];
        }
        System.out.println(x + " " + y);
    }
}
