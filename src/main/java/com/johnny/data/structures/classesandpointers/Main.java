package com.johnny.data.structures.classesandpointers;

public class Main {
    public static void main(String[] args) {
        Cookie cookieOne = new Cookie("Green");
        Cookie cookieTwo = new Cookie("Blue");

        cookieOne.setColor("Yellow");

        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());
    }
}
