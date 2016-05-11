/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class Box4Class {
    long width;
    long height;
    long depth;
    
    void calculateVolume() {
        System.out.print("размер коробки " + width + "/" + height + "/" + depth + " равен: ");
        System.out.println(width * height * depth);
    }
    
    //long calculateVolume() {
    //    return width * height * depth;
    //}
        
}
