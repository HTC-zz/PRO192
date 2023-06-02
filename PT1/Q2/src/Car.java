/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Car {
    public String Maker;
    public int Price;

    public String getMaker() {
        return Maker;
    }

    public void setMaker(String maker) {
        this.Maker = maker;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        this.Price = price;
    }
    public String toString() {
        return Maker + "," + Price;
    }
}
