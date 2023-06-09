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
public class Vase extends Item {
    private int height;
    private String material;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public Vase() {}
    public Vase (int height, String material) {
        this.height = height;
        this.material = material;
    }
    public void inputVase() {
        input();
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter height (greater than 0): ");
            int inputHeight = scanner.nextInt();
            if (inputHeight <= 0) {
                throw new IllegalArgumentException("Height must be greater than 0.");
            }            
            setHeight(inputHeight);
            System.out.print("Enter material: ");
            String inputMaterial = scanner.nextLine();            
            if (inputMaterial.isEmpty()) {
                throw new IllegalArgumentException("Material cannot be empty.");
            }            
            setMaterial(inputMaterial);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format for height.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public void outputVase() {
        output();
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }
}
