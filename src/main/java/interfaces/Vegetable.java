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
        System.out.println("в результате очистки получаем: ");
        return weight;
    }    
    public Vegetable(String name, double weight, String color, boolean maturity, boolean condition, boolean peelled) {
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

        Vegetable potato = new Vegetable("картофель", 2.00, "white", true, true, false);
        System.out.println(potato);
        potato.Peell();
        System.out.println(potato);
        
        Vegetable carrot = new Vegetable("морковь", 1.00, "orange", true, true, false);
        System.out.println(carrot);
        carrot.Peell();
        System.out.println(carrot);  
        
        Vegetable celery = new Vegetable("сельдерей", 5.00, "green", false, true, false);
        System.out.println(celery);
        celery.Peell();
        System.out.println(celery);   
        
        Vegetable bow = new Vegetable("лук", 4.00, "red", true, false, false);
        System.out.println(bow);
        bow.Peell();
        System.out.println(bow);        
       // Vegetable[] trash = new Vegetable[4];


    }
}
