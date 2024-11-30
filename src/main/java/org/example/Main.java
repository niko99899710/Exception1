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
        System.out.println(isNumber("88"));
    }

    public static String isNumber(String sentence1) {
        try {
            Integer.parseInt(sentence1);
            return "Цифры есть";
        } catch (NumberFormatException e) {
            return "Цифр нет";
        }
   }
}




