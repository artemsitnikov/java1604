/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask1.basictypes;

/**
 *
 * @author Lenovo
 */
public class Cylinder {
    public static void main(String[] args) {
        
        System.out.println(" _________________________________________________________");
	System.out.println("| рассмортим цилиндр диаметром 64,04 см и высотой 88,5 см |");
	System.out.println("| и полый цилиндр - трубу высотой 27 см,                  |");
	System.out.println("| внешним диаметром 64,04 см и внутренним диаметром 54 см |");
		
	double pi = 3.14;
	double radius = 32.02;
	double radiusSecond = 27;
	double height = 88.50;

	double volCylinder =  pi * (radius * radius) * height;			// объем цилиндра
	double volInsideTube = pi * (radiusSecond * radiusSecond) * height;	// внутр.объем трубы
	double pipeVol = volCylinder - volInsideTube;				// объем, замещаемый трубой
	double squareCyl = 2 * pi * radius * height;				// площадь боковой поверхности

	System.out.println("|_________________________________________________________|");
	System.out.println(" ");
	System.out.println("в результате простых математических вычислений получим:");
	System.out.println("объем цилиндра: " + volCylinder + " см.куб.");
	System.out.println("объем внутри трубы: " + volInsideTube + " см.куб.");
	System.out.println("объем, занимаемый телом самой трубы: " + pipeVol + " см.куб.");
	System.out.println("площадь боковой поверхности цилиндра: " + squareCyl + " см.кв.");
    
    }

}
