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
import java.util.Arrays;
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

        Vegetable potato = new Vegetable(2.00, "white", true, true, false);
        System.out.println("картошка нечищенная весит " + potato.weight + " очищенa? " + potato.peelled);
        System.out.println("картошка чищенная весит ");
        Peellable.Peell();
        
        Vegetable carrot = new Vegetable(1.00, "orange", true, true, false);
        System.out.println("морковь нечищенная весит " + carrot.weight + " очищена? " + carrot.peelled);
        System.out.println("морковь чищенная весит ");
        Peellable.Peell();   
        
        Vegetable[] trash = new Vegetable[4];
        trash[1] = potato;
        trash[2] = carrot;
        System.out.println(trash[1]);// выводится хрень - по-ходу текст ссылки на объект

    }
}
