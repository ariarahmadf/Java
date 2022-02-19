package com.learning;

// Do While Loop 

/*
Do while loop merupakan salah satu varian dari while, dimana blok kode akan dieksekusi minimal sekali dan selanjutnya 
akan dilakukan pengecekan kondisi. Jika kondisi bernilai true, maka looping ini akan terus dilakukan selama kondisi 
bernilai true.

Syntax: 
    do{
        // Block of code
    }
    while(condition);
*/

public class DoWhileLoop {
    public static void main(String[] args) {
        int iteration = 3; 
        do{
            System.out.println(iteration);
            iteration--;
        } 
        while(iteration != 0);
        System.out.println("Close The Door!");
    }
}

// Note: Jangan lupa melakukan increment atau decrement pada variable iteration.