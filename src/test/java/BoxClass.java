/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
//class Box4Class {
//    long width;
//    long height;
//    long depth;
//}
import java.util.Scanner;
public class BoxClass {
    public static void main(String[] args) {
        Box4Class namedBox = new Box4Class();
        Box4Class namedBox2 = new Box4Class();
        Box4Class namedBox3 = new Box4Class();
        //int vol;
        
        System.out.println("введите размеры коробки");
        
        Scanner w = new Scanner (System.in);
        Scanner h = new Scanner (System.in);
        Scanner d = new Scanner (System.in);
        
        namedBox.width += w.nextInt();
        namedBox.height += h.nextInt();
        namedBox.depth += d.nextInt();   
        
        System.out.println("введите размеры второй коробки");
        
        Scanner w2 = new Scanner (System.in);
        Scanner h2 = new Scanner (System.in);
        Scanner d2 = new Scanner (System.in);
        
        namedBox2.width += w2.nextInt();
        namedBox2.height += h2.nextInt();
        namedBox2.depth += d2.nextInt();
        
        System.out.println("введите размеры третьей коробки");
        
        Scanner w3 = new Scanner (System.in);
        Scanner h3 = new Scanner (System.in);
        Scanner d3 = new Scanner (System.in);
        
        namedBox3.width += w3.nextInt();
        namedBox3.height += h3.nextInt();
        namedBox3.depth += d3.nextInt();
        
        //vol = namedBox.calculateVolume();
        namedBox.calculateVolume();
        namedBox2.calculateVolume();
        namedBox3.calculateVolume();
        //vol = namedBox.width * namedBox.height * namedBox.depth;
        //System.out.println("объем коробки "  + vol);
        
        //vol = namedBox2.calculateVolume();
        //vol = namedBox2.width * namedBox2.height * namedBox2.depth;
        //System.out.println("объем коробки " + vol);
    }
}