package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //напишите тут ваш код
    String centerX;
    String centerY;
    String radius;
    String width;
    String color;

    public Circle(String centerX, String centerY, String radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Circle(String centerX, String centerY, String radius, String width){
        this.centerX =  centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public Circle(String centerX, String centerY, String radius, String width, String color){
        this.centerX =  centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

}
