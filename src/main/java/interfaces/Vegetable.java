/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
/**
 *
 * @author Lenovo
 */
public class Vegetable extends Plant  implements Peellable {
    @Override
    public double Peell(){
        weight = weight * 0.95;        
        peelled = true;
        System.out.println("очищенный овощ весит " + weight + ". очищен ли овощ? -" + peelled);
        return weight;
    }    
    public Vegetable(double weight, String color, boolean maturity, boolean condition, boolean peelled) {
        this.weight = weight;
        this.color = color;
        this.maturity = maturity;
        this.condition = condition;
        this.peelled = peelled;
    }
    
    public static void main(String[] args) {

        Vegetable potato = new Vegetable(2.00, "white", true, true, false);
        System.out.println("картошка нечищенная весит " + potato.weight + "; очищенa? " + potato.peelled);
        potato.Peell();
        
        Vegetable carrot = new Vegetable(1.00, "orange", true, true, false);
        System.out.println("морковь нечищенная весит " + carrot.weight + "; очищена? " + carrot.peelled);
        carrot.Peell();   
        
       // Vegetable[] trash = new Vegetable[4];


    }
}
