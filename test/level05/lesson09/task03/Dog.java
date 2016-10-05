package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    String name;
    String growth;
    String color;

    public Dog(String name, String growth, String color){
        this.name = name;
        this.growth = growth;
        this.color = color;
    }

    public Dog(String name)
    {
        this.name = name;
    }

    public Dog(String name, String growth)
    {
        this.name = name;
        this.growth = growth;
    }
}