/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author litong
 */
public class Candy extends DessertItem {

    private double weight;
    private int price;

    Candy(String name, double weight, int price) {
        super(name);
        this.weight = weight;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public int getCost() {
        double p = (double)(weight*price);
        return (int)Math.round(p);
    }
    
    @Override
    public String toString(){
        String s = String.format("%-25s\n", String.format("%.2f",weight)+" lbs. @ "+DessertShoppe.cents2dollarsAndCents(price)+" /lb.");
        s += String.format("%-25s %10s\n", this.getName(), DessertShoppe.cents2dollarsAndCents(this.getCost()));
        return s;
    }
    
}
