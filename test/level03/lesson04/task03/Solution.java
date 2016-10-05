package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg0 = new Zerg();
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Zerg zerg6 = new Zerg();
        Zerg zerg7 = new Zerg();
        Zerg zerg8 = new Zerg();
        Zerg zerg9 = new Zerg();
        zerg0.name = "Zerg0";
        zerg1.name = "Zerg1";
        zerg2.name = "Zerg2";
        zerg3.name = "Zerg3";
        zerg4.name = "Zerg4";
        zerg5.name = "Zerg5";
        zerg6.name = "Zerg6";
        zerg7.name = "Zerg7";
        zerg8.name = "Zerg8";
        zerg9.name = "Zerg9";

        Protos protos0 = new Protos();
        Protos protos1 = new Protos();
        Protos protos2 = new Protos();
        Protos protos3 = new Protos();
        Protos protos4 = new Protos();
        protos0.name = "Protos0";
        protos1.name = "Protos1";
        protos2.name = "Protos2";
        protos3.name = "Protos3";
        protos4.name = "Protos4";

        Terran terran0 = new Terran();
        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        Terran terran5 = new Terran();
        Terran terran6 = new Terran();
        Terran terran7 = new Terran();
        Terran terran8 = new Terran();
        Terran terran9 = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        terran0.name = "Terran0";
        terran1.name = "Terran1";
        terran2.name = "Terran2";
        terran3.name = "Terran3";
        terran4.name = "Terran4";
        terran5.name = "Terran5";
        terran6.name = "Terran6";
        terran7.name = "Terran7";
        terran8.name = "Terran8";
        terran9.name = "Terran9";
        terran10.name = "Terran10";
        terran11.name = "Terran11";

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}