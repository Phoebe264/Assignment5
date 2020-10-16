/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author litong
 */
public class DessertShoppe {
    
    public static final double TAX_RATE = 0.065;
    public static final String STORE_NAME = "M & M Dessert Shoppe";
    public static final double PER_LBS = 1.33;
    
    
    public static String cents2dollarsAndCents(int cents){
        double dollars = (double)cents/100.0;
        return String.format("%.2f", dollars);
    }
    
}
