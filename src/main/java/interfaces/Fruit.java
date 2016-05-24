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
public class Fruit extends Plant implements Peellable {
    @Override
    public double Peell(){
        weight = weight * 0.98;        
        peelled = true;
        System.out.println("очищенный фрукт весит " + weight + ". очищен ли фрукт? -" + peelled);
        return weight;
    }
    
    public Fruit(String name, double weight, String color, boolean maturity, boolean condition, boolean peelled) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.maturity = maturity;
        this.condition = condition;
        this.peelled = peelled;
    }
    public static void main(String[] args) {
  
        Fruit apple = new Fruit("яблоко", 100.00, "red", true, true, false);
        System.out.println("яблоко нечищенное весит " + apple.weight + "; очищен ли фрукт? " + apple.peelled);
        apple.Peell();
        
        Fruit pear = new Fruit("груша", 200.00, "green", true, true, false);
        System.out.println("груша нечищенная весит " + pear.weight + "; очищен ли фрукт? " + pear.peelled);
        pear.Peell();       

    }    
}
