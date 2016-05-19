/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author Lenovo
 */
public class UseTrim {
    public static void main(String[] args) throws IOException {
    //    throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str;
            System.out.println("Enter 'stop' to quit.");
            System.out.println("Enter State");
            
            do {
                str = br.readLine();
                str = str.trim();
                
                if(str.equals("Illinois"))
                    System.out.println("Capital is Springfield.");
                else if(str.equals("Missouri"))
                    System.out.println("Capital is Jefferson city.");
                else if(str.equals("California"))
                    System.out.println("Capital is Sacramento.");
                else if(str.equals("Washington"))
                    System.out.println("Capital is Olympia.");
                
            } while(!str.equals("xare"));
            
        }
    //}
}
