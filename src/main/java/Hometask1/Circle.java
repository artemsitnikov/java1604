/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hometask1;

/**
 *
 * @author Lenovo
 */
public class Circle {
    public static void main(String[] args) {
    
        double pi = 3.14;	// значение Пи
	double radius = 32.02;		// задаем радиус, далее - внешний радиус кольца
	double length = 2 * pi * radius;	// вычисляем длину окружности
	double square = pi * (radius * radius);	// вычисляем площадь круга
	double radiusSecond = 27;		// задаем внутренний радиус кольца
	double squareRing = square - pi * (radiusSecond * radiusSecond);	// вычилсяем площадь кольца
		
	System.out.println("длина окружности с радиусом 32,02 см равна: " + length + " см.");
	System.out.println("площадь круга с радиусом 32,02 см равна: " + square + " см.кв.");
	System.out.println("площадь кольца с внешним радиусом 32,02 см");
	System.out.print("   и внутренним радиусом 27 см равна: " + squareRing + " см.кв.");
    }
}
