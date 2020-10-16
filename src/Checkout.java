/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author litong
 */
import java.util.ArrayList;


public class Checkout {

    private ArrayList<DessertItem> list;
    public Checkout(){
        list = new ArrayList<>();
    }
    
    public void enterItem(DessertItem item) {
        list.add(item);
    }

    public int numberOfItems() {
        return list.size();
    }

    public int totalTax() {
        int cost = this.totalCost();
        double tax = (cost * DessertShoppe.TAX_RATE);
        return (int)Math.round(tax);
    }

    public int totalCost() {
        int total = 0;
        for (DessertItem item : list) {
            total += item.getCost();
        }
        return total;
    }

    public void clear() {
        list.clear();
    }
    
    @Override
    public String toString(){
        String s = "\t"+DessertShoppe.STORE_NAME+"\n";
        s += "\t"+"--------------------\n";
        for (DessertItem item : list) {
            s += item.toString();
        }
        s += "\n";
        s += String.format("%-26s%10s\n", "Total Tax",DessertShoppe.cents2dollarsAndCents(totalTax()));
        s += String.format("%-26s%10s\n", "Total Cost",DessertShoppe.cents2dollarsAndCents(totalCost()+totalTax()));
        return s;
    }
}

