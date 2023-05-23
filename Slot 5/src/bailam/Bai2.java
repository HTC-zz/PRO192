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
public class Bai2 {
//    public static void input () {
//        Scanner sc = new Scanner(System.in);
//        int n;
//        System.out.println("Nhap N: ");
//        n = sc.nextInt();
//        int a[] = new int [n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("a[" + i + "] =");
//            a[i] = sc.nextInt();
//        }
//    }
    public static void out (int a[]) {
        System.out.print("Cac phan tu cua mang: ");
        for (int i = 0; i < a.length; i++){
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }
    public static void sort (int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] và arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
        }
        System.out.print("Sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }                
        System.out.println();
    }
    public static void max (int arr[]) {
        int max = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max: " + max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap N: ");
        n = sc.nextInt();
        int a[] = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] =  ");
            a[i] = sc.nextInt();
        }
        sort(a);       
        out (a);
        max (a);
    }
}
