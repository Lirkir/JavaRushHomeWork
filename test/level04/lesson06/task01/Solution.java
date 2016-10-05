package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String ta = reader.readLine();
        String tb = reader.readLine();
        int a = Integer.parseInt(ta);
        int b = Integer.parseInt(tb);

        if (a < b)
            System.out.println(a);
        else
            System.out.println(b);

    }
}