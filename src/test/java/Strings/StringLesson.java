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
public class StringLesson {
    public static void main(String[] args) {
        String e = "    thIS is A deMo of tHE geTcHars meThod.    ";
        System.out.println(e);
        String up = e.toUpperCase();
        System.out.println(up);
        String low = e.toLowerCase();
        System.out.println(low);
        String trm = up.trim();
        System.out.println(trm);
        StringBuffer tr = new StringBuffer(up);
        tr.reverse();
        System.out.println(tr);
//        e.toUpperCase();
//        System.out.println(e);
//        int start = 10;
//        int end = 14;
//        char buf[] = new char[14 - 10];
//        e.getChars(10, 14, buf, 0);
//        System.out.println(buf);
//        byte ascii[] = {60, 61, 62, 63, 64, 65};
//        String w = new String(ascii);
//        System.out.println(w);
//        char trys[] = {'q', 'w', 'e', 'r', 't', 'y'};
//        String s = new String(trys);
//        String c = new String(trys,2,4);
//        System.out.println(s);
//        System.out.println(c);
//        String b = "привет";
//        System.out.println(b);
//        String v = "hello";
//        System.out.println(b.length());
//        System.out.println("hello".length());
//        char f[] = {'J', 'a', 'v', 'a'};
//        String t1 = new String(f);
//        String t2 = new String(t1);
        
//        System.out.println(t1);
//        System.out.println(t2);
        
    }

}
