package org.example;

public class Main {
    public static void main(String[] args) {
        int ring = 16;
        if (ring % 2 == 0) {
            System.out.println("Этот размер есть в наличие");
        } else {
            throw new ArithmeticException("Такого размера нет в даной линейке") {
            };
        }
        isDigit();
    }

    public static void isDigit() {
        String sentence1 = "OUGLIGI";
        char[] charArray = sentence1.toCharArray();
        try {
            for (char c : charArray) {
                if (Character.isDigit(c)) {
                    throw new IllegalArgumentException("Цифры есть");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Цифр нет");
    }
}




