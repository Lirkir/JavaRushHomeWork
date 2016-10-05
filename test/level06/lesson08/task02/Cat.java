package com.javarush.test.level06.lesson08.task02;

/* Статические методы: int getCatCount() и setCatCount(int)
Добавить  к классу Cat два статических метода: int getCatCount() и setCatCount(int), с помощью которых можно получить/изменить количество котов (переменную catCount)
*/

import com.javarush.test.level05.lesson12.home03.Solution;

public class Cat
{
    private static int catCount = 0;

    public Cat()
    {
        catCount++;
    }

    public static int getCatCount()
    {
        //напишите тут ваш код
        return catCount;

    }

    public static void setCatCount(int catCount)
    {
        //напишите тут ваш код
        Cat.catCount = catCount;

    }
}
