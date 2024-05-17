package com.johnny.data.structures.classesandpointers;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        cookieStuff();
        pointerStuff();
    }

    private static void pointerStuff() {
        // Not working with a pointer
        int num1 = 11;
        int num2 = num1;
        num1 = 22;
        System.out.println("num1: " +num1);
        System.out.println("num2: " +num2);

        // Working with a pointer
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value", 11);
        map2 = map1;

        map1.put("value", 22);

        System.out.println(map1);
        System.out.println(map2);
    }

    private static void cookieStuff(){
        Cookie cookieOne = new Cookie("Green");
        Cookie cookieTwo = new Cookie("Blue");
        cookieOne.setColor("Yellow");
        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());
    }
}
