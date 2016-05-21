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
        Fruit.weight = Fruit.weight * 0.98;        
        Fruit.peelled = true;
        System.out.println("очищенный фрукт весит " + Fruit.weight + ". очищен ли фрукт? -" + Fruit.peelled);
        return Fruit.weight;
    }
    
    public Fruit(double weight, String color, boolean maturity, boolean condition, boolean peelled) {
        this.weight = weight;
        this.color = color;
        this.maturity = maturity;
        this.condition = condition;
        this.peelled = peelled;
    }
    public static void main(String[] args) {
  
        Fruit apple = new Fruit(100.00, "red", true, true, false);
        System.out.println("яблоко нечищенное весит " + apple.weight + "; очищен ли фрукт? " + apple.peelled);
        apple.Peell();
        
        Fruit pear = new Fruit(200.00, "green", true, true, false);
        System.out.println("груша нечищенная весит " + pear.weight + "; очищен ли фрукт? " + pear.peelled);
        pear.Peell();       
        
    }    
}
