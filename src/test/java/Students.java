/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
import java.util.Arrays;
public class Students {
    public static void main(String[] args) {
        
        Student id1 = new Student ("Sitnikov ", "Artem ", "Alexandrovich ", "1986-05-10 ", "Sumskaya 77-79 ", "0971000811 ", "hnure");
        Student id2 = new Student ("Maksimovich ", "Sergey ", "Olegovich ", "1984-08-24 ", "Akad.Pavlova 27A ", "0665010770 ", "hisi");
        Student id3 = new Student ("Pogalov ", "Alexandr ", "Sergeevich ", "1986-04-14 ", "Minskaya 5 ", "0666405699 ", "ped");
        
        System.out.println("напечатать студента 1 или 2 или 3 или всех - 0?");
//        Scanner c = new Scanner (System.in);
//        byte ch = c.nextByte();
//        
//        if (ch == 1) {
//            id1.printlist();
//        }
//        if (ch == 2) {
//            id2.printlist();
//        }
//        if (ch == 3) {
//            id3.printlist();
//        }
//        if (ch == 0) {
            id1.printlist();
            id2.printlist();
            id3.printlist();
//        }
//        String Studs[] = {id1.printlist, "id2", "id3"};
//        System.out.println(Arrays.toString(Studs));
//        
//        
    }
}
