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
public class Plant implements Peellable {
    @Override
    public double Peell(){
        Plant.weight = Plant.weight * 0.95;        
        Plant.peelled = true;
        System.out.println(Plant.weight + " очищена? " + Plant.peelled);
        return Plant.weight;
    }
    public static double weight; // вес 
    public String color; // цвет
    public boolean maturity; // зрелость
    public boolean condition; // кондиция
    public static boolean peelled; // очищен или нет
    
    public Plant(){
    }
    public Plant(double weight, String color, boolean maturity, boolean condition, boolean peelled) {
        this.weight = weight;
        this.color = color;
        this.maturity = maturity;
        this.condition = condition;
        this.peelled = peelled;
    }
    
}

