/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hometask2;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class Tor {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
        System.out.println("давайте расчитаем объем или площадь поверхности тороида))");
	System.out.println("если хотите узнать объем тороида - введите цифру 1");
	System.out.println("если хотите узнать площадь поверхности тороида - введите любую другую цифру");
	
        int choice = 0;
	choice += sc.nextInt();
	
        if(choice == 1) {
            
            Scanner ns = new Scanner(System.in);
            System.out.println("введите расстояние от центра образующей окружности до оси вращения: ");
            double dist = 0;
            dist += ns.nextDouble();
            System.out.println("введите диаметр образующей окружности: ");
            double diam = 0;
            diam += ns.nextDouble();
            double pi = 3.14;
            double val = 2 * (pi * pi) * dist * ((diam / 2) * (diam / 2));
            System.out.println("объем тороида равен: " + val);
	
        }else{
            
            Scanner ns = new Scanner(System.in);
            System.out.println("введите расстояние от центра образующей окружности до оси вращения: ");
            double dist = 0;
            dist += ns.nextDouble();
            System.out.println("введите диаметр образующей окружности: ");
            double diam = 0;
            diam += ns.nextDouble();
            double pi = 3.14;
            double square = 4 * (pi * pi) * dist * (diam / 2);
            System.out.println("площадь поверхности тороида равна: " + square);
        
        }

    }

}