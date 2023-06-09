package DTO;
import java.util.Scanner;

public class Statue extends Item {
    private int weight;
    private String colour;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Statue() {
    }

    public Statue(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public void inputStatue() {
        input();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter weight (greater than 0): ");
            int inputWeight = Integer.parseInt(scanner.nextLine());
            if (inputWeight <= 0) {
                throw new IllegalArgumentException("Weight must be greater than 0.");
            }
            setWeight(inputWeight);

            System.out.print("Enter colour: ");
            String inputColour = scanner.nextLine();
            if (inputColour.isEmpty()) {
                throw new IllegalArgumentException("Colour cannot be empty.");
            }
            setColour(inputColour);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format for weight.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public void outputStatue() {
        output();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }
}
