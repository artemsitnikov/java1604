/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plant;

/**
 *
 * @author Lenovo
 */
public class Vegetable extends Plant  implements Peellable {
    @Override
    public double Peell(){
        Vegetable.weight = Vegetable.weight * 0.95;        
        Vegetable.peelled = true;
        System.out.println("очищенный овощ весит " + Vegetable.weight + ". очищен ли овощ? -" + Vegetable.peelled);
        return Vegetable.weight;
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
