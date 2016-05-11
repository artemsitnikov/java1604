/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hometask3;

/**
 *
 * @author Lenovo
 */
import java.util.Arrays;
import java.util.Scanner;


public class ShiftArr {
    public static void main(String[] args) {
        int [] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(arr) + " исходный массив");
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("введите число, на которое необходимо сдвинуть массив: ");
        System.out.println("   / для сдвига влево - положительное число.");
        System.out.println("   / для сдвига вправо - отрицательное число.");
        System.out.println("сделайте свой выбор: ");
        
        int shift;      // фактический сдвиг
        int push = 0;   // введенный в консоль желаемый сдвиг
        push += sc.nextInt();
        int [] tmp = new int [10];
        if (push > 0) {
            if (push > arr.length) {    // если введенное число больше длины массива то:
                shift = push % arr.length;  // делаем сдвиг на резульат деления по модулю 
            
                System.arraycopy(arr, shift, tmp, 0, arr.length - shift);
                System.arraycopy(arr, 0, tmp, arr.length - shift, shift);
                       
                System.out.print(Arrays.toString(tmp));

            }   
            if (push < arr.length) {
            
                System.arraycopy(arr, push, tmp, 0, arr.length - push);
                System.arraycopy(arr, 0, tmp, arr.length - push, push);
                       
                System.out.print(Arrays.toString(tmp));

            }
            if (push == 10) {
                System.out.print(Arrays.toString(arr));

            }
        }
        if (push == 0) {
                System.out.print(Arrays.toString(arr));

            }
        if (push < 0) {
            int sh = push - push - push;
            
            if (sh > arr.length) {
                shift = arr.length - (sh % arr.length);
                System.arraycopy(arr, shift, tmp, 0, arr.length - shift);
                System.arraycopy(arr, 0, tmp, arr.length - shift, shift);
                       
                System.out.print(Arrays.toString(tmp));
            
            }
         
            if (sh < arr.length) {
                shift = arr.length - sh;
                System.arraycopy(arr, shift, tmp, 0, arr.length - shift);
                System.arraycopy(arr, 0, tmp, arr.length - shift, shift);
                       
                System.out.print(Arrays.toString(tmp));

            }
            if (push == -10) {
                System.out.print(Arrays.toString(arr));

            }
        }
        System.out.println(" результат сдвига на " + push);
    }
}