/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author litong
 */
public class IceCream extends DessertItem {

    private int price;
    public IceCream(String name, int price) {
        super(name);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   
    public int getCost() {
        double p = (double)(price);
        return (int)Math.round(p);
    }
    
   
    public String toString(){
        return String.format("%-25s %10s\n", this.getName(), DessertShoppe.cents2dollarsAndCents(this.getCost()));
    }
    
}
