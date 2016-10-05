package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);

        //напишите тут ваш код
        Dog SnoopyDog = new Dog("Snoopy", 10, 4);
        Cat TomCat = new Cat("Tom", "high", 8);
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //добавьте тут ваши классы
    public static class Dog{
        String name;
        int angryLevel;
        int tail;

        public Dog(String name, int angryLevel, int tail){
            this.name = name;
            this.angryLevel = angryLevel;
            this.tail = tail;
        }

    }
    public static class Cat{
        String name;
        String loserLevel;
        int tail;

        public Cat(String name, String loserLevel, int tail){
            this.name = name;
            this.loserLevel = loserLevel;
            this.tail = tail;
        }
    }

}
