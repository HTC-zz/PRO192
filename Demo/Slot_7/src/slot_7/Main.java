/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot_7;

/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String[] args) {
        Rectangle re = new Rectangle();
        re.setLength(7);
        re.setWidth(5);
        System.out.println("re " + re.getLength() + " " + re.getWidth());
        Rectangle re1 = new Rectangle(10, 10);
        System.out.println("re1 " + re1.area());
    }
    
}
