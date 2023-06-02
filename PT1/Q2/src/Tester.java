
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
        SpecCar obj = new SpecCar();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maker: ");
        String maker = sc.nextLine();
        obj.setMaker(maker);
        System.out.print("Enter price: ");
        int price = sc.nextInt();
        obj.setPrice(price);
        System.out.print("Enter type: ");
        int type = sc.nextInt();
        obj.setType(type);
        boolean bool = false;
        do {
            try {
                System.out.println("1. Test toString(): ");
                System.out.println("2. Test setData(): ");
                System.out.println("3. Test getValue");
                System.out.print("Enter TC (1, 2, 3): ");
                int choose = sc.nextInt();
                if (choose != 1 && choose != 2 && choose != 3) {
                    throw new Exception();
                }
                System.out.println("OUTPUT:");
                if(choose == 1) {
                    System.out.println(obj.toString());
                    System.out.println(obj.tostring());
                }
                else if (choose == 2) {
                    System.out.println(obj.setData());
                }
                else 
                    System.out.println(obj.getValue());
                bool = false;
            } catch (Exception e) {
                System.out.println("Enter again: ");
                bool = true;
            }
        } while (bool);
        
    }
}
