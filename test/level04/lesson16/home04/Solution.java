package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String ty = reader.readLine();
        String tm = reader.readLine();
        String td = reader.readLine();
        int y = Integer.parseInt(ty);
        int m = Integer.parseInt(tm);
        int d = Integer.parseInt(td);

        System.out.println("Меня зовут " + name + "\nЯ родился " + d + "." + m + "." + y);
    }
}