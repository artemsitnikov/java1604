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
public class Fruit extends Plant implements Peellable {
    public Fruit() {
        
    }
    public Fruit(double weight, String color, boolean maturity, boolean condition, boolean peelled) {
        this.weight = weight;
        this.color = color;
        this.maturity = maturity;
        this.condition = condition;
        this.peelled = peelled;
    }
    public static void main(String[] args) {
        {Fruit apple = new Fruit(5.07, "red", true, true, false);
        System.out.println("яблоко нечищенное весит " + apple.weight + " очищенo? " + apple.peelled);
        System.out.println("яблоко чищенное весит ");
        Peellable.Peell();}
        
        {Fruit pear = new Fruit(8.11, "green", true, true, false);
        System.out.println("груша нечищенная весит " + pear.weight + " очищена? " + pear.peelled);
        System.out.println("груша чищенная весит ");
        Peellable.Peell();}        

    }    
}
