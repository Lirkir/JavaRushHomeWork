package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tnum1 = reader.readLine();
        String tnum2 = reader.readLine();
        String tnum3 = reader.readLine();
        int num1 = Integer.parseInt(tnum1);
        int num2 = Integer.parseInt(tnum2);
        int num3 = Integer.parseInt(tnum3);

        if (num1 < num2 && num1 > num3 || num1 > num2 && num1 < num3)
            System.out.println(num1);
        else if (num2 < num1 && num2 > num3 || num2 > num1 && num2 < num3)
            System.out.println(num2);
        else if (num3 < num1 && num3 > num2 || num3 > num1 && num3 < num2)
            System.out.println(num3);
    }
}
