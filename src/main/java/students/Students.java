/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

/**
 *
 * @author Lenovo
 */
interface Scholarship {
    public double GetShip();
}

public class Students implements Scholarship {
    @Override
    public double GetShip() {
        if(male == "female"){
            ship = average * 850;
        }
        if(male == "male") {
            if(average <= 3){
                ship = 0;
            }
            if(average > 3) {
                ship = 4000;
            }
        }
        System.out.println("student gets scholarship equals: " + ship + "$");
        System.out.println();
        return ship;
    }
    public String name; //имя
    public String male; //гендер
    public int group; //группа
    public double average; //средний балл
    public double ship; //стипендия
    
    public Students() {
    }
    
    public Students(String name, String male, int group, double average, double ship) {
        this.name = name;
        this.male = male;
        this.group = group;
        this.average = average;
        this.ship = ship;
    }
    
    @Override
    public String toString() {
        return "name: " + name + "; male: " + male + "; group: " + group + "; average: " + average;// + "; ship: " + ship + "$;";
    }
    
    public static void main(String[] args){
        Students id1 = new Students("Katya", "female", 1, 3.5, 0);
        System.out.println(id1);
        id1.GetShip();
        
        Students id2 = new Students("Masha", "female", 1, 4.1, 0);
        System.out.println(id2);
        id2.GetShip();
        
        Students id3 = new Students("Kolya", "male", 1, 3, 0);
        System.out.println(id3);
        id3.GetShip();
        
        Students id4 = new Students("Artyom", "male", 1, 3.5, 0);
        System.out.println(id4);
        id4.GetShip();

        
    }
}
