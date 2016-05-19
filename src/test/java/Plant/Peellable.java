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
public interface Peellable {

    //
    public static double Peell() {
//        double peelledweight;
        
        Plant.weight = Plant.weight - (Plant.weight * 0.05);        
//        peelledweight = Plant.weight - (Plant.weight * 0.05);
        Plant.peelled = true;
        System.out.println(Plant.weight + " очищена? " + Plant.peelled);
        return Plant.weight;
        

    }
}
