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
    public Vegetable() {
        
    }
    public Vegetable(double weight, String color, boolean maturity, boolean condition, boolean peelled) {
        this.weight = weight;
        this.color = color;
        this.maturity = maturity;
        this.condition = condition;
        this.peelled = peelled;
    }
    
    public static void main(String[] args) {
        //Vegetable[] = {Potato};
        Vegetable Potato =  new Vegetable(12.2, "white", true, true, false);
        System.out.println("картоха нечищенная весит " + Potato.weight + Potato.color);
        Vegetable Carrot =  new Vegetable(0.99, "orange", true, true, false);

        System.out.println("морковка нечищенная весит " + Carrot.weight + Carrot.color);// + Potato.color + Potato.maturity + Potato.condition + Potato.peelled);
        System.out.println(Potato.condition);//?че за хрень??
        System.out.println(Potato.weight);//?че за хрень??
    }
}
