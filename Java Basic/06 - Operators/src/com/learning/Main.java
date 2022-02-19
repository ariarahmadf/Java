package com.learning;

// Operators 
/*
    Operators umumnya digunakan untuk melakukan operasi terhadap dua buah nilai atau variable.
    Operators dibagi menjadi beberapa kelompok: 
        1. Arithmetic Operators (+, -, *, /, %, ++, --)
        2. Assigment Operators (+=, -=, *=, /= , %=, etc)
        3. Comparison Operators (<, >, <=, >=, ==, !=)
        4. Logical Operators (&&, ||, !)
        5. Bitwise Operators 
*/

public class Main {
    public static void main(String[] args) {
        // Inisialisasi variable 
        int a = 10;
        int b = 5;
        boolean c = true;
        boolean d = false;

        // Cetak nilai awalan variable
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d + "\n");
        // Contoh arithmetic operator
        int x = a + b;
        System.out.println("Hasil dari a + b = " + x); // Output 15

        // Contoh dari assigment operator 
        a -= 2;
        System.out.println("Hasil dari a - 2 = " + a); // Output 8
        a += 2; // menjadi 10 kembali

        // Contoh dari comparison operator 
        System.out.println("Apakah a > b = " + (a > b)); // Output true

        // Contoh dari logical operator
        System.out.println("Hasil dari c AND d = " + (c && d)); // Output false
    }
}
