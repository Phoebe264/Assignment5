/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author litong
 */
public class Sundae extends IceCream {

    private String topping;
    private int toppingPrice;
    public Sundae(String name, int price, String topping, int toppingPrice) {
        super(name, price);
        this.topping = topping;
        this.toppingPrice = toppingPrice;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public int getToppingPrice() {
        return toppingPrice;
    }

    public void setToppingPrice(int toppingPrice) {
        this.toppingPrice = toppingPrice;
    }
    
  
    @Override
    public int getCost() {
        double p = (double)(super.getCost() + toppingPrice);
        return (int)Math.round(p);
    }
    
   
    @Override
    public String toString(){
        String s = String.format("%-25s\n", topping+" Sundae with ");
        s += super.toString();
        return s;
    }
}
