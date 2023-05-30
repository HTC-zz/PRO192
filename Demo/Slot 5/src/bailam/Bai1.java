/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bailam;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        System.out.println("Cac so chan la (for): ");
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(" " + a[i]);
            }
        }
        int i = 0;
        System.out.println("Cac so chan la (while): ");
        while (i < 10) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
            i++;
        }
    }
}
