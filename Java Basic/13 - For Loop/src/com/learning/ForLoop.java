package com.learning;

// For Loop

/*
For loop digunakan ketika kita mengetahui jumlah iterasi perulangan yang harus dilakukan.

Syntax: 
    for(statement1; statement2; statement3){
        // Block Of Code 
    }

Keterangan: 
    - Statement 1 dieksekusi hanya sekali ketika sebelum mengeksekusi blok kode.
    - Statment 2 beris kondisi perulangan yang akan dilakukan.
    - Statment 3 akan selalu dieksekusi setelah mengekeskusi blok kode paling akhir.
*/

public class ForLoop {
    public static void main(String[] args) {
        for(var i = 10; i > 0; i--){
            System.out.println(i);
        }
        System.out.println("Roket telah diluncurkan!");
    }
}
