/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Item {
    private int value;
    private String creator;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    public Item (){}
    public Item (int value, String creator) {
        this.value = value;
        this.creator = creator;
    }
    public void output() {
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
    }
    public void input() {
        Boolean bool = true;
        int inValue;
        String inCreator;
        do {
            System.out.println("Enter value (>0): ");
            Scanner sc = new Scanner(System.in);
            inValue = sc.nextInt();
            if (inValue > 0){
                bool = false;
            }
        } while (bool);
        setValue(inValue);
        do {
            System.out.println("Enter creator: ");
            Scanner sc = new Scanner(System.in);
            inCreator = sc.nextLine();
            if (inCreator != ""){
                bool = false;
            }
        } while (bool);
        setCreator(inCreator);
    }
}
