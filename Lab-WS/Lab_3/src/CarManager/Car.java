/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarManager;

/**
 *
 * @author Acer
 */
public class Car {
    private String colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean ParkingBrake;
    public void pressAcceleratorButton() {
        System.out.println("You have pressed the Accelerator button");
    }
    public void pressStartButton() {
        System.out.println("You have pressed the start button");
    }
    
    public void output() {
        System.out.println("Colour: " + colour);
        System.out.println("Engine Power: " + EnginePower);
        System.out.println("Convertible: " + Convertible);
        System.out.println("Parking Brake: " + ParkingBrake);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public void setEnginePower(int EnginePower) {
        this.EnginePower = EnginePower;
    }

    public boolean isConvertible() {
        return Convertible;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    public boolean isParkingBrake() {
        return ParkingBrake;
    }

    public void setParkingBrake(boolean ParkingBrake) {
        this.ParkingBrake = ParkingBrake;
    }
    public Car () {}
    public Car(String colour, int enginePower, boolean convertible, boolean parkingBrake) {
        this.colour = colour;
        this.EnginePower = enginePower;
        this.Convertible = convertible;
        this.ParkingBrake = parkingBrake;
    }

}
