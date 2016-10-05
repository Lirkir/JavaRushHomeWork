package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    String name;
    String growth;
    String color;

    //напишите тут ваш код
    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, String growth){
        this.name = name;
        this.growth = growth;
    }
    public void initialize(String name, String growth, String color){
        this.name = name;
        this.growth = growth;
        this.color = color;
    }
}
