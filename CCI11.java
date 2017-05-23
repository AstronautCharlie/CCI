/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cci1.pkg1;

import java.util.Scanner;

/**
 *
 * @author v-trpea
 */
public class CCI11 {

    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        String input = scan.nextLine();
        while (input.equals("exit") == false) {
            int[] letterCount = new int[26];
            for (char c : input.toCharArray()) {
                letterCount[c - 'a'] += 1;
                if (letterCount[c - 'a'] > 1) {
                    System.out.println("False");
                    return;
                }
            }
            System.out.println("True");
            input = scan.nextLine(); 
        }
    }
    
}
