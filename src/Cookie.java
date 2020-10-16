/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author litong
 */
public class Cookie extends DessertItem {

    private int number, price;
    Cookie(String name, int number, int price) {
        super(name);
        this.number = number;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public int getCost() {
        double p = (double)(price/12.0) * number;
        return (int)Math.round(p);
    }
    
    @Override
    public String toString(){
        String s = String.format("%-25s\n", number+" @ "+DessertShoppe.cents2dollarsAndCents(price)+" /dz.");
        s += String.format("%-25s %10s\n", this.getName(), DessertShoppe.cents2dollarsAndCents(getCost()));
        return s;
    }
    
}
