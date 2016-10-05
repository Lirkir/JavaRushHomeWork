package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/
// Kirill Nikolaev

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String ta = reader.readLine();
        String tb = reader.readLine();
        String tc = reader.readLine();
        int a = Integer.parseInt(ta);
        int b = Integer.parseInt(tb);
        int c = Integer.parseInt(tc);

        if (a > b && a > c)
            System.out.println(a);
        else if (b > c && b > a)
            System.out.println(b);
        else
            System.out.println(c);

        if (a > b && a < c || a > c && a < b)
            System.out.println(a);
        else if (b > a && b < c || b > c && b < a)
            System.out.println(b);
        else
            System.out.println(c);

        if (a < b && a < c)
            System.out.println(a);
        else if (b < c && b < a)
            System.out.println(b);
        else
            System.out.println(c);

    }
}
