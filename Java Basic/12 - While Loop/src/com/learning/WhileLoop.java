package com.learning;

// While Loop 

/*
While loop digunakan untuk mengeksekusi blok kode hingga berulang kali,  jika kondisi tertentu masih terpenuhi.

Syntax: 
    while(){
        // block of code 
    }
*/
public class WhileLoop {
    public static void main(String[] args) {
        int iteration = 1; 
        while (iteration < 9) {
            System.out.println(iteration);
            iteration++;
        }
        System.out.println("Berhenti! Ganti gerakan senam.");
    }
}

// Note: Jangan lupa melakukan increment atau decrement pada variable iteration.
