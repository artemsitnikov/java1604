/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author Lenovo
 */
//import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class StringLesson {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        
        String e = "    thIS is A deMo of tHE geTcHars meThod.    ";
        System.out.println("this is original line:");
        System.out.println(e);
        
        do {
            System.out.println("to change line to UpperCase - tap 'Upper'");
            System.out.println("to change line to LowerCase - tap 'Lower'");
            System.out.println("to trim line - tap 'Trim'");
            System.out.println("to reverse line - tap 'Reverse'");
            System.out.println("to exit application - tap 'Stop'");
            str = br.readLine();
            str = str.trim();
            if(str.equals("Upper")){
                String up = e.toUpperCase();
                System.out.println(up);
            }else if(str.equals("Lower")){
                String low = e.toLowerCase();
                System.out.println(low);
            }else if(str.equals("Trim")){
                String trm = e.trim();
                System.out.println(trm);        
            }else if(str.equals("Reverse")){
                StringBuffer tr = new StringBuffer(e);
                tr.reverse();
                System.out.println(tr);
            }
        }while(!str.equals("Stop"));

        
    }

}
