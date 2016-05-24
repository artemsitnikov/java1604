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
    
    public static void main(String[] args) {

        Fruit[] basket = new Fruit[5];
        basket [0] = apple;
        }

    public Basket(double weight, String color, boolean maturity, boolean condition, boolean peelled) {
        super(weight, color, maturity, condition, peelled);
    }
    }

