package com.sda.algorytmy;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Zosia");
        map.put(2, "Damian");
        map.put(3, "Pszemek");

        System.out.println(map);

        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println("Klucz: " + m.getKey());
            System.out.println("Wartość: " + m.getValue());
        }


        Map<String, List<String>> food = new HashMap<>();

        List<String> vegan = new ArrayList<>();
        vegan.add("JAJKA");
        vegan.add("SER");
        vegan.add("TOFU");

        List<String> halal = new ArrayList<>();
        halal.add("BARAN");
        halal.add("KURCZAK");
        halal.add("SALAMI");

        List<String> koszerne = new ArrayList<>();
        koszerne.add("MARCHEWKA");
        koszerne.add("CIASTKA");
        koszerne.add("HUMUS");

        food.put("vegan", vegan);
        food.put("halal", halal);
        food.put("koszerne", koszerne);

        System.out.println(food);

        for (Map.Entry<String, List<String>> m : food.entrySet()) {
            System.out.println(m.getKey());
            List<String> values = food.get(m.getKey());
            for (String val : values)
                System.out.println("-" + val);
        }


        Map<Student, List<List<String>>> foodMenu = new HashMap<>();
        Student student1 = new Student("Zosia", "Kowalska", 1);
        Student student2 = new Student("Damian", "Kowalski", 1);
        Student student3 = new Student("Pszemek", "Kowalski", 1);

        List<List<String>> dni = new ArrayList<>();
        List<String> daniaPoniedzialek = new ArrayList<>();

        daniaPoniedzialek.add("JAJKA");
        daniaPoniedzialek.add("MAKARON");
        daniaPoniedzialek.add("RYBA");

        dni.add(daniaPoniedzialek); // dania na poniedziałek

        List<String> daniaWtorek = new ArrayList<>();
        daniaWtorek.add("JAJKA 2");
        daniaWtorek.add("MAKARON 2");
        daniaWtorek.add("RYBA 2");

        dni.add(daniaWtorek); // dania na wtorek

        foodMenu.put(student1, dni);

        for (Map.Entry<Student, List<List<String>>> mapData : foodMenu.entrySet()) {

            Student key = mapData.getKey();
            List<List<String>> dataList = foodMenu.get(key);
            System.out.println("Imie:" + key.getName() + " nazwisko: " + key.getLastname());
            for (List<String> list : dataList)
                for(String str: list){
                    System.out.println(str);
                }
            System.out.println("=========");
        }
    }
}
