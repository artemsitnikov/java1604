/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask2.cycles;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class Hundred {

    public static void main(String[] args) {

        // dec - десятки
        // unit - единицы

        Scanner sc = new Scanner(System.in);
	System.out.println("введите число от 0 до 99: ");
	int num = 0;
	num += sc.nextInt();
	int dec = num / 10;
	int unit = num %10;

	if(num == 29) {
            System.out.print("таков мой возраст))  - ");
	}
		
	if(num == 0) {
            System.out.println("ноль");
	}
	
        if(num >= 10 && num < 20) {
            switch(num) {
		case 19:{
                    System.out.println("девятнадцать");
		}break;
		case 18:{
                    System.out.println("восемнадцать");
		}break;
		case 17:{
                    System.out.println("семнадцать");
		}break;
		case 16:{
                    System.out.println("шестнадцать");
		}break;
		case 15:{
                    System.out.println("пятнадцать");
		}break;
		case 14:{
                    System.out.println("четырнадцать");
		}break;
		case 13:{
                    System.out.println("тринадцать");
		}break;
		case 12:{
                    System.out.println("двенадцать");
		}break;
		case 11:{
                    System.out.println("одиннадцать");
		}break;
		case 10:{
                    System.out.println("десять");
		}break;
            }
		
	}else{
            switch(dec){
		case 2:{
                    System.out.print("двадцать ");
		}break;
		case 3:{
                    System.out.print("тридцать ");
		}break;
		case 4:{
                    System.out.print("сорок ");
		}break;
		case 5:{
                    System.out.print("пятьдесят ");
		}break;
		case 6:{
                    System.out.print("шестьдесят ");
		}break;
		case 7:{
                    System.out.print("семьдесят ");
		}break;
		case 8:{
                    System.out.print("восемьдесят ");
		}break;
		case 9:{
                    System.out.print("девяносто ");
		}break;

            }

            switch(unit){
		case 1:{
                    System.out.println("один");
		}break;
		case 2:{
                    System.out.println("два");
		}break;
		case 3:{
                    System.out.println("три");
		}break;
		case 4:{
                    System.out.println("четыре");
		}break;
		case 5:{
                    System.out.println("пять");
		}break;
		case 6:{
                    System.out.println("шесть");
		}break;
		case 7:{
                    System.out.println("семь");
		}break;
		case 8:{
                    System.out.println("восемь");
		}break;
		case 9:{
                    System.out.println("девять");
		}break;
         
            }
	
        }
	
    }
    
}