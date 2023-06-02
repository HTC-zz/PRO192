
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Tester {
    public static void main(String[] args) {
        Book obj1 = new Book();
        Scanner sc = new Scanner(System.in);
        String title;
        System.out.print("Enter title: ");
        title = sc.nextLine();
        obj1.setTitle(title);
        int price;
        System.out.print("Enter price: ");
        price = sc.nextInt();
        obj1.setPrice(price);
        boolean bool = false;
        do {            
            try {
                System.out.println("1. Test getTitle()");
                System.out.println("2. Test setPrice()");
                System.out.print("Enter TC (1 or 2): ");
                int choose;
                choose = sc.nextInt();
                if (choose != 1 && choose != 2) {
                    throw new Exception();
                }
                System.out.println("OUPUT:");
                if (choose == 1) {
                    System.out.println(obj1.getTitle());
                }
                else if (choose ==2) {
                    System.out.println(obj1.getPrice());
                }
                bool = false;
            } catch (Exception e) {
                System.out.println("Enter TC again (1 or 2): ");
                bool = true;
            }
        } while (bool);
    }
}
