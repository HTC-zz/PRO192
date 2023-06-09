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
public class Painting extends Item{
    private int height; 
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    public Painting() {}
    public Painting(int height, int width, boolean isWatercolour, boolean isFramed) {
        this.height = height;
        this.width = width;
        this.isFramed = isFramed;
        this.isWatercolour = isWatercolour;
    }
    public void inputPainting() {
        input();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter height (greater than 0): ");
            int inHeight = sc.nextInt();
            if (inHeight < 0) {
                throw new IllegalArgumentException("Height must be greater than 0.");
            }
            setHeight(inHeight);
            System.out.println("Enter width (greater than 0): ");
            int inWidth = sc.nextInt();
            if (inWidth < 0) {
                throw new IllegalArgumentException("Width must be greater than 0.");
            }
            setWidth(inWidth);
            System.out.print("Is it watercolour (true/false): ");
            boolean inputWatercolour = sc.nextBoolean();
            setIsWatercolour(inputWatercolour);
            System.out.print("Is it framed (true/false): ");
            boolean inputFramed = sc.nextBoolean();
            setIsFramed(inputFramed);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format for height or width.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public void outputPainting() {
        output();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Watercolour: " + isWatercolour);
        System.out.println("Framed: " + isFramed);
    }
}
