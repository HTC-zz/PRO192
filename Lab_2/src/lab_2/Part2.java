/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Part2 {
    public static void main(String[] args) {
        boolean bool = false;
        do {            
            try {
                Scanner sc = new Scanner(System.in);
                String s;
                String pattern = "SE.*[0-9]";
                System.out.print("Enter the string: ");
                s = sc.nextLine();
                if (! s.matches("SE.*[0-9]")) {
                    throw new Exception();
                }
                System.out.println("The string is " + s);
                bool = false;
            } catch (Exception e) {
                System.err.println("The string is invalid");
                bool = true;
            }
        } while (bool);
    }
}
