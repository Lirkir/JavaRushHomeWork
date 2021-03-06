package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++){
            String s = reader.readLine();
            list.add(s);
        }

        int max_length = 0;
        int t_length;
        for (int i = 0; i < list.size(); i++){
            t_length = list.get(i).length();
            if (t_length > max_length){
                max_length = t_length;
            }
        }
        for (int i = 0; i < list.size(); i++){
            t_length = list.get(i).length();
            if (t_length == max_length){
                System.out.println(list.get(i));
            }
        }
    }
}