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
public class Part1 {

    public static void main(String[] args) {
        boolean bool = false;
        do {            
            try {
                Scanner sc = new Scanner(System.in);
                int i; 
                System.out.print("Enter the number: ");
                i = sc.nextInt();
                if (i < 1 )
                    throw new Exception();
                System.out.println("The number is " + i);
                bool = false;
            } catch (Exception e) {
                System.err.println("The number is invalid");
                bool = true;
            }
        } while (bool);
            
    }   
}
