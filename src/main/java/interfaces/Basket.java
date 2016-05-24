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

import java.util.Arrays;
public class Basket extends Vegetable {
    @Override
    public String toString(){
        return name + weight + color + maturity + condition + peelled;
    }
    public Basket(String name, double weight, String color, boolean maturity, boolean condition, boolean peelled) {
        super(name, weight, color, maturity, condition, peelled);
    }
    public static void main(String[] args) {
        System.out.print(apple);// попробовать создать enum

        Basket[] basket = new Basket[10];
        System.out.println(Arrays.toString(basket));
        //basket[0] = new ();
        }


    }
    

