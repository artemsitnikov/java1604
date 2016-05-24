/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class Fruit extends Plant implements Peellable {
    @Override
    public double Peell(){
        weight = weight * 0.98;        
        peelled = true;
        System.out.println("в результате очистки получаем: ");
//        System.out.println("очищенный фрукт весит " + weight + ". очищен ли фрукт? -" + peelled);
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
    @Override
    public String toString(){
        return name + ", вес: " + weight + ", цвет: " + color + ", зрелось: " + maturity + ", кондиция: " + condition + ", очищен: " + peelled;
    }
    public static void main(String[] args) {
  
        Fruit apple = new Fruit("яблоко", 100.00, "red", true, true, false);
        //System.out.println("яблоко нечищенное весит " + apple.weight + "; очищен ли фрукт? " + apple.peelled);
        System.out.println(apple);
        apple.Peell();
        System.out.println(apple);
        
        Fruit pear = new Fruit("груша", 200.00, "green", true, true, false);
        //System.out.println("груша нечищенная весит " + pear.weight + "; очищен ли фрукт? " + pear.peelled);
        System.out.println(pear);
        pear.Peell();       
        System.out.println(pear);
        
        Fruit banana = new Fruit("банан", 300, "yellow", false, true, false);
        System.out.println(banana);
        banana.Peell();
        System.out.println(banana);
        Fruit orange = new Fruit("апельсин", 400, "orange", true, false, false);
        System.out.println(orange);
        orange.Peell();
        System.out.println(orange);


    }    
}
