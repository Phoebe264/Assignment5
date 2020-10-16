/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author litong
 */
public abstract class DessertItem {
    
    String name;
    public DessertItem(){
        
    }
    
    public DessertItem(String name){
        this.name = name;
    }
    
    public final String getName(){
        return this.name;
    }
    
    public abstract int getCost();
    
    @Override
    public String toString(){
        return "";
    }
    
}
