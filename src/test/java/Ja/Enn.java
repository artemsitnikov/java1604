/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ja;

/**
 *
 * @author Lenovo
 */
enum Apple {

    Jonathan(10), GoldenDel(12), FuckinDel(21), GovnoProduction(1);
        private double price;
        
        Apple(double p){price = p;}
        double getPrice(){return price;}
}

public class Enn {
    public static void main(String[] args) {


        Apple ap;
        System.out.println("яблоки fuckindell стоят " + Apple.Jonathan.getPrice());
//        ap = Apple.Jonathan;
//        
//        Apple allapples[] = Apple.values();
//        for (Apple a : allapples)
//        System.out.println(a);
        
       
//    }
//    Apple ap;
//    ap = Apple.FuckinDel;
    }
}