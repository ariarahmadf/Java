package com.learning;

// Math 

// Math merupakan class build in yang ada di java yang berisikan banyak method untuk melakukan mathematical task

public class Main {
    public static void main(String[] args) {
        int a = 64; 
        int b = 30;

        System.out.println("A = " + a);
        System.out.println("B = " + b + "\n");

        // max 
        System.out.println("Max\t: " + Math.max(a, b)); // 64

        // min 
        System.out.println("Min\t: " + Math.min(a, b)); // 30
        
        // sqrt 
        System.out.println("Sqrt\t: " + (int) Math.sqrt(a)); // 8 -> setelah di cast

        // abs
        System.out.println("Abs\t: " + Math.abs(-3.44)); // 3.44

        // random 
        System.out.println("Random\t: " + Math.random()); 
        // System.out.println((int) Math.random() * 101); random number menggunakan range hingga 100 dan bertipe integer
    }
}
