package com.learning;

// Short Hand If Else 
/*
Short hand if else atau biasa disebut ternary operator digunakan untuk mempersingkat penulisan if else dengan hanya
menggunakan satu buah kondisi saja.

Syntax: 
    variable = (condition) ? expressionTrue : expressionFalse;
*/

public class ShortHandIfElse {
    public static void main(String[] args) {
        System.out.println("Apakah 99 merupakan bilangan genap?");

        int angka = 99;
        String result = (99 % 2 == 0) ? "Benar" : "Salah";

        System.out.println("Output: " + result);
    }
}
